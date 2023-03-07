/**
* Objetivo: Fazer uma calculadora basica 
* solicitando ao usuatio o tipo de operacao e dois numeros inteiros
* Como requisito: usar metodos auxiliares para cada operacao
* Adicionato tratamentos de erros de entrada de dados e erro de divisão por zero.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-03
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operacao = obterOperacao(scan);
        int numero1 = obterNumero(scan, "Digite o primeiro numero: ");
        int numero2 = obterNumero(scan, "Digite o segundo numero: ");

        int resultado = 0;

        switch (operacao.toLowerCase()) {
            case "a":
                resultado = adicao(numero1, numero2);
                break;
            case "s":
                resultado = subtracao(numero1, numero2);
                break;
            case "m":
                resultado = multiplicacao(numero1, numero2);
                break;
            case "d":
                try {
                    resultado = divisao(numero1, numero2);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Impossivel divisao por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida.");
                return;
        }

        System.out.println("O valor da " + obterDescricaoOperacao(operacao) + " eh: " + resultado);
    }

    public static String obterOperacao(Scanner scan) {
        while (true) {
            System.out.println("Selecione a operacao desejda: ");
            System.out.print("\nA - Adicao \nS - Subtracao \nM - Multiplicacao ou \nD - Divisao \n[ASMD]: ");
            String operacao = scan.nextLine();
            if (operacao.length() == 1 && "asmd".contains(operacao.toLowerCase())) {
                return operacao;
            } else {
                System.out.println("Operacao invalida. Tente novamente.");
            }
        }
    }

    public static int obterNumero(Scanner scan, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Tente novamente.\n");
                scan.nextLine(); // descartar entrada invalida do scanner
            }
        }
    }

    public static String obterDescricaoOperacao(String operacao) {
        switch (operacao.toLowerCase()) {
            case "a":
                return "adicao";
            case "s":
                return "subtracao";
            case "m":
                return "multiplicacao";
            case "d":
                return "divisao";
            default:
                return "ERROR";
        }
    }

    public static int adicao(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int divisao(int numero1, int numero2) throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("Impossivel divisao por zero.");
        }
        return numero1 / numero2;
    }

}