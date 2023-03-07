/**
* Objetivo: Gerar e imprimir uma matriz M 4X4 com valores aleatorios entre 0-9. 
* 
* Uso de constantes "MATRIX_SIZE" e "MAX_RANDOM_VALUE" para tornar o codigo mais legivel
* Tratamento de excecoes com o bloco try-cacth
* A saida da matriz foi aprimorada para usar a saida padrao em vez da saida de erro
* A clausula finally foi adicionada para garantir que o objeto Random seja fechado corretamente, mesmo que ocorra uma excecao.
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-02
*/
import java.util.Random;

public class Ex4_ArrayMultidimensional {

	private static final int MATRIX_SIZE = 4;
	private static final int MAX_RANDOM_VALUE = 10;

	public static void main(String[] args) {
		
		Random random = null;
		try {
			random = new Random();
			int[][] M = new int[MATRIX_SIZE][MATRIX_SIZE];
		
			for(int i = 0; i < M.length; i++){
				for (int j = 0; j < M[i].length; j++){
					M[i][j] += random.nextInt(MAX_RANDOM_VALUE);	
				}
			}
			
			//System.out.println("Matriz:");
			for (int[] linha : M){
				for (int coluna : linha){
					System.out.print(coluna + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		} finally {
			if (random != null) {
				random = null;
			}
		}
	}
}
