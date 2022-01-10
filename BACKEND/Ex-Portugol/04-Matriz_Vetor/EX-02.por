programa
{
	/* 
	* Exercício 2
	* Autor: Melqui Santos
	* Data: 04-11-2021
	*/
	
	funcao inicio()
	{

	inteiro valorDado[10], maximo = 0, soma = 0


	para(inteiro x = 0; x < 10; x++){
		limpa()
		
		escreva("Digite o valor (1 a 6) da " + (x + 1) + "° jogada: ")	
		leia(valorDado[x])
		
		soma = soma + valorDado[x]

		se(valorDado[x] == 6){
			maximo++
		}
	}
	
	escreva("A média dos lançamentos é: " + (soma/10))
	escreva("\nOcorrências da maior pontuação: " + maximo + " vezes")
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valorDado, 12, 9, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */