package funcionario;

public class Funcionario {
	
	String nome, cargo, promocao;
	double salario;
	int diasTrab, diasFal;
	
	
	// M�todo para an�lise de promo��o.
	static void analise(String nome, String cargo, int dias, double salario, String promo) {
		
		double aumento = 0.3;
		
		if(dias > 730) {
			
			double anos = dias /365;
			double salarioPromo = (salario * aumento) + salario;
			
			System.out.println("Funcion�rio " + nome + " dever� ser promovido a " + promo
					+ " pois trabalhou " + anos + " anos");
			System.out.println("Dever� ter aumento de sal�rio em 30%, ser� ajustado de R$" + salario + " para R$" + salarioPromo);
			
		}else{
			
			System.out.println("Funcion�rio " + nome + " trabalhou menos de 2 anos, n�o possui experi�ncia para promo��o");
		};
		
	}

}
