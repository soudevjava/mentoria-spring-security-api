DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    data_de_criacao DATETIME NOT NULL,
    estado BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS papeis;

CREATE TABLE papeis (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL UNIQUE,
    data_de_criacao DATETIME NOT NULL,
    estado BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS permissoes;

CREATE TABLE permissoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL UNIQUE,
    data_de_criacao DATETIME NOT NULL,
    estado BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS usuario_papeis;

CREATE TABLE usuario_papeis (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    papel_id BIGINT NOT NULL,
    data_de_criacao DATETIME NOT NULL,
    estado BOOLEAN NOT NULL,
    CONSTRAINT fk_usuario_papeis_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    CONSTRAINT fk_usuario_papeis_papel_id FOREIGN KEY (papel_id) REFERENCES papeis(id)
);

DROP TABLE IF EXISTS papel_permissoes;

CREATE TABLE papel_permissoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    papel_id BIGINT NOT NULL,
    permissao_id BIGINT NOT NULL,
    data_de_criacao DATETIME NOT NULL,
    estado BOOLEAN NOT NULL,
    CONSTRAINT fk_papel_permissoes_papel_id FOREIGN KEY (papel_id) REFERENCES papeis(id),
    CONSTRAINT fk_papel_permissoes_permissao_id FOREIGN KEY (permissao_id) REFERENCES permissoes(id)
);




