package br.com.generation.exercicios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("O maior número digitado é: " + num1);
		}
		if(num2 > num1 && num2 > num3) {
			
			System.out.println("O maior número digitado é: " + num2);
		}
		if(num3 > num1 && num3 > num2) {
			System.out.println("O maior número digitado é: " + num3);
		}
		
		leia.close();
		
	}

}
