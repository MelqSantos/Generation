package br.com.generation.exercicios;

import java.util.Scanner;

/*
 4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
    Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
    Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; OK
•	o número de pessoas calmas com menos de 18 anos. OK*/

public class EX04 {

	public static void main(String[] args) {
		
		// Contadores.
		int cont = 1, qtdParticipantes = 0;
		
		// Dados da pessoa.		
		int idade, sex, personalidade;
		
		// Pessoas e personalidades - Usado para contagem.
		int qtdCalmos = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, maior40Nervoso = 0, menor18Calmo = 0; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantas pessoas irão participar da pesquisa? ");
		qtdParticipantes = leia.nextInt();
		
		while(cont <= qtdParticipantes) {
			
			/* ---------------- Entrada de dados ---------------- */
			
			System.out.println("+--------- " + cont + "° Cadastro ---------+");
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			
			// Identificação da identidade de gênero da pessoa.
			System.out.print("Você se identifica com qual gênero abaixo? " +
								"\nDigite o número correspondente: [1] Feminino [2] Masculino [3] Outros: ");
			sex = leia.nextInt();
			
			if(sex > 3) {
				System.out.println("Opção inválida, programa finalizado...");
				break;
			}
			
			// Identificação da personalidade da pessoa.
			System.out.print("\nComo você considera sua personalidade? " +
								"\nDigite o número correspondente: [1] Calmo(a) [2] Nervoso(a) [3] Agressivo(a): ");
			personalidade = leia.nextInt();
			
			if(personalidade > 3) {
				System.out.println("Opção inválida, programa finalizado...");
				break;
			}
			
			/* ---------------- Detalhamento do perfil da pessoa atual ---------------- */
			
			// Calmos
			if(personalidade == 1) {
				qtdCalmos++; 
			}
			
			// Mulheres nervosas
			if(sex == 1 && personalidade == 2) {
				mulherNervosa++; 
			}
			
			// Homens agressivos
			if(sex == 2 && personalidade == 3) {
				homemAgressivo++; 
			}
			
			// Outros calmos
			if(sex == 3 && personalidade == 1) {
				outrosCalmos++;
			}
			
			// Maiores de 40 anos nervosos
			if(idade > 40 && personalidade == 2) {
				maior40Nervoso++;
			}
			
			// Menores de 18 anos calmos
			if(idade < 18 && personalidade == 1) {
				menor18Calmo++;
			}
			
			cont++;
			
			// Pula uma linha e informa a finalização do cadastro atual.
			System.out.println();
		}
		
		// Mostra as informações caso o usuário faça pelo menos 1 cadastro.
		if(cont > 1 ) {
			System.out.println("Pessoas calmas: " + qtdCalmos + " pessoa(s)");
			System.out.println("Mulheres nervosas: " + mulherNervosa + " mulhere(s)");
			System.out.println("Homens agressivos: " + homemAgressivo + " homen(s)");
			System.out.println("Outros gêneros calmos: " + outrosCalmos + " pessoa(s)");
			System.out.println("Pessoas maiores de 40 anos nervosas: " + maior40Nervoso + " pessoa(s)");
			System.out.println("Pessoas calmas menores de 18 anos: " + menor18Calmo + " pessoa(s)");
			System.out.println("\nTotal de participantes: " + qtdParticipantes + " pessoa(s)");
		}
		
		leia.close();
	}

}
