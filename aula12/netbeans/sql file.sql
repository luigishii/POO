create database 20221_maua_poo_turmaA_sistema_academico;

use 20221_maua_poo_turmaA_sistema_academico;

create table tb_usuario(
	cod_usuario int primary key auto_increment,
    nome varchar(200) not null,
    senha varchar(200) not null);
    
insert into tb_usuario(nome,senha) values ('admin','admin');
select * from tb_usuario;
    