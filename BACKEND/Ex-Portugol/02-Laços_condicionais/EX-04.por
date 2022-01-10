programa
{
	/*
		*Programa: Exercício 4 (Ímpar ou par)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		
		// Validação inicial - Verifica se é 0 ou negativo
		se (numero < 0){
			
			escreva("\nO número " + numero + " é negativo.")
			
		} senao se(numero == 0){
			
			escreva("\nO número digitado é 0")
				
		}

		// Segundo bloco de validação - Se for maior que 0 verifica se é par ou ímpar
			
		se (numero % 2 == 0 e numero != 0){
			
			escreva("\nO número " + numero + " é par.")
			
		} senao se(numero != 0){
			
				escreva("\nO número " + numero + " é ímpar.")
			}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */