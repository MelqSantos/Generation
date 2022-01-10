package br.com.generation.estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

	static Scanner read = new Scanner(System.in);

	// Array para armazenar os itens.
	static ArrayList<Produto> estoque = new ArrayList();
	
	// Variável começa com esse valor para quebrar o laço for.
	static int opcao = 99;

	public static void main(String[] args) {

		// Itens pré cadastrados.
		estoque.add(new Produto("RTX 3090", 2));
		estoque.add(new Produto("Placa mãe", 4));
		estoque.add(new Produto("Processador Ryzen 5", 2));
		estoque.add(new Produto("Memória RAM", 5));
		
		System.out.println("+ ----------- Sistema de estoque ----------- +");
		
		for(int x = 0; x < opcao; x++) {

			// Opções do sistema de estoque.
			System.out.println("\nDigite o número correspondente:"
					+ "\n[1] Cadastrar [2] Alterar [3] Remover [4] Exibir estoque [5] Sair");
			opcao = read.nextInt();

			// Validação de escolhas.
			switch (opcao) {
			case 1:
				Cadastrar();
				break;
			case 2:
				Alterar();
				break;
			case 3:
				Remover();
				break;
			case 4:
				Exibir();
				break;
			case 5:
				Encerrar();
				break;
			default:
				System.out.println("Programa encerrado...");
				break;
			}
			
			// Verificação para sair do loop.
			if(opcao == 99) {
				break;
			}
		}
	}
	
	// Método para cadastrar novos itens.
	static void Cadastrar() {
		System.out.println("Digite o nome do item que deseja cadastrar: ");
		String prod = read.next();

		System.out.println("Digite quantidade do produto " + prod + ": ");
		int qtd = read.nextInt();

		estoque.add(new Produto(prod, qtd));
		System.out.println(prod + " cadastrado com sucesso!");
		Encerrar();
	}
	
	// Método para Alterar itens existentes.
	static void Alterar() {
		System.out.println("\n+ ----------- Alterar produto ----------- +");

		for (int i = 0; i < estoque.size(); i++) {
			System.out.println(
					"[" + i + "] " + "Produto: " + estoque.get(i).getDescProduto() + " | " + estoque.get(i).getQuantidade() + " un.");
		}

		System.out.println("\nDigite a posição que deseja alterar [0] a" + " [" + (estoque.size()-1) + "]: ");
		int index = read.nextInt();

		System.out.println("Digite o novo nome do item que deseja alterar: ");
		String prod = read.next();

		System.out.println("Digite quantidade do produto " + prod + ": ");
		int qtd = read.nextInt();

		// Altera o produto
		estoque.set(index, new Produto(prod, qtd));
		System.out.println(prod + " alterado com sucesso!");
	}
	
	// Método para remover itens do estoque.
	static void Remover() {
		System.out.println("\n+ ----------- Remover produto ----------- +");
		
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println(
					"[" + i + "] " + "Produto: " + estoque.get(i).getDescProduto() + " | " + estoque.get(i).getQuantidade() + " un.");
		}
		
		System.out.println("\nDigite a posição que deseja remover [0] a" + " [" + estoque.size() + "]: ");
		int index = read.nextInt();

		estoque.remove(index);

		for (int i = 0; i < estoque.size(); i++) {
			System.out.println(
					"Produto: " + estoque.get(i).getDescProduto() + " | " + estoque.get(i).getQuantidade() + " un.");
		}
	}
	
	// Método para exibir os itens do estoque.
	static void Exibir() {

		System.out.println("\n+ ----------- Estoque atual ----------- +");
		System.out.println();
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println(
					"Produto: " + estoque.get(i).getDescProduto() + " | " + estoque.get(i).getQuantidade() + " un.");
		}
	}
	
	// Método para encerrar o programa e sair do loop.
	static void Encerrar() {
		System.out.println("Programa encerrado...");
		opcao = 99;
	}

}
