package aviao;

public class TestaAviao {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();

		aviao.modelo = "Comercial";
		aviao.tempo = 3.5;
		aviao.velocidade = 900;
		aviao.altura = 40000;

		System.out.println("O avi�o de modelo " + aviao.modelo + " percorreu em " + aviao.tempo
							+ "hrs uma dist�ncia de: " + aviao.distancia(aviao.velocidade, aviao.tempo) 
							+ "Km");
		
		System.out.println("O avi�o est� voando a uma altura de " + (int)aviao.altura + " p�s, "
							+ "ou seja, " + aviao.conversao() + " km");
	}

}
