/**
* Objetivo: fazer um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
* e armqzene-os num vetor. Ao final mostre os numeros e seus sucessores
* e imprima as consoantes.
*
* Tratamento de erros e criacao da contante TAMANHO_DO_ARRAY para melhor organizacao do codigo
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-02
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
	
	private static final int TAMANHO_DO_ARRAY = 20;
	
	public static void main(String[] args) {
		Random random = new Random();
		int[] numerosAleatorios = new int[TAMANHO_DO_ARRAY];

		try {
			for (int i = 0; i <= numerosAleatorios.length - 1; i++) {
				int numero = random.nextInt(101);
				numerosAleatorios[i] = numero;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao gerar numeros aleatorios: " + e.getMessage());
			return;
			/*  comando "return" serve para encerrar a execucao do metodo "main"
			* em caso de excecao lancada pelo metodo "nextInt" da classe "Random". 
			* Ao se deparar com uma excecao desse tipo, o programa exibe a mensagem de erro 
			* que pode ser obtida por meio do metodo "getMessage" da excecao e encerra a 
			* execucao do metodo "main", sem executar o restante do codigo que imprime os 
			* valores dos numeros aleatorios e seus sucessores.
			* Note que o return nao retorna o e.getMessage(), ele apenas interrompe a execucao do metodo "main". 
			* O e.getMessage() eh usado apenas para obter a mensagem de erro associada a excecao e imprimi-la na tela.
			*/
		}

		System.out.print("Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}

		System.out.println(" ... ");

		System.out.print("Sucessores dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	}
}