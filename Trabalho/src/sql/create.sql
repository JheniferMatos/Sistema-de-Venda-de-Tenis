//loja_tenis

CREATE TABLE MAR_MARCA (
MAR_COD INT AUTO_INCREMENT PRIMARY KEY,
MAR_NOME VARCHAR(20) NOT NULL);

CREATE TABLE MTE_MODELO_TENIS (
MTE_COD INT AUTO_INCREMENT NOT NULL,
MTE_DESCRICAO VARCHAR(30) NOT NULL,
MTE_MARCA INT NOT NULL ,
MTE_PRECO FLOAT NOT NULL,
PRIMARY KEY (MTE_COD),
FOREIGN KEY (MTE_MARCA) REFERENCES MAR_MARCA(MAR_COD));

CREATE TABLE CLI_CLIENTE (
CLI_COD INT AUTO_INCREMENT NOT NULL,
CLI_NOME VARCHAR(50) NOT NULL,
CLI_CPF VARCHAR(14) NOT NULL,
CLI_LOGRADOURO VARCHAR(30),
CLI_NUMERO INT,
CLI_CIDADE VARCHAR(30),
CLI_ESTADO VARCHAR(2),
CLI_BAIRRO VARCHAR(20),
CLI_CEP VARCHAR(9),
CLI_EMAIL VARCHAR (30),
PRIMARY KEY (CLI_COD));

CREATE TABLE FUN_FUNCIONARIO (
FUN_COD INT AUTO_INCREMENT NOT NULL,
FUN_USUARIO VARCHAR(20) NOT NULL,
FUN_SENHA VARCHAR(20) NOT NULL,
FUN_NOME VARCHAR(50) NOT NULL,
FUN_CPF VARCHAR(14) NOT NULL,
FUN_EMAIL VARCHAR(30) NOT NULL,
FUN_ADMINISTRADOR INT NOT NULL,
UNIQUE KEY(FUN_USUARIO),
PRIMARY KEY (FUN_COD));

CREATE TABLE VEN_VENDA (
VEN_COD INT AUTO_INCREMENT NOT NULL,
VEN_CLIENTE INT NOT NULL,
VEN_FUNCIONARIO INT NOT NULL,
VEN_DATA_HORA DATETIME NOT NULL,
PRIMARY KEY (VEN_COD),
FOREIGN KEY (VEN_CLIENTE) REFERENCES CLI_CLIENTE(CLI_COD),
FOREIGN KEY (VEN_FUNCIONARIO) REFERENCES FUN_FUNCIONARIO(FUN_COD));

CREATE TABLE MVE_MODELO_VENDIDO (
MVE_VENDA INT NOT NULL,
MVE_MODELO INT NOT NULL,
MVE_QUANTIDADE INT NOT NULL,
PRIMARY KEY (MVE_VENDA, MVE_MODELO),
FOREIGN KEY (MVE_VENDA) REFERENCES VEN_VENDA(VEN_COD),
FOREIGN KEY (MVE_MODELO) REFERENCES MTE_MODELO_TENIS(MTE_COD));
