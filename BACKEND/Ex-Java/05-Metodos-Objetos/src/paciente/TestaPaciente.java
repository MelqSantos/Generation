package paciente;

public class TestaPaciente {

	public static void main(String[] args) {

		// instanciando objetos
		Paciente pac1 = new Paciente();
		Paciente pac2 = new Paciente();
		
		pac1.setNome("Paciente A");
		pac1.setDocumento("XXX.XXX.XXX-XX");
		pac1.setTipoS("Tipo A+");

		pac2.setNome("Paciente B");
		pac2.setDocumento("XXX.XXX.XXX-XX");
		pac2.setTipoS("Tipo B+");
		
		System.out.println("Nome do paciente 1: " + pac1.getNome());
		System.out.println("Documento do paciente 1: " + pac1.getDocumento());
		System.out.println("Tipo sanguíneo do paciente 1: " + pac1.getTipoS());

		System.out.println("+ ---------------------------------------- +");

		System.out.println("Nome do paciente 2: " + pac2.getNome());
		System.out.println("Documento do paciente 2: " + pac2.getDocumento());
		System.out.println("Tipo sanguíneo do paciente 2: " + pac2.getTipoS());

		System.out.println("+ ---------------------------------------- +");

	}
}
