create database db_rh;
use db_rh;

create table tb_funcionario(
	id bigint(5) auto_increment, 
    nome varchar(20) not null,
    cargo varchar(30) not null,
    salario decimal(10,2),
    ativo boolean,
    primary key(id)
);

insert into tb_funcionario (nome, cargo, salario, ativo)
values
("Melqui Santos","Dev Front-End Jr", 3500, true),
("Pedro Costa","Dev Full-Stack Sr", 6000, true),
("Johnatan Lima","Dev Front-End Pl", 4600, false),
("Bruna Souza","Dev Back-End Pl", 4600, true),
("Henrique Costa","Dev Back-End Jr", 3500, true);

select * from tb_funcionario where salario > 2000;
select * from tb_funcionario where salario < 2000;

update tb_funcionario set salario = 1500, cargo = "Estagiário" where id = 5;

