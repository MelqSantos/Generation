package aviao;

public class Aviao {

	String modelo;
	double altura, distancia, velocidade, tempo;

	// Cálculo de distância.
	double distancia(double v, double t) {
		// Fórmula para calcular distância --> d = v × t, onde "v" representa velocidade e "t" representa tempo.
		double d = 0;
		d = v * t;

		return d;
	}
	
	// Conversão de pés para metros
	double conversao(){
		
		double km = 0;
		double pe = 0.3048;
		km = (altura * pe) / 100;
		
		return km;
	}
}
