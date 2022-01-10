package br.com.generation.estoque;

public class Produto {
	
	private String descProduto;
	private int quantidade;
	
	public Produto(String descProduto, int quantidade) {
		super();
		this.descProduto = descProduto;
		this.quantidade = quantidade;
	}
	
	public String getDescProduto() {
		return descProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [Produto: " + descProduto + " | quantidade: " + quantidade + "]";
	}
}
