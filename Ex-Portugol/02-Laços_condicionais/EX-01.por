programa
{
	/*
		*Programa: Exercício 1 (Tomate)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, excesso, multa = 0.0

		escreva("Digite o peso do tomate(kg): ")
		leia(peso)

		se (peso > 50){
			
			excesso = mat.arredondar((peso / 50), 0)
			multa = (multa + 4.0) * excesso
		} 

		escreva("PESO: " + peso + "Kg: " +
		"\nMulta: R$ " + multa )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */