package funcionario;

public class TestaFunc {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.nome = "Estev�o Jobson";
		func.cargo = "Desenvolvedor WEB Jr.";
		func.promocao = "Desenvolvedor WEB Pleno";
		func.diasTrab = 900;
		func.diasFal = 10;
		func.salario = 3500.00;
		
		System.out.println("+---------- An�lise de funcion�rio ----------+");
		Funcionario.analise(func.nome, func.cargo, func.diasTrab, func.salario, func.promocao);
	}

}
