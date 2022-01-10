package cliente;

public class Cliente {
	
	String nome, endereco, cpf, tel;
	
	// Verifica se o cliente � novo e aplica diferentes descontos. 
	static void novoCliente(boolean novoCliente){
		
		if(novoCliente == true) {
			System.out.println("\nO cliente "
					+ "� novo, ter� desconto de 10%...");
		} else {
			System.out.println("\nO cliente � antigo, ter� desconto de 15%...");
		}
	}
	
	// Verifica o cart�o fidelidade do cliente.
	 static String fidelidade(int quantidadeCompras){
		 
		 String fidelidade = "";
		 
		 if(quantidadeCompras >= 5) {
			 fidelidade = "Parab�ns! O cliente comprou " + quantidadeCompras + " vezes na loja, zerou o cart�o fidelidade.";
		 } else {
			 fidelidade = "O cliente comprou " + quantidadeCompras + " vezes na loja, falta pouco para atingir a meta.";
		 }
		
		return fidelidade;
	}
	
}
