/**
* Objetivo: fazer um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
* e armqzene-os num vetor. Ao final mostre os numeros e seus sucessores
* e imprima as consoantes.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-02
*/
import java.util.Random;

public class Ex3_NumerosAleatorios{
	public static void main(String[] args){
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++){
			//int numero = random.nextInt(bound:101);
			int numero = random.nextInt(101);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Numeros Aleatorios: ");
		for ( int numero: numerosAleatorios){
			System.out.print(numero + " ");
		}
		
		System.out.println(" ... ");
		System.out.print("Sucessores dos Numeros Aleatorios: ");
		for ( int numero: numerosAleatorios){
			System.out.print((numero+1) + " ");
		}
	}
}


