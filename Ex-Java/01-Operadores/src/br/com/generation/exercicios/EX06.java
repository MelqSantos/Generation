package br.com.generation.exercicios;
import java.util.Scanner;

public class EX06 {
	
	public static void main (String [] args) {
		
	double X1, X2, Y1, Y2, P1, P2, raiz;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o n�mero da posi��o X1: ");
	X1 = leia.nextDouble();
	
	System.out.println("Digite o n�mero da posi��o Y1: ");
	Y1 = leia.nextDouble();
	
	System.out.println("Digite o n�mero da posi��o X2: ");
	X2 = leia.nextDouble();
	
	System.out.println("Digite o n�mero da posi��o Y2: ");
	Y2 = leia.nextDouble();
	
	P1 = Math.pow((X2 - X1), 2.0);
	P2 = Math.pow((Y2 - Y1), 2.0);
	raiz = Math.sqrt(P1 + P2);
	
	System.out.println("A dist�ncia entre eles �: " + Math.round(raiz * 100.0) / 100.0);
	
	leia.close();
		
	}
}
