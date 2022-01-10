programa
{	
	/*
		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		*Autor: Melqui Santos - Turma 39
		*Data: 29/10/21
	*/
	
	funcao inicio()
	{	
		inteiro cont, num, impar = 0
		real qtd, soma = 0.0

		escreva("Quantos números deseja somar? ")
		leia(qtd)
		
		para(cont = 1; cont <= qtd; cont++ ){
			limpa()
			escreva("Digite o " + cont + "º " + "número: ")
			leia(num)	

			se (num <= 500 e num % 2 != 0){
				soma = soma + num
				impar++
			}
		}
		limpa()
		escreva("A soma de " + impar + " números ímpares é: " + soma)
		escreva("\n" + impar + " dos " + (cont - 1) + " números digitados são ímpares e menores que 500...")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */