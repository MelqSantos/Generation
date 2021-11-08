package br.com.generation.exercicios;
import java.util.Scanner;

public class EX07 {
	
	public static void main (String [] args) {
		
	double a, b, c, d, e, f, x, y;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o coeficiente A: ");
	a = leia.nextDouble();
	
	System.out.println("Digite o coeficiente B: ");
	b = leia.nextDouble();
	
	System.out.println("Digite o coeficiente C: ");
	c = leia.nextDouble();
	
	System.out.println("Digite o coeficiente D: ");
	d = leia.nextDouble();
	
	System.out.println("Digite o coeficiente E: ");
	e = leia.nextDouble();
	
	System.out.println("Digite o coeficiente F: ");
	f = leia.nextDouble();
	
	x = ((c*e) - (b*f)) / ((a*e) - (b*d));
	y = ((a*f) - (c*d)) / ((a*e) - (b*d));
	
	System.out.println("O valor de X é: " + x);
	System.out.println("O valor de Y é: " + y);

	leia.close();
		
	}
}
