programa
{
	/*
		*Programa: Exercício 3 (Quadrado)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4

		escreva("Digite o 1° número: ")
		leia(num1)

		escreva("Digite o 2° número: ")
		leia(num2)

		escreva("Digite o 3° número: ")
		leia(num3)

		escreva("Digite o 4° número: ")
		leia(num4)

		num1 = mat.potencia(num1, 2.0)
		num2 = mat.potencia(num2, 2.0)
		num3 = mat.potencia(num3, 2.0)
		num4 = mat.potencia(num4, 2.0)

		se (num3 >= 1000){
			
			limpa()
			escreva("O quadrado do 3° número é: " + num3)
			
		} senao {
			
			limpa()
			escreva(
			"Quadrado do 1° número: " + num1 +
			"\nQuadrado do 2° número: " + num2 +
			"\nQuadrado do 3° número: " + num3 +
			"\nQuadrado do 4° número: " + num4
			)
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */