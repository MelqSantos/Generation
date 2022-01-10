programa
{
	
	/* 
	- Programa: Exercício 6 (Raiz quadrada)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
{

	// Fórmula --> raizq(X2-X1)^2 + (Y1-Y2)^2"
	
	real X1, X2, Y1, Y2, P1, P2, raiz

	escreva("Digite o número da posição X1: ")
	leia(X1)

	escreva("Digite o número da posição Y1: ")
	leia(Y1)

	escreva("Digite o número da posição X2: ")
	leia(X2)

	escreva("Digite o número da posição Y2: ")
	leia(Y2)

	P1 = mat.potencia((X2 - X1), 2.0)
	P2 = mat.potencia((Y2 - Y1), 2.0)
	raiz = mat.raiz((P1 + P2), 2.0)

	escreva("\nA distância entre eles é: " + mat.arredondar(raiz, 2))
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */