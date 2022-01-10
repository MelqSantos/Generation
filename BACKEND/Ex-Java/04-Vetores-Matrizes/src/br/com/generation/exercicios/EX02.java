package br.com.generation.exercicios;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		int valorDado[] = new int[10];
		int maximo = 0, soma = 0;

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < valorDado.length; x++) {

			System.out.println("Digite o valor (1 a 6) da " + (x + 1) + "° jogada: ");
			valorDado[x] = leia.nextInt();

			soma += valorDado[x];

			if (valorDado[x] == 6) {
				maximo++;
			}
		}

		System.out.println("A média dos lançamentos é: " + (soma / valorDado.length));
		System.out.println("\nOcorrências da maior pontuação(6): " + maximo + " vezes");
		leia.close();
	}

}
