programa{	
	/* 
	- Programa: Exercício 7 (Equação linear)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	funcao inicio() {
		
		real a, b, c, d, E, f
		real x, y

		escreva("Digite o coeficiente A: ")
		leia(a)

		escreva("Digite o coeficiente B: ")
		leia(b)

		escreva("Digite o coeficiente C: ")
		leia(c)

		escreva("Digite o coeficiente D: ")
		leia(d)

		escreva("Digite o coeficiente E: ")
		leia(E)

		escreva("Digite o coeficiente F: ")
		leia(f)
		
		x = ((c*E) - (b*f)) / ((a*E) - (b*d))
		y = ((a*f) - (c*d)) / ((a*E) - (b*d))

		escreva("\nValor de X é: " + x)
		escreva("\nValor de Y é: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */