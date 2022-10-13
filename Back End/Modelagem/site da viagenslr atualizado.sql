CREATE DATABASE viagens_lr;

USE viagens_lr;

CREATE TABLE Permissoes (
    id_permissao INTEGER PRIMARY KEY auto_increment,
    tipo_permissao VARCHAR(20)
);

CREATE TABLE Usuario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    nome_usuario VARCHAR(80),
    email_usuario VARCHAR(80),
    senha_usuario VARCHAR(10),
    id_permissao INTEGER, 
    FOREIGN KEY(id_permissao) REFERENCES Permissoes (id_permissao)
);

CREATE TABLE Compras (
    id_compra INTEGER PRIMARY KEY auto_increment,
    data_compra DATE,
    valor_compra DECIMAL (5,2),
    id_usuario INTEGER,
    FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

CREATE TABLE Itens_Compra (
    qtd_itens INTEGER,
    valor_itens DECIMAL(4.2),
    id_passagem INTEGER,
    FOREIGN KEY (id_passagem) REFERENCES Passagens (id_passagem),
    id_compra INTEGER,
	FOREIGN KEY (id_compra) REFERENCES Compras (id_compra)
);

CREATE TABLE Destinos (
    id_destino INTEGER PRIMARY KEY auto_increment,
    nome_destino VARCHAR(80)
);

CREATE TABLE Passagens (
    id_passagem INTEGER PRIMARY KEY auto_increment,
    nome_passagem VARCHAR(40),
    preco_passagem DECIMAL(4,2),
    data_passagem DATE,
    id_destino INTEGER,
    FOREIGN KEY (id_destino) REFERENCES Destinos (id_destino)
);

