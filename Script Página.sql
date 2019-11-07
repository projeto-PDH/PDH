create database PDH;
use PDH;

create table Usuario(
    nome varchar(30) not null,
    sobrenome varchar(30) not null,
    email varchar(30) not null,
    nomeUsuario varchar(30) not null,
    senha varchar(40) not null

);


select * from Usuario;