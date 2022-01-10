package br.com.generation.exercicios;

import java.util.Scanner;

/*
	5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/
public class EX05 {

	public static void main(String[] args) {
		
		int num, soma = 0, totalNum = 0, cont = 1;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma += num;
			totalNum++;
			
			if(num == 0) {
				cont = 0;
			}
		} while(cont != 0);
		
		System.out.println("\nTotal de n�meros digitados: " + totalNum
						+  "\nSoma total: " + soma);
		
		leia.close();
	}	

}
