package br.com.generation.polimorfismo;

public class TestaTodos {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preg = new Preguica();

		dog.setNome("Pastor alemão");
		dog.setIdade(5);
		
		cavalo.setNome("Puro Sangue");
		cavalo.setIdade(12);

		preg.setNome("Bicho Preguiça");
		preg.setIdade(7);
		
		// Mostra dados do cachorro.
		System.out.println("Nome: " + dog.getNome() + "\nIdade: " + dog.getIdade());
		dog.emitirSom();
		dog.correr();
		dog.emitirSom();
		System.out.println("================================");
		
		// Mostra dados do cavalo.
		System.out.println("\nNome: " + cavalo.getNome() + "\nIdade: " + cavalo.getIdade());
		cavalo.emitirSom();
		cavalo.correr();
		cavalo.emitirSom();
		System.out.println("================================");
		
		// Mostra dados da preguiça.
		System.out.println("\nNome: " + preg.getNome() + "\nIdade: " + preg.getIdade());
		preg.emitirSom();
		preg.subir();
		preg.emitirSom();
		System.out.println("================================");

	}

}
