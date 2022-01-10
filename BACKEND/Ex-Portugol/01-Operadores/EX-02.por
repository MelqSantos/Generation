programa
{
	
	
inclua biblioteca Calendario 

	/* 
	- Programa: Exercício 2 (Idade)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	
	funcao inicio()
{
	
		inteiro idade, ano, dias, mes

		escreva("Quantos dias de vida você tem? ")
		leia(dias)

		idade = dias / 365
		ano = Calendario.ano_atual() - idade
		mes = idade * 12

		escreva("Você tem: " + idade + " anos " +
		"\nNasceu em: " + ano +
		"\n" + mes + " meses atrás..." +
		"\n" + dias + " dias atrás..."
		)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */