package br.com.generation.exercicios;
import java.util.Scanner;

public class EX03 {
	
	public static void main(String[] args) {
		
		double hr,  min, seg;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o tempo de duração do evento(segundos) ? ");
		seg = leia.nextDouble();
		
		min = seg / 60.0;
		hr = min / 60.0;
		
		// Math.round arredonda para duas casas decimais.
		System.out.println((Math.round(hr * 100.0) / 100.0) + " horas de evento.");
		System.out.println((Math.round(min * 100.0) / 100.0) + " minutos de evento.");
		System.out.println((Math.round(seg * 100.0) / 100.0) + " segundos de evento. ");
		
		leia.close();
	}

}
