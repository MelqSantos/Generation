package br.com.generation.exercicios;


// 1 - Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
public class EX01 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int x = 1000; x <= 1999; x++ ) {
			
			if(x % 11 == 5) {
				
				System.out.println("N� " + x + " | Resto da divis�o: " + (x % 11));
				total++;
			}
		}
		
		System.out.println("\nTotal de n�meros com resto de divs�o igual a 5: " + total);

	}

}
