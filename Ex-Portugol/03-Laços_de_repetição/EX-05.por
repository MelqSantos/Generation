programa
{
	
	/*	
		1- Faça um programa que mostre uma contagem na tela de 233 a 456,
		só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		*Autor: Melqui Santos - Turma 39
		*Data: 29/10/21
	*/
	
	funcao inicio()
	{	
		inteiro num = 0, cont = 233
		
		faca{
			escreva("\n" + cont)

			// Conta de 1 em 1.
			se(cont >= 233 e cont < 300){

				cont++
			// Conta de 3 em 3.
			} senao se (cont >= 300 e cont <= 400){
				
				cont = cont + 3
			// Conta de 5 em 5.
			} senao{

				cont = cont + 5
				
			}

		} enquanto(cont <= 456)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 211; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */