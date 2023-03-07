/**
* Objetivo: Criar um vetor de 6 numeros inteiros
* E mostra-los na ordem inversa atraves de um metodo
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-02
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_OrdemInversa {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		// ler 6 numeros do usuario
		int[] numeros = new int[6];
        
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.print("Digite o numero " + (i+1) + ": ");
				numeros[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Erro: voce deveria digitar um numero valido. Fim do programa!");
				System.exit(0);
			}
		}

		// Ordem inversa do array
		reverseArray(numeros);
		System.out.println("Ordem inversa: " + Arrays.toString(numeros));
		scanner.close();
	}

	// Metodo para inverter o array
	public static void reverseArray(int[] array){
		for(int i=0; i<array.length/2; i++){
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
}