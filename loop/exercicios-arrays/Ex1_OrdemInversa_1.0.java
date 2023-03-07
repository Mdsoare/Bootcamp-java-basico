/**
* Objetivo: Criar um vetor de 6 numeros inteiros
* E mostra-los na ordem inversa com while
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-02
*/
public class Ex1_OrdemInversa {
	
	public static void main(String[] args){
		
		int[] vetor = {1, 2, 3, 4, 5, 6};
		int count = 0;
		int count2 = (vetor.length-1);
		
		System.out.println("Vetor na ordem original: ");
		while (count < (vetor.length)){
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println(" ");
		System.out.println("\nVetor na ordem inversa: ");
		while(count2 >= 0) {
			System.out.print(vetor[count2] + " ");
			count2--;
		}
	}
}