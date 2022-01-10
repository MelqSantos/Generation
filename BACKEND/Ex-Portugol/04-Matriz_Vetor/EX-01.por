programa
{
	/* 
	* Exercício 1
	* Autor: Melqui Santos
	* Data: 04-11-2021
	*/
	
	funcao inicio()
	{

	inteiro pontos[5], maior = 0
	

	para(inteiro x = 0; x < 5; x++){
		escreva("Digite o " + (x + 1) + "° ponto: ")
		leia(pontos[x])

		se(pontos[x] > maior){
			maior = pontos[x]
		}
	}

	limpa()
	para(inteiro y = 0; y < 5; y++){
		escreva(pontos[y] + " ")
	}
	
	escreva("\nO maior número é: " + maior)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 12, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */