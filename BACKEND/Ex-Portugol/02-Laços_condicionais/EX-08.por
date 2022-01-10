programa
{
	/*
		*Programa: Exercício 8 (Variável > 100)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	funcao inicio()
	{
		real numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero > 100){
			
			escreva("Variável é: " + numero)
		
		} senao {
			
			numero = 0.0
			escreva("Variável é: " + numero)	
		
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */