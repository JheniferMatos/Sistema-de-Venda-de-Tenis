package model.dao;

import connection.ConnectionDataBase;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Funcionario;
import model.bean.Telefone;

public class FuncionarioDAO {
    public Funcionario buscaFuncionarioPorVenda(int codigoVenda){
        Funcionario f;
        int nCodigo = 0;
        String nUsuario = "";
        String nSenha = "";
        String nNome = "";
        String nCpf = "";
        String nEmail = "";
        ArrayList<Telefone> nTelefones = null;
        boolean nAdministrador = false;
        boolean nAtivo = false;
                
        Connection con = ConnectionDataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String strSql = "select fun.FUN_COD, fun.FUN_USUARIO, fun.FUN_SENHA, fun.FUN_NOME, ";
        strSql += "fun.FUN_CPF, fun.fun_email, fun.FUN_ADMINISTRADOR ";   
        strSql += "from fun_funcionario fun inner join ven_venda ven on ven.VEN_FUNCIONARIO = fun.fun_cod ";
        strSql += "where ven.VEN_COD = ?;";
        try {
            stmt = con.prepareStatement(strSql);
            stmt.setString(1, Integer.toString(codigoVenda));
            rs = stmt.executeQuery();
            
            while(rs.next()){
                nCodigo = rs.getInt("FUN_COD");
                nUsuario = rs.getString("FUN_USUARIO");
                nSenha = rs.getString("FUN_SENHA");
                nNome = rs.getString("FUN_NOME");
                nCpf = rs.getString("FUN_CPF");
                nEmail = rs.getString("fun_email");    
                nAdministrador = rs.getInt("FUN_ADMINISTRADOR") == 1;
                
                TelefoneDAO tDAO = new TelefoneDAO();
                nTelefones = tDAO.buscarTelefonesFuncionarios(nCodigo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionDataBase.closeConnection(con, stmt, rs);
        }
        
        f = new Funcionario(nCodigo, nUsuario, nSenha, nNome, nCpf, nEmail, nAdministrador);
        f.setTelefones(nTelefones);
        return f;
    }
    
    public Funcionario buscaFuncionarioCod(int Cod){
        Funcionario f;
        int nCodigo = 0;
        String nUsuario = "";
        String nSenha = "";
        String nNome = "";
        String nCpf = "";
        String nEmail = "";
        ArrayList<Telefone> nTelefones = null;
        boolean nAdministrador = false;
        boolean nAtivo = false;
                
        Connection con = ConnectionDataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String strSql = "SELECT * FROM fun_funcionario WHERE fun_cod = ?";
        try {
            stmt = con.prepareStatement(strSql);
            stmt.setString(1, Integer.toString(Cod));
            rs = stmt.executeQuery();
            
            while(rs.next()){
                nCodigo = rs.getInt("FUN_COD");
                nUsuario = rs.getString("FUN_USUARIO");
                nSenha = rs.getString("FUN_SENHA");
                nNome = rs.getString("FUN_NOME");
                nCpf = rs.getString("FUN_CPF");
                nEmail = rs.getString("fun_email");    
                
                TelefoneDAO tDAO = new TelefoneDAO();
                nTelefones = tDAO.buscarTelefonesFuncionarios(nCodigo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionDataBase.closeConnection(con, stmt, rs);
        }
        
        f = new Funcionario(nCodigo, nUsuario, nSenha, nNome, nCpf, nEmail, nAdministrador);
        f.setTelefones(nTelefones);
        return f;
    }
    
    public List<Funcionario> buscaFuncionarios(){
        Connection con = ConnectionDataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM fun_funcionario ORDER BY fun_nome ASC");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionario f = new Funcionario();
                
                f.setCod(rs.getInt("fun_cod"));
                f.setUsuario(rs.getString("fun_usuario"));
                f.setSenha(rs.getString("fun_senha"));
                f.setNome(rs.getString("fun_nome"));
                f.setCpf(rs.getString("fun_cpf"));
                f.setEmail(rs.getString("fun_email"));
                f.setAdministrador(rs.getBoolean("fun_administrador"));
                
                funcionarios.add(f);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionDataBase.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    
    public void inserirCliente(Funcionario funcionario){
    }
    
    public void alterarCliente(Funcionario funcionario){

    }
    
    public void excluirCliente(int ven_cod){
    }
}
