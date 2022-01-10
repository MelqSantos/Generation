package br.com.generation.exercicios;
import java.util.Scanner;

public class EX04 {
	
	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();

		System.out.println("Digite o número B: ");
		b = leia.nextInt();

		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		r = (int) Math.pow((a + b), 2.0);
		s = (int) Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		
		System.out.println("D = " + d);
		
		leia.close();
	}

}
