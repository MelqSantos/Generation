create database db_escola;

use db_escola;

drop table tb_aluno;

create table tb_aluno(
	id bigint(10) auto_increment,
    nome varchar(50),
    curso varchar(50),
    turma varchar(15),
	media decimal(3,1),
    primary key (id)
);

insert into tb_aluno (nome, curso, turma, media) values
("Francisco", "Desenvolvimento de sistemas", "Turma 39", 5.9),
("João", "Economia", "Turma 29", 7.9),
("Pedro", "Farmácia", "Turma 19", 4.9),
("Maurício", "Sistemas de informação", "Turma 49", 9.9),
("Lucas", "Matemática", "Turma 18", 2.9),
("Maria", "Arquitetura", "Turma 59", 7.5),
("Leticia", "Farmácia", "Turma 19", 5.9),
("Jéssica", "Direito", "Turma 35", 7.2);

select * from tb_aluno where media > 7;

select * from tb_aluno where media < 7;

update tb_aluno set media = 9 where id = 7;