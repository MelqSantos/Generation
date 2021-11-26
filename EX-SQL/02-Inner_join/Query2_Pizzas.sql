create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
	id_cat int,
    tipo varchar(30),
    serve int,
    primary key (id_cat)
);

create table tb_pizza(
	id_pizza int auto_increment,
    descricao varchar(30),
    valor decimal (4, 2),
    qtd int,
    fk_id_cat int,
    primary key (id_pizza),
    foreign key (fk_id_cat) references tb_categoria (id_cat)
);

insert into tb_categoria (id_cat, tipo, serve) values
(1, "Pizza doce", 8),
(2, "Pizza Tradicional", 8),
(3, "Pizza Premium", 8),
(4, "Pizza Especiarias", 8),
(5, "Pizza Broto", 2);

insert into tb_pizza (descricao, valor, qtd, fk_id_cat) values
("Chocolate", 35.50, 1, 1),
("Muzarella", 29.99, 2, 2),
("Calabresa", 29.99, 1, 2),
("Frango catupiry", 35.50, 1, 3),
("Carne seca", 55.50, 1, 4),
("Portuguesa", 35.50, 1, 4),
("4 queijos", 20.00, 1, 5),
("Ovomaltine", 35.50, 1, 1);

-- Pizzas com valor maior que 45 reais
select * from tb_pizza where valor > 45;

-- Pizzas com valor maior entre 29 e 60 reais
select * from tb_pizza where valor >= 29 and valor <= 60;

-- Pizzas que contém a letra "C" no nome
select * from tb_pizza where descricao like "%c%";

-- Traz todos os valores de uma única categoria
select
tb_pizza.id_pizza as ID,
tb_pizza.descricao as Descrição,
tb_pizza.valor as Valor,
tb_categoria.tipo as Tipo,
CONCAT(tb_categoria.serve, " Pessoas") as Serve
from tb_pizza
inner join tb_categoria on
tb_pizza.fk_id_cat = tb_categoria.id_cat
where tb_categoria.id_cat = 4;

