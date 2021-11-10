package br.com.generation.exercicios;

import java.util.Scanner;

/*
	6 -	Escrever um programa que receba vários números inteiros no teclado.
	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
public class EX06 {

	public static void main(String[] args) {
		
		int num, soma = 0, media = 0, totalNum = 0, totalNum3 = 0, cont = 1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite [0] para sair...");
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			soma += num;
			totalNum++;
			
			if(num == 0) {
				
				cont = 0;
				System.out.println("Programa finalizado...");
				break;
				
			} else if(num % 3 == 0) {
				totalNum3++;
				media = soma / totalNum3;
			}
			
		} while(cont != 0);
		
		System.out.println("\nTotal de números digitados: " + totalNum
						+  "\nNúmeros multiplos de 3 digitados: " + totalNum3
						+  "\nMédia dos números multiplos de 3: " + media);
		
		leia.close();
	}	

}
