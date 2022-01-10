package br.com.generation.polimorfismo;

public class Cachorro extends Animal{
	
	void correr() {
		System.out.println("Este tipo de animal pode correr!");
	}
	
	void emitirSom() {
		System.out.println("Cachorro emite o som: Latido...");
	}
}
