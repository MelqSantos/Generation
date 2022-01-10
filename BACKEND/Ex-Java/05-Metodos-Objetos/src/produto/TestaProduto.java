package produto;

public class TestaProduto {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto ();
		Produto produto2 = new Produto ();
		
		produto1.descricao = "Placa de vídeo RTX 3060";
		produto1.id = 1;
		produto1.peso = 400;
		produto1.preco = 4799.99;
		produto1.quantidade = 1;
		
		produto2.descricao = "Processador intel core i5";
		produto2.id = 2;
		produto2.peso = 400;
		produto2.preco = 1199.99;
		produto2.quantidade = 2;
		
		// Informa os dados dos produtos.
		System.out.println(
		"+----------- Produto 1 -----------+" +
		"\nId: " + produto1.id +
		"\nDescrição: " + produto1.descricao +
		"\nPreço: " + produto1.preco +
		"\nQuantidade: " + produto1.quantidade +
		
		"\n+----------- Produto 2 -----------+" +
		"\nId: " + produto2.id +
		"\nDescrição: " + produto2.descricao +
		"\nPreço: " + produto2.preco +
		"\nQuantidade: " + produto2.quantidade 
		);
		
		Produto.somar(produto1.peso, produto2.peso, produto1.preco, produto2.preco, produto1.quantidade, produto2.quantidade);
	}
	
	
	
}
