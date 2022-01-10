programa
{
	/*
		*Programa: Exercício 7 (Área de um triângulo)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	funcao inicio()
	{
		real base, altura, area

		escreva("Digite o valor da base de um triângulo: ")
		leia(base)

		escreva("Digite o valor de altura de um triângulo: ")
		leia(altura)

		se(base < 0 ou altura < 0){
			escreva("Digite números positivos")
		} senao {

			area = (base * altura) / 2
			escreva("A área do triângulo é: " + area)
				
		}
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */