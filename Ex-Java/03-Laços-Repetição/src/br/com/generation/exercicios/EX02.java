package br.com.generation.exercicios;

import java.util.Scanner;

// 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class EX02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		System.out.println("Digite 10 números: ");
		for(int x = 1, num = 0; x <= 10; x++ ) {
			
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				
				par++;
			} else {
				
				impar++;
			}
		}
		System.out.println("Números pares: " + par + " | Números ímpares: " + impar);
		System.out.println("\nSistema finalizado...");
		leia.close();
	}

}
