package br.com.generation.exercicios;

import java.util.Scanner;

/* 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE) */

public class EX03 {

	public static void main(String[] args) {
		
		int idade;
		int pessoas = 0, total = 0, cont = 1, menor21 = 0, maior50 = 0;
		Scanner leia = new Scanner(System.in);
		
		while(cont > pessoas) {
			
			System.out.println("Informe a idade da " + cont + "° pessoa: ");
			idade = leia.nextInt();
			
			cont++;
			total++;
			
			if(idade < 21) {
				menor21++;
				
			} else if(idade > 50 && idade < 99) {
				maior50++;
				
			} else if(idade >= 99) {
				
				System.out.println("\nPrograma finalizado...");
				maior50++;
				break;
			}
		}
		
		System.out.println("\nTotal de pessoas: " + total
						+  "\nMenores de 21 anos: " + menor21 + " pessoas" 
						+  "\nMaiores de 50 anos: " + maior50 + " pessoas");
		
		leia.close();
	}

}
