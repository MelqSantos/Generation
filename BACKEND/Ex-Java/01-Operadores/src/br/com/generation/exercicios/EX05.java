package br.com.generation.exercicios;
import java.util.Scanner;

public class EX05 {
	
	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextDouble();

		System.out.println("Digite a nota 2: ");
		n2 = leia.nextDouble();

		System.out.println("Digite a nota 3: ");
		n3 = leia.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média do aluno é: " + Math.round(media * 100.0) / 100.0);
		
		leia.close();
	}

}
