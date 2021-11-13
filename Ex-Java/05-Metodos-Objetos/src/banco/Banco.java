package banco;

public class Banco {
	
	double saldo = 2300;
	
	// Extrato da conta, faz cálculo de depósito e saque.
	void extrato (double saque, double dep){
		
		saldo -= saque;
		saldo += dep;
		System.out.println(
		"\n+ ----------- Extrato ----------- +"	
		+ "\nSaque : R$" + saque
		+ "\nDeposito: R$" + dep
		+ "\nSaldo líquido: R$" + saldo
		);
	}
}
