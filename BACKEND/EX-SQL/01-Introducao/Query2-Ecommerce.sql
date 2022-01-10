create database db_ecommerce;

use db_ecommerce;

create table tb_produto(
	id bigint(10) auto_increment,
    descricao varchar(50),
    valor decimal(10,2),
    quant bigint,
	marca varchar(30),
    primary key (id)
);

insert into tb_produto (descricao, valor, quant, marca) values
("PS5", 5000, 15, "SONY"),
("XBOX SERIES X", 4300, 11, "MICROSOFT"),
("PROCESSADOR I9", 3000, 25, "INTEL"),
("MEMÓRIA RAM 4GB", 300, 25, "SEAGATE"),
("NOTEBOOK ASUS I5", 3200, 5, "ASUS"),
("PLACA DE VÍDEO RTX 3090", 19000, 5, "NVIDIA"),
("THE LAST OF US PS4", 299.99, 15, "SONY"),
("PS2", 300, 2, "SONY");

select * from tb_produto where valor > 500;

select * from tb_produto where valor < 500;

update tb_produto set quant = 9 where id = 1;