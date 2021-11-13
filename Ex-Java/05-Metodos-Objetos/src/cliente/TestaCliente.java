package cliente;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente pessoa = new Cliente();

		pessoa.nome = "Bruno";
		pessoa.cpf = "430.804.028-04";
		pessoa.tel = "(11)3719-0132";
		pessoa.endereco = "Rua Vitor Freire";

		contato(pessoa.nome, pessoa.cpf, pessoa.tel, pessoa.endereco);
		Cliente.novoCliente(false);
		System.out.println(Cliente.fidelidade(6));
	}

	// Infomar dados de contato do cliente.
	public static void contato(String nome, String cpf, String tel, String end) {
		System.out.println("+---------- Dados do cliente ----------+");
		System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + tel + "\nEndereco: " + end);
	}

}
