CREATE DATABASE bancoPDH;

use bancoPDH;

CREATE TABLE jogador(
	id VARCHAR(30) Unique primary key,
    nome VARCHAR(30),
    senha VARCHAR(40)
);
select * from jogador;