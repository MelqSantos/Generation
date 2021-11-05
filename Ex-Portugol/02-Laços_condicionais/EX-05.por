programa
{
	/*
		*Programa: Exercício 5 (Variável > 100)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	funcao inicio()
	{

		// ìndice aceitável - 0,05 até 0,25
		// Suspender as atividades (Grupo 1) - 0,3
		// Suspender as atividades (Grupo 1 e Grupo 2) - 0,4
		// Suspender as atividades (Todos) - 0,5
		
		real indice

		escreva("Qual o índice de poluição atual? ")
		leia(indice)

		se (indice <= 0.25){
			
			escreva("O índice de poluição " + indice + " está dentro do aceitável!")	
			
		} senao se (indice > 0.25 e indice <= 0.3){
			
			escreva("O índice está com " + indice + ", indústrias do grupo 1 devem suspender suas atividades!")
			
		} senao se (indice > 0.3 e indice <= 0.4){
			
			escreva("O índice está com " + indice + ", indústrias do grupo 1 e 2 devem suspender suas atividades!")
			
		} senao se (indice > 0.4 e indice <= 5){
			
			escreva("O índice está com " + indice + ", indústrias de todos os grupos devem suspender suas atividades!")
			
		} senao {
			
			escreva("O índice está com " + indice + ", sem classificação!")
			
		}

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1056; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */