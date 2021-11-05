programa
{
	/* 
	- Programa: Exercício 3 (Evento)
	- Autor: Melqui Santos
	- Data: 27/10/2021
	*/
	
	funcao inicio()
{
	
		real horaInicio, horaFim, hr,  min, seg

		escreva("Horário de início do evento (horas): ")
		leia(horaInicio)

		escreva("Horário de Encerramento do evento (horas): ")
		leia(horaFim)
		
		hr =  horaFim - horaInicio
		min = hr * 60
		seg = min * 60

		escreva("Duração do evento (hrs) : " + hr +
		 "\n" + "Duração do evento (min) : " + min +
		 "\n" + "Duração do evento (seg) : " + seg
		)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */