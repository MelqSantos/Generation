package br.com.generation.exercicios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("O maior n�mero digitado �: " + num1);
		}
		if(num2 > num1 && num2 > num3) {
			
			System.out.println("O maior n�mero digitado �: " + num2);
		}
		if(num3 > num1 && num3 > num2) {
			System.out.println("O maior n�mero digitado �: " + num3);
		}
		
		leia.close();
		
	}

}
