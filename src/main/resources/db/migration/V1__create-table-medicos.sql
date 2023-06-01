create table medicos (
                         id bigint not null auto_increment,
                         nome varchar(100) not null,
                         email varchar(100) not null,
                         telefone varchar(30) not null,
                         crm varchar(6) not null unique,
                         especialidade varchar(100) not null,
                         logradouro varchar(100) not null,
                         bairro varchar(100) not null,
                         cep varchar(9) not null,
                         uf varchar(2) not null,
                         cidade varchar(100) not null,
                         numero varchar(20),
                         complemento varchar(150),
                         primary key (id)
);