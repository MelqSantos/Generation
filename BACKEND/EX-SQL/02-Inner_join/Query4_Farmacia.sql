-- EXERCÍCIO 04
	 create database db_cidade_das_carnes;
     use db_cidade_das_carnes;

     create table tb_categoria (
		id bigint auto_increment,
		tipo_da_carne varchar(255) not null,
        churrasco boolean not null,
		congelado boolean not null,       
        primary key (id)
     );     
     
    insert into tb_categoria (tipo_da_carne, churrasco, congelado) values 
    ("Bovina",true,true),
    ("Bovina",true,true),
    ("Bovina",false,false),
    ("Bovina",false,false),
    ("Frango",true,true);
 
     create table tb_produto (		
		id bigint auto_increment,
        nome varchar (255) not null,
        preco decimal (8,2) not null,
        estoque_produto int not null,
        validade varchar (255) not null,
        categoria_id bigint,
        primary key (id),
		foreign key (categoria_id) REFERENCES tb_categoria (id)        
     );
     
	insert into tb_produto (nome, preco, estoque_produto, validade, categoria_id) values 
    ("Bife",100,255,"30 dias",1),
	("Fígado",60,255,"30 dias",1),
	("Filé",80,255,"30 dias",1),
	("Lagarto",60,255,"30 dias",2),
	("Acém",80,255,"30 dias",3),
	("Coração",60,255,"30 dias",4),
	("Chester",45,255,"15 dias",5),
	("Asa de Frango",20,255,"15 dias",5);
    
    select * from tb_produto where preco > 50;
    
    select * from tb_produto where preco between 3 and 60;
    
    select * from tb_produto where nome like "%C%";
    
	-- select com Inner join entre  tabela categoria e produto.
    select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
    -- Todos os Produtos de uma categoria 
    select * from tb_produto where categoria_id = 5; -- frango