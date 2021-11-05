programa
{
	/*
		1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos
		e apresente no final o total do somatório, a média e o total de valores lidos.
		O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos.
		Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		*Autor: Melqui Santos - Turma 39
		*Data: 29/10/21
	*/
	
	funcao inicio()
	{	
		inteiro quantidade = 0
		real num = 1.0, soma = 0.0, media = 0.0

		enquanto(num > 0){
			limpa()
			
			escreva("Digite um número: ")
			leia(num)
			
			se(num > 0){
				
				quantidade++
				soma = soma + num
				media = soma / quantidade
			}
			
		}
		
		limpa()
		escreva("Soma dos números digitados: " + soma)
		escreva("\nMédia dos números digitados: " + media)
		escreva("\nTotal de números digitados: " + quantidade)
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