/**
* Objetivo: Gerar e imprimir uma matriz M 4X4 com valores aleatorios entre 0-9. 
* 
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-02
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[][] M = new int[4][4];
		
		for(int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++){
				M[i][j] = random.nextInt(10);	
			}
		}
		//Uso do foreach como exemplo:
		//System.out.println("Matriz M: ");
		for (int[] linha : M){
			for (int coluna : linha){
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}
}