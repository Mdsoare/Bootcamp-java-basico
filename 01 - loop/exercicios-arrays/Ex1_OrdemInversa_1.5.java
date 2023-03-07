/**
* Objetivo: Criar um vetor de 6 numeros inteiros
* E mostra-los na ordem inversa com for
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-02
*/
public class Ex1_OrdemInversa {
	
	public static void main(String[] args){
		
		int[] vetor = {1, 2, 3, 4, 5, 6};

		System.out.print("Vetor na ordem original: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("\nVetor na ordem inversa: ");
		for (int i = (vetor.length-1); i >= 0; --i){
			System.out.print(vetor[i] + " ");
		}
	}
}