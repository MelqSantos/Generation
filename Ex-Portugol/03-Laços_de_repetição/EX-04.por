programa
{
	/*
		2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três 
		(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
		deveremos observar na tela a seguinte sequência: 5 15 45 135.
		*Autor: Melqui Santos - Turma 39
		*Data: 29/10/21
	*/
	
	funcao inicio()
	{	
		inteiro num = 0, cont = 0

		escreva("Digite um número: ")
		leia(num)
		
		enquanto(num < 100){
			
			escreva(num + " ")
			num = num * 3

			// Caso o último laço seja maior que 100 ele imprime na tela.
			se(num > 100){
				escreva(num)	
			}
		}
		
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