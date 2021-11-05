programa{
	
	inclua biblioteca Calendario --> data

	/* 
	- Programa: Exercício 1 (Idade)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	
	funcao inicio(){
	
		inteiro idade, anoNasc, dia, mes, atual

		escreva("Qual o dia de seu nascimento? ")
		leia(dia)

		escreva("Qual o mês de seu nascimento? ")
		leia(mes)

		escreva("Qual o ano de seu nascimento? ")
		leia(anoNasc)

		idade = data.ano_atual() - anoNasc
		mes = (idade * 12) + data.mes_atual()

		escreva( idade + " anos | " + mes + " meses | " + ((mes * 30) + (30 - dia)) + " dias.")


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */