package br.com.generation.exercicios;

import java.util.Scanner;

/*
	6 -	Escrever um programa que receba v�rios n�meros inteiros no teclado.
	E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
public class EX06 {

	public static void main(String[] args) {
		
		int num, soma = 0, media = 0, totalNum = 0, totalNum3 = 0, cont = 1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite [0] para sair...");
		
		do {
			System.out.println("Digite um n�mero: ");
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
		
		System.out.println("\nTotal de n�meros digitados: " + totalNum
						+  "\nN�meros multiplos de 3 digitados: " + totalNum3
						+  "\nM�dia dos n�meros multiplos de 3: " + media);
		
		leia.close();
	}	

}
