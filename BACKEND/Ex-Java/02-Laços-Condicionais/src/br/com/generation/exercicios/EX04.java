package br.com.generation.exercicios;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		double num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer: ");
		num = leia.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par");
			System.out.println("A raiz quadrada de " + num + " �: " + Math.sqrt(num));
		} else {
			System.out.println("O n�mero " + num + " � �mpar");
			System.out.println("O n�mero " + num + " elevado ao quadrado �: " + Math.round(Math.pow(num, 2.0)));
		}
	
		leia.close();
		
	}

}
