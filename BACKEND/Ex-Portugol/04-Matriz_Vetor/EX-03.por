programa
{
	/* 
	* Exercício 3
	* Autor: Melqui Santos
	* Data: 04-11-2021
	*/
	
	funcao inicio()
	{

	real N1[4][6] = {
			{30.0, 20.0, 30.0, 40.0, 50.0, 60.0},
			{10.0, 40.0, 30.0, 40.0, 50.0, 60.0},
			{10.0, 20.0, 50.0, 40.0, 50.0, 60.0},
			{10.0, 20.0, 30.0, 60.0, 50.0, 70.0}
			},

		N2[4][6] = {
			{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
			{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
			{10.0, 20.0, 30.0, 40.0, 50.0, 60.0},
			{10.0, 20.0, 30.0, 40.0, 50.0, 60.0}
			}
	
	real M1[4][6], M2[4][6]
	
	
	para(inteiro l = 0; l < 4; l++){
		para(inteiro c = 0; c < 6; c++){
			// Adiciona na M1 a soma dos itens da mesma posição na N1 e N2
			M1[l][c] = N1[l][c] + N2[l][c]
			
			// Adiciona na M1 a diferença dos itens da mesma posição na N1 e N2
			M2[l][c] = N1[l][c] - N2[l][c]
		}
	}

	// Mostra a M1
	para(inteiro l = 0; l < 4; l++){
		para(inteiro c = 0; c < 6; c++){
				se(l == 0 e c == 0){
					escreva("Valores da matriz M1")
					escreva("\n")
				}
				escreva(M1[l][c] + " ")
			}
			escreva("\n")
		}

		// Mostra a M2
	para(inteiro l = 0; l < 4; l++){
		para(inteiro c = 0; c < 6; c++){
				se(l == 0 e c == 0){
					escreva("\nValores da matriz M2")
					escreva("\n")
				}
				escreva(M2[l][c] + " ")
			}
			escreva("\n")
		}
		
	}
	
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */