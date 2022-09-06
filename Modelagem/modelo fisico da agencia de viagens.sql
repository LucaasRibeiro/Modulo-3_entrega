CREATE DATABASE Viagenslr;

USE Viagenslr;


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

CREATE TABLE Permissoes (
    id_permissoes INTEGER PRIMARY KEY auto_increment,
    tipo_permissoes VARCHAR (20)
);


CREATE TABLE Voo (
    id_voo INTEGER PRIMARY KEY auto_increment,
    origem_voo VARCHAR (20),
    destino_voo VARCHAR (20),
    dataIda_voo DATE,
    dataVolta_voo DATE,
    id_passagens INTEGER
    );

CREATE TABLE Onibus (
    id_onibus INTEGER PRIMARY KEY auto_increment,
    origem_onibus VARCHAR (20),
    destino_onibus VARCHAR (30),
    dataIda_onibus DATE,
    dataVolta_onibus DATE,
    id_passagens INTEGER
);

CREATE TABLE Usuario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    login_usuario VARCHAR (20),
    senha_usuario VARCHAR (30),
	id_cliente INTEGER (30),
    FOREIGN KEY (id_cliente) REFERENCES Cliente (id_cliente),
    id_permissoes INTEGER (30),
    FOREIGN KEY (id_permissoes) REFERENCES Permissoes (id_permissoes)
);


CREATE TABLE Comprar (
    id_comprar INTEGER PRIMARY KEY auto_increment,
    tipo_comprar VARCHAR (20),
    valor_comprar DECIMAL(5,2),
    data_comprar DATE,
    id_usuario INTEGER (20),
	FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

CREATE TABLE Passagens (
    id_passagens INTEGER PRIMARY KEY auto_increment,
    aereas_passagens INTEGER (20),
    onibus_passagens INTEGER (20),
    id_voo INTEGER,
	FOREIGN KEY (id_voo) REFERENCES Voo (id_voo),
    id_onibus INTEGER,
	FOREIGN KEY (id_onibus) REFERENCES Onibus (id_onibus)
);


