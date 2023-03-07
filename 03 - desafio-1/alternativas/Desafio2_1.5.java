/**
* Desafio 2
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-06
*/
import java.util.Scanner;

public class SequenciaDeBarras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();
        String resultado = gerarSequenciaDeBarras(valor);
        System.out.println(resultado);
        scanner.close();
    }

    public static String gerarSequenciaDeBarras(int valor) {
        String sequencia = "";
        for (int i = 0; i < valor; i++) {
            sequencia += "/";
        }
        return sequencia;
    }

}