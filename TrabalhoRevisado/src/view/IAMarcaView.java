/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.bean.Marca;
import controller.Controller;

/**
 *
 * @author fonte
 */
public class IAMarcaView extends javax.swing.JFrame {

    private Controller controller;
    private Marca marca;
    
    public IAMarcaView(){
        initComponents();
    }
    
    public IAMarcaView(Controller controller) {
        initComponents();
        this.controller = controller;
        this.marca = null;
    }
    
    public void SetMarca(Marca marca){
        this.marca = marca;
        tituloL.setText("Alterar marca");
        nome.setText(marca.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        titulo = new javax.swing.JPanel();
        tituloL = new javax.swing.JLabel();
        corpo = new javax.swing.JPanel();
        campoNome = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        op = new javax.swing.JPanel();
        confirmar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cancelar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(165, 87, 85));

        titulo.setBackground(new java.awt.Color(172, 88, 88));

        tituloL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tituloL.setForeground(new java.awt.Color(255, 255, 255));
        tituloL.setText("Nova Marca");

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloL, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloL, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        javax.swing.GroupLayout campoNomeLayout = new javax.swing.GroupLayout(campoNome);
        campoNome.setLayout(campoNomeLayout);
        campoNomeLayout.setHorizontalGroup(
            campoNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoNomeLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(campoNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        campoNomeLayout.setVerticalGroup(
            campoNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, campoNomeLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        op.setBackground(new java.awt.Color(127, 77, 76));

        confirmar.setBackground(new java.awt.Color(101, 61, 60));
        confirmar.setAlignmentX(0.0F);
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar");

        javax.swing.GroupLayout confirmarLayout = new javax.swing.GroupLayout(confirmar);
        confirmar.setLayout(confirmarLayout);
        confirmarLayout.setHorizontalGroup(
            confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );
        confirmarLayout.setVerticalGroup(
            confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelar.setBackground(new java.awt.Color(101, 61, 60));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cancelar");

        javax.swing.GroupLayout cancelarLayout = new javax.swing.GroupLayout(cancelar);
        cancelar.setLayout(cancelarLayout);
        cancelarLayout.setHorizontalGroup(
            cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );
        cancelarLayout.setVerticalGroup(
            cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout opLayout = new javax.swing.GroupLayout(op);
        op.setLayout(opLayout);
        opLayout.setHorizontalGroup(
            opLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        opLayout.setVerticalGroup(
            opLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout corpoLayout = new javax.swing.GroupLayout(corpo);
        corpo.setLayout(corpoLayout);
        corpoLayout.setHorizontalGroup(
            corpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpoLayout.createSequentialGroup()
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        corpoLayout.setVerticalGroup(
            corpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(corpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked

        if(this.marca == null){
            if(nome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Informe um nome!");
            }
            else{
                marca = new Marca();
                marca.setNome(nome.getText());
                controller.InserirMarca(marca);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                TabelaMarcaView frame = new TabelaMarcaView(controller);
                frame.setVisible(true);
                IAMarcaView.this.dispose();
            }
        }
        else{
            Object[] options = {"Sim", "Não"};
            
            if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja alterar?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 0){
                marca.setNome(nome.getText());
                controller.AlteraMarca(marca);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                TabelaMarcaView frame = new TabelaMarcaView(controller);
                frame.setVisible(true);
                IAMarcaView.this.dispose();
            }
        }
    }//GEN-LAST:event_confirmarMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        TabelaMarcaView frame = new TabelaMarcaView(controller);
        frame.setVisible(true);
        IAMarcaView.this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IAMarcaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAMarcaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAMarcaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAMarcaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAMarcaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel campoNome;
    private javax.swing.JPanel cancelar;
    private javax.swing.JPanel confirmar;
    private javax.swing.JPanel container;
    private javax.swing.JPanel corpo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JPanel op;
    private javax.swing.JPanel titulo;
    private javax.swing.JLabel tituloL;
    // End of variables declaration//GEN-END:variables
}
