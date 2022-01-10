create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
	id_class int,
    descricao varchar(50),
    equipamento varchar(50),
    primary key (id_class)
);

create table tb_personagem(
	id_perso int auto_increment,
    nome varchar(50),
    habilidade varchar(50),
    ataque int,
    defesa int,
    fk_id_class int,
    primary key (id_perso),
    foreign key (fk_id_class) references tb_classe (id_class)
);

-- Valores da tabela Classe
insert into tb_classe (id_class, descricao, equipamento) 
values
(1, "Elite","Fuzil de assalto"),
(2, "Sniper","Fuzil de precisão"),
(3, "Stealth","Lâminas"),
(4, "Tanque","Lança foguetes"),
(5, "Explosivo","Granadas"),
(6, "Arqueiro","Flechas e dardos");

-- Valores da tabela Personagem
insert into tb_personagem (nome, habilidade, ataque, defesa, fk_id_class) 
values
("Ghost","Ficar invisível", 2500, 4000, 2),
("Kratos","Rage of Sparta", 9999, 3000, 3),
("Frank","Corrida rápida", 1000, 400, 1),
("Miles","Indestrutível", 6000, 9999, 4),
("Peter","Pulo duplo", 2500, 3500,3),
("Ben","Motivação", 500, 600, 6),
("Venom","Absorver energia", 1000, 6000,5),
("Franklin","Granada dupla", 5000, 2000, 5),
("Carl", "Vida infinita", 4000, 9999, 1);

-- Personagens com ataque maiores que 2000.
select * from tb_personagem where ataque > 2000;

-- Personagens com defesa entre 1000 e 2000.
select * from tb_personagem where defesa >= 1000 and defesa <= 2000;

-- Personagens com a letra "C" no nome.
select * from tb_personagem where nome like "%c%";

-- Personagem de uma classe apenas.
select
tb_personagem.nome as Personagem,
tb_classe.descricao as Classe 
from tb_personagem
inner join tb_classe on
tb_personagem. fk_id_class = tb_classe.id_class
where id_class = 5;
