programa
{
	/*
		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		*Autor: Melqui Santos - Turma 39
		*Data: 29/10/21
	*/

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro cont, habitantes = 0
		real salario, filhos, somaSalario = 0.0, somaFilhos = 0.0, maior = 0.0, perc = 0.0


		para (cont = 20; cont > 0; cont--){
			
			limpa()
			
			escreva("Informe seu salário: ")
			leia(salario)

			escreva("Informe a quantidade de filhos: ")
			leia(filhos)

			habitantes++

			// Soma o salário e filhos de todos os habitantes.
			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + filhos

			// Condições para salário menor que 100 e para verificar o maior salário.
			se(salario < 100){
				perc = perc++	
			}

			se(salario > maior){
				maior = salario
			}

		}
		
		limpa()
		perc = (perc * 100) / habitantes

		// Lê as variáveis de soma e divide pelos habitantes para verificar a média.
		escreva("Pesquisa realizada com " + habitantes + " habitantes...")
		escreva("\nMédia do salário da população: R$ " + somaSalario/habitantes)
		escreva("\nMédia de filhos: " + mat.arredondar((somaFilhos/habitantes), 0) + " filho(s)")
		escreva("\nMaior salário: R$ " + maior)
		escreva("\nPessoas com até R$ 100 de salário: " + perc + "%")
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