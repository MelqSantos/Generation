package banco;

import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {
		
		char escolha;
		double sacar = 0.0 , depositar = 0.0;
		Scanner leia = new Scanner(System.in);
		Banco conta = new Banco();
		
		System.out.println("Saldo atual: R$" + conta.saldo
				+ "\nDeseja depositar ou sacar? Digite [D] ou [S]: ");
		escolha = leia.next().charAt(0);
		
		if(escolha == 's' || escolha == 'S') {
			
			System.out.println("Quanto deseja sacar? ");	
			sacar = leia.nextDouble();
		} else if(escolha == 'd' || escolha == 'D'){
			
			System.out.println("Quanto deseja depositar? ");
			depositar = leia.nextDouble();
		} else {
			System.out.println("Operação inválida");
		}
		
		conta.extrato(sacar, depositar);
		
		leia.close();
	}

}
