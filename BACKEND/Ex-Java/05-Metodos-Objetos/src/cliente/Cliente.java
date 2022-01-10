package cliente;

public class Cliente {
	
	String nome, endereco, cpf, tel;
	
	// Verifica se o cliente é novo e aplica diferentes descontos. 
	static void novoCliente(boolean novoCliente){
		
		if(novoCliente == true) {
			System.out.println("\nO cliente "
					+ "é novo, terá desconto de 10%...");
		} else {
			System.out.println("\nO cliente é antigo, terá desconto de 15%...");
		}
	}
	
	// Verifica o cartão fidelidade do cliente.
	 static String fidelidade(int quantidadeCompras){
		 
		 String fidelidade = "";
		 
		 if(quantidadeCompras >= 5) {
			 fidelidade = "Parabéns! O cliente comprou " + quantidadeCompras + " vezes na loja, zerou o cartão fidelidade.";
		 } else {
			 fidelidade = "O cliente comprou " + quantidadeCompras + " vezes na loja, falta pouco para atingir a meta.";
		 }
		
		return fidelidade;
	}
	
}
