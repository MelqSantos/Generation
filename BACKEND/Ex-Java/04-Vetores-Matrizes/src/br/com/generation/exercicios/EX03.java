package br.com.generation.exercicios;

public class EX03 {

	public static void main(String[] args) {

		double N1[][] = {
				{30.0, 20.0, 30.0, 40.0, 50.0, 60.0},
				{10.0, 40.0, 30.0, 40.0, 50.0, 60.0},
				{10.0, 20.0, 50.0, 40.0, 50.0, 60.0},
				{10.0, 20.0, 30.0, 60.0, 50.0, 70.0}
				};

			double N2[][] = {
				{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
				{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
				{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
				{10.0, 20.0, 30.0, 40.0, 50.0, 60.0}
				};
		
		double M1[][] = new double[4][6];
		double M2[][] = new double[4][6];
		
		
		for(int l = 0; l < 4; l++){
			for(int c = 0; c < 6; c++){
				// Adiciona na M1 a soma dos itens da mesma posição na N1 e N2
				M1[l][c] = N1[l][c] + N2[l][c];
				
				// Adiciona na M1 a diferença dos itens da mesma posição na N1 e N2
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}

		// Mostra a M1
		for(int l = 0; l < 4; l++){
			for(int c = 0; c < 6; c++){
					if(l == 0 && c == 0){
						System.out.println("Valores da matriz M1");
						System.out.println();
					}
					System.out.print(M1[l][c] + " | ");
				}
			System.out.println();
			}

			// Mostra a M2
		for(int l = 0; l < 4; l++){
			for(int c = 0; c < 6; c++){
					if(l == 0 && c == 0){
						System.out.println("\nValores da matriz M2");
						System.out.println();
					}
					System.out.print(M2[l][c] + " | ");
				}
			System.out.println();
			}
	}

}
