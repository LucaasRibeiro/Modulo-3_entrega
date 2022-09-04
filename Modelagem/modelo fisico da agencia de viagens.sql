CREATE DATABASE viagenslr

USE viagenslr


CREATE TABLE Cliente (
    id_cliente INTEGER PRIMARY KEY auto_increment,
    nome_cliente VARCHAR (30),
    cpf_cliente CHAR (20),
    rg_cliente CHAR (20),
    email_cliente VARCHAR (30),
    senha_cliente VARCHAR (30),
    telefone_cliente VARCHAR (20),
    rua_cliente VARCHAR (50),
    numero_cliente INTEGER (50),
    cep_cliente VARCHAR (30),
    bairro_cliente VARCHAR (30),
    cidade_cliente VARCHAR (30),
    estado_cliente VARCHAR (20),
    país_cliente VARCHAR (10)
    
);

CREATE TABLE Usúario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    login_usuario VARCHAR (20),
    senha_usuario VARCHAR (30),
	FOREIGN KEY (id_cliente) REFERENCES Cliente (id_cliente),
    id_cliente INTEGER (30),
    FOREIGN KEY (id_permissoes) REFERENCES Permissoes (id_permissoes),
    id_permissao INTEGER (30)
);

CREATE TABLE Permissoes (
    id_permissoes INTEGER PRIMARY KEY auto_increment,
    tipo_permissoes VARCHAR (20)
);

CREATE TABLE Comprar (
    id_compra INTEGER PRIMARY KEY auto_increment,
    tipo_compra VARCHAR (20),
    valor_compra DECIMAL(5,2)
    data_compra DATETIME (11),
    id_usuario INTEGER (20),
	FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

CREATE TABLE Passagens (
    id_passagens INTEGER PRIMARY KEY auto_increment,
    aereas_passagens INTEGER (20),
    onibus_passagens INTEGER (20),
	FOREIGN KEY (id_voo) REFERENCES Voo (id_voo),
    id_voo INTEGER,
	FOREIGN KEY (id_onibus) REFERENCES Onibus (id_onibus),
    id_onibus INTEGER
);

CREATE TABLE Voo (
    id_voo INTEGER PRIMARY KEY auto_increment,
    origem_voo VARCHAR (20),
    destino_voo VARCHAR (20),
    dataIda_voo DATETIME (30),
    dataVolta_voo DATETIME (30),
    id_passagens INTEGER
	FOREIGN KEY (id_passagens) REFERENCES Passagens (id_passagens)
);

CREATE TABLE Onibus (
    id_onibus INTEGER PRIMARY KEY auto_increment,
    origem_onibus VARCHAR (20),
    destino_onibus VARCHAR (30),
    dataIda_onibus DATETIME (30),
    dataVolta_onibus DATETIME (30),
    id_passagens INTEGER
	FOREIGN KEY (id_passagens) REFERENCES Passagens (id_passagens)
);


