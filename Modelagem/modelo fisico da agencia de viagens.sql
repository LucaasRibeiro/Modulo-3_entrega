CREATE DATABASE viagenslr;

use viagenslr;

create table Clientes (
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

CREATE TABLE Usuarios (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    login_usuario VARCHAR (20),
    senha_usuario VARCHAR (30),
	id_cliente INTEGER (30),
    FOREIGN KEY (id_cliente) REFERENCES Clientes (id_cliente),
	id_permissao INTEGER (30),
    FOREIGN KEY (id_permissao) REFERENCES Permissoes (id_permissao)
);

CREATE TABLE Permissoes (
    id_permissao INTEGER PRIMARY KEY auto_increment,
    tipo_permissao VARCHAR (20)
);

CREATE TABLE Comprar (
    id_compra INTEGER PRIMARY KEY auto_increment,
    tipo_compra VARCHAR (20),
    valor_compra DECIMAL(5,2),
    data_compra DATE,
    id_usuario INTEGER (20),
	FOREIGN KEY (id_usuario) REFERENCES Usuarios (id_usuario)
);

CREATE TABLE Passagens (
    id_passagem INTEGER PRIMARY KEY auto_increment,
    aereas_passagem INTEGER (20),
    onibus_passagem INTEGER (20)
);

CREATE TABLE Voos (
    id_voo INTEGER PRIMARY KEY auto_increment,
    origem_voo VARCHAR (20),
    destino_voo VARCHAR (20),
    dataIda_voo DATE,
    dataVolta_voo DATE
);

CREATE TABLE Onibus (
    id_onibu INTEGER PRIMARY KEY auto_increment,
    origem_onibu VARCHAR (20),
    destino_onibu VARCHAR (30),
    dataIda_onibu DATE,
    dataVolta_onibu DATE
);