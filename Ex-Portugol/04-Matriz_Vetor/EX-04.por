programa
{
	/* 
	* Exercício 4
	* Autor: Melqui Santos
	* Data: 04-11-2021
	*/
	
	funcao inicio()
	{

	real valores[3][3], soma = 0.0, somaDiagonal = 0.0

	para(inteiro l = 0; l < 3; l++){
		para(inteiro c = 0; c < 3; c++){
			escreva("L" + l + " | C" + c + " : ")
			leia(valores[l][c])

			soma = soma + valores[l][c]

			se(l == c){
				somaDiagonal = somaDiagonal + valores[l][c]
			}
		}
	}

	escreva("A soma dos valores da Matriz é: " + soma)
	escreva("\nA soma dos valores da diagonal é: " + somaDiagonal)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 12, 6, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */