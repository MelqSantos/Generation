package br.com.generation.exercicios;
import java.util.Scanner;
import java.util.Calendar;

public class EX02 {
	
	public static void main(String[] args) {
		
		int idade, anoNasc, mes;
		int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o dia de seu nascimento? ");
		idade = leia.nextInt();
		
		System.out.println("Qual o mês de seu nascimento? ");
		mes = leia.nextInt();
		
		System.out.println("Qual o ano de seu nascimento? ");
		anoNasc = leia.nextInt();
		
		
		idade = Calendar.getInstance().get(Calendar.YEAR) - anoNasc;
		mes = (idade * 12) + Calendar.getInstance().get(Calendar.MONTH);
		
		System.out.println(idade + " anos | " + mes + " meses | " + ((mes * 30) + (30 - dia)) + " dias");
		
		leia.close();
	}

}
