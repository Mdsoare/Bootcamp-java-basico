/**
* Desafio 3
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-06
*/

import java.util.Scanner;

public class CalculoLeitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Digite o numero total de paginas do livro: ");
            int numPaginas = input.nextInt();

            if (numPaginas <= 0) {
                throw new Exception("O numero de paginas deve ser um valor positivo e maior que zero.");
            }

            int numDias = (int) Math.ceil(numPaginas / 3.0);

            System.out.println("Serao necessarios " + numDias + " dias para terminar a leitura do livro.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        input.close();
    }
}
