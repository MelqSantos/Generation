-- EXERCÍCIO 03
	 create database db_farmacia_do_bem;
     use db_farmacia_do_bem;
     
     create table tb_categoria (
		id bigint,
        receita boolean not null,
        tipo_produto varchar (255) not null,
        publico varchar (255) not null,
        
        primary key (id)
     );     
     
    insert into tb_categoria (receita, tipo_produto, publico) values
    (1,true, "Medicamento Restrito","Adulto"),
	(2,true, "Medicamento Restrito","Infantil"),
	(3,false, "Cosméticos","Adulto"),
	(4,false, "Cosméticos","Adulto"),
	(5,false, "Higiene Pessoal","Adulto"),
	(6,false, "Higiene Pessoal","Infantil");
     
 
     create table tb_produto (		
		id bigint auto_increment,
        descricao varchar (255) not null,
        preco decimal (8,2) not null,
        qtd_estoque int not null,
        validade date,
        categoria_id bigint,
        
        primary key (id),
		foreign key (categoria_id) REFERENCES tb_categoria (id)        
     );
     
	insert into tb_produto (descricao, preco, qtd_estoque, validade, categoria_id) values 
    ("Sibutramina",500.99,255,"2024-08-01",1),
	("Amoxicilina",290.99,255,"2025-11-25",1),
	("Dipirona",18.90,255,"2023-10-20",2),
	("Tinta de cabelo",29.90,255,"2021-12-01",3),
	("Shampoo",30.50,255,"2022-12-05",4),
	("Hipoglos",12.50,255,"2023-12-14",6),
	("Alcool em Gel",9.80,255,"2022-01-26",5),
	("Lenços",54.29,255,"2024-10-25",6);
    
    select * from tb_produto where preco > 50;
    
    select * from tb_produto where preco between 3 and 60;
    
    select * from tb_produto where descricao like "%b%";
    
	-- Select com Inner join entre  tabela categoria e produto.
    select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

    select tb_produto.descricao, tb_categoria.tipo_produto, tb_categoria.receita, tb_categoria.publico, tb_produto.preco
    from tb_produto inner join tb_categoria
    on tb_categoria.id = tb_produto.categoria_id;
    
    -- Todos os Produtos de uma categoria específica 
    select * from tb_produto where categoria_id = 1;