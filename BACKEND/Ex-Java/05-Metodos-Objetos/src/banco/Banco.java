package banco;

public class Banco {
	
	double saldo = 2300;
	
	// Extrato da conta, faz c�lculo de dep�sito e saque.
	void extrato (double saque, double dep){
		
		saldo -= saque;
		saldo += dep;
		System.out.println(
		"\n+ ----------- Extrato ----------- +"	
		+ "\nSaque : R$" + saque
		+ "\nDeposito: R$" + dep
		+ "\nSaldo l�quido: R$" + saldo
		);
	}
}
