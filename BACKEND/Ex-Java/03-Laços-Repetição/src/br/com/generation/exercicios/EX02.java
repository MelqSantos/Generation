package br.com.generation.exercicios;

import java.util.Scanner;

// 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class EX02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		System.out.println("Digite 10 n�meros: ");
		for(int x = 1, num = 0; x <= 10; x++ ) {
			
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				
				par++;
			} else {
				
				impar++;
			}
		}
		System.out.println("N�meros pares: " + par + " | N�meros �mpares: " + impar);
		System.out.println("\nSistema finalizado...");
		leia.close();
	}

}
