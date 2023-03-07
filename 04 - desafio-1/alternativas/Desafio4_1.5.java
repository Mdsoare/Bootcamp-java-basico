/**
* Desafio 4
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-06
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class DocesAleatorios {
    private static final int DOCE_POR_REAL = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em reais: ");

        try {
            double valorEntrada = scanner.nextDouble();
            int quantidadeDoces = (int) (valorEntrada * DOCE_POR_REAL);
            System.out.println("O cliente obteve " + quantidadeDoces + " doces");
        } catch (InputMismatchException e) {
            System.out.println("Valor de entrada invalido. Por favor, digite um valor numerico.");
        }
    }
}

