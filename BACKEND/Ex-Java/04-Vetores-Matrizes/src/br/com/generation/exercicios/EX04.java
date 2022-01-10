package br.com.generation.exercicios;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		double valores[][] = new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
		Scanner leia = new Scanner(System.in);

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {

				System.out.print("L" + l + " | C" + c + " : ");
				valores[l][c] = leia.nextDouble();

				soma = soma + valores[l][c];

				if (l == c) {
					somaDiagonal = somaDiagonal + valores[l][c];
				}
			}
		}

		System.out.println("\nA soma dos valores da Matriz é: " + soma);
		System.out.println("A soma dos valores da diagonal é: " + somaDiagonal);
		leia.close();

	}
}
