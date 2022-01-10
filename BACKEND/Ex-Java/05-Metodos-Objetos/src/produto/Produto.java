package produto;

public class Produto {

	String descricao;
	int id, peso, quantidade;
	double preco;

	// Soma de algumas informações dos produtos
	static void somar(double peso1, double peso2, double preco1, double preco2, int quant1, int quant2) {

		double somaPeso = 0;
		double somaPreco = 0;
		int somaQuant = 0;

		somaPeso = peso1 + peso2;
		somaPreco = preco1 + preco2;
		somaQuant = quant1 + quant2;

		System.out.println(
		"\n+----------- Total no carrinho -----------+" +
		"\nQuantidade de itens: " + somaQuant + " itens." +
		"\nPreço total: R$" + somaPreco + 		
		"\nPeso total: " + (somaPeso/1000) + "Kg."
		);
	}

}
