package patinete;

public class TestaPatinete {

public static void main(String[] args) {
		
		//instanciando objetos
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		Patinete pat3 = new Patinete();
		
		pat1.setCor("Azul");
		pat1.setTamanho("Grande");
		pat1.setIdadeRec(18);
		
		pat2.setCor("Preto");
		pat2.setTamanho("Médio");
		pat2.setIdadeRec(10);
		
		pat3.setCor("Dourado");
		pat3.setTamanho("Grande");
		pat3.setIdadeRec(18);
		
		System.out.println("Cor do patinete 1: " + pat1.getCor());
		System.out.println("Tamanho do patinete 1: " + pat1.getTamanho());
		System.out.println("Idade recomendada para o patinete 1: " + pat1.getIdadeRec());
		pat1.valor("");
		pat1.acessorio("");
		
		System.out.println("+ ---------------------------------------------------- +");
		
		System.out.println("Cor do patinete 2: " + pat2.getCor());
		System.out.println("Tamanho do patinete : " + pat2.getTamanho());
		System.out.println("Idade recomendada para o patinete 2: " + pat2.getIdadeRec());
		pat2.valor("");
		pat2.acessorio("");
		
		System.out.println("+ ---------------------------------------------------- +");
		
		System.out.println("Cor do patinete 3: " + pat3.getCor());
		System.out.println("Tamanho do patinete 3: " + pat3.getTamanho());
		System.out.println("Idade recomendada para o patinete 3: " + pat3.getIdadeRec());
		pat3.valor("");
		pat3.acessorio("");
	}

}
