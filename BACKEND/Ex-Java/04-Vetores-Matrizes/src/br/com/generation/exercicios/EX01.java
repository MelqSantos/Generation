package br.com.generation.exercicios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		int pontos[] = new int[5]; 
		int maior = 0;
		
		Scanner leia = new Scanner(System.in);
		

		for(int x = 0; x < 5; x++){
			
			System.out.println("Digite o " + (x + 1) + "° ponto: ");
			pontos[x] = leia.nextInt();

			if(pontos[x] > maior){
				maior = pontos[x];
			}
		}

		for(int y = 0; y < 5; y++){
			
			System.out.print(pontos[y] + " | ");
		}
		
		System.out.println("\nO maior número é: " + maior);
		
		leia.close();
	}

}
