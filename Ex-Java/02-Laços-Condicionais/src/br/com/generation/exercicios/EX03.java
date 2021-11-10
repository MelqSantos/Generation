package br.com.generation.exercicios;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("A categoria da sua idade é Infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("A categoria da sua idade é Juvenil");
		} else if(idade >= 18 && idade <= 25){
			System.out.println("A categoria da sua idade é Adulto");
		} else  {
			System.out.println("Sua idade não se encaixa em nenhuma das categorias...");
		}
		
		leia.close();
		
	}

}
