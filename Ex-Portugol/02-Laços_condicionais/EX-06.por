programa
{
	/*
		*Programa: Exercício 6 (Nadador)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		se (idade <= 4){
			
			escreva("Idade inválida ou não permitida!")	
			
		} senao se (idade >= 5 e idade <= 7 ){
			
			escreva("Você se enquadra na categoria Infantil A!")
			
		}senao se (idade >= 8 e idade <= 11 ){
			
			escreva("Você se enquadra na categoria Infantil B!")
			
		}senao se (idade >= 12 e idade <= 13 ){
			
			escreva("Você se enquadra na categoria Juvenil A!")
			
		}senao se (idade >= 14 e idade <= 17 ){
			
			escreva("Você se enquadra na categoria Juvenil B!")
			
		} senao {
			
			escreva("Você se enquadra na categoria Adultos!")	
			
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */