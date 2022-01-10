package funcionario;

public class Funcionario {
	
	String nome, cargo, promocao;
	double salario;
	int diasTrab, diasFal;
	
	
	// Método para análise de promoção.
	static void analise(String nome, String cargo, int dias, double salario, String promo) {
		
		double aumento = 0.3;
		
		if(dias > 730) {
			
			double anos = dias /365;
			double salarioPromo = (salario * aumento) + salario;
			
			System.out.println("Funcionário " + nome + " deverá ser promovido a " + promo
					+ " pois trabalhou " + anos + " anos");
			System.out.println("Deverá ter aumento de salário em 30%, será ajustado de R$" + salario + " para R$" + salarioPromo);
			
		}else{
			
			System.out.println("Funcionário " + nome + " trabalhou menos de 2 anos, não possui experiência para promoção");
		};
		
	}

}
