package aviao;

public class Aviao {

	String modelo;
	double altura, distancia, velocidade, tempo;

	// C�lculo de dist�ncia.
	double distancia(double v, double t) {
		// F�rmula para calcular dist�ncia --> d = v � t, onde "v" representa velocidade e "t" representa tempo.
		double d = 0;
		d = v * t;

		return d;
	}
	
	// Convers�o de p�s para metros
	double conversao(){
		
		double km = 0;
		double pe = 0.3048;
		km = (altura * pe) / 100;
		
		return km;
	}
}
