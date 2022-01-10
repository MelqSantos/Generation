package br.com.generation.exercicios;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if(num1 <= num2 && num2 <= num3 ) {
			System.out.println("A ordem crescente: \n" + num1 + " " + num2 + " " + num3);
			
		} else if(num1 <= num3 && num3 <= num2) {
			System.out.println("A ordem crescente: \n" + num1 + " " + num3 + " " + num2);
			
		} else if (num2 <= num1 && num1 <= num3) {
			System.out.println("A ordem crescente: \n" + num2 + " " + num1 + " " + num3);
			
		} else if (num2 <= num3 && num3 <= num1) {
			System.out.println("A ordem crescente: \n" + num2 + " " + num3 + " " + num1);
			
		} else if(num3 <= num1 && num1 <= num2) {
			System.out.println("A ordem crescente: \n" + num3 + " " + num1 + " " + num2);
			
		}else {
			System.out.println("A ordem crescente: \n" + num3 + " " + num2 + " " + num1);
		}
		
		leia.close();
		
	}

}
