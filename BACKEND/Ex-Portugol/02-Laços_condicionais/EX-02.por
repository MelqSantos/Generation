programa
{
	/*
		*Programa: Exercício 2 (Horas trabalhadas)
		*Autor: Melqui Santos
		*Data: 28/10/2021
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real codigo, numero
		real excesso = 0.0, salario = 0.0, extra = 0.0, horaExcedente = 0.0

		escreva("Digite o código do funcionário: ")
		leia(codigo)

		escreva("Digite o número de horas trabalhadas: ")
		leia(numero)

		se (numero > 50){
			
			excesso = (numero - 50) + horaExcedente
			extra = 20.0 * excesso
			salario = (10.0 * numero)
			
		} senao {
			salario = (10.0 * numero)
		}

		escreva("Valor das horas trabalhadas : R$ " + salario )
		escreva("\nValor das horas extras : R$ " + extra )
		escreva("\nSalário total : R$ " + (salario + extra))
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */