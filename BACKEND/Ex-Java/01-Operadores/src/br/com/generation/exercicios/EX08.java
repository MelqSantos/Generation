package br.com.generation.exercicios;
import java.util.Scanner;

public class EX08 {
	
	public static void main (String [] args) {
		
	double custoC, custoF, percDistribuidor = 0.28, impostos = 0.45;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual o custo de fábrica do carro? ");
	custoF = leia.nextDouble();
	
	custoC = custoF + ( percDistribuidor * custoF ) + ( impostos * custoF);
	System.out.println("O custo ao consumidor é: R$ " + Math.round(custoC));
	
	leia.close();
		
	}
}
