package br.com.generation.exercicios;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		double num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		num = leia.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é par");
			System.out.println("A raiz quadrada de " + num + " é: " + Math.sqrt(num));
		} else {
			System.out.println("O número " + num + " é ímpar");
			System.out.println("O número " + num + " elevado ao quadrado é: " + Math.round(Math.pow(num, 2.0)));
		}
	
		leia.close();
		
	}

}
