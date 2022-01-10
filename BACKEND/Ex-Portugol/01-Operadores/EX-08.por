programa
{
	
	/* 
	- Programa: Exercício 8 (Porcentagem)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio() {
	real custoC, custoF, percDistribuidor = 0.28, impostos = 0.45

		escreva("Qual o custo de fábrica do carro? ")
		leia(custoF)

		custoC = custoF + ( percDistribuidor * custoF ) + ( impostos * custoF )
		escreva("O custo ao consumidor é: R$ ", mat.arredondar(custoC, 2))
	
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */