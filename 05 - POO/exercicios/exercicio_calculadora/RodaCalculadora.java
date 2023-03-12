/**
* Objetivo: Criar a classe "RodaCalculadora" para execucao da "Calculadora" 
* 
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-10
*/

import java.util.Scanner;

public class RodaCalculadora {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String operacao;

        System.out.println("Bem-vindo a calculadora!");

        // Solicita o primeiro numero
        System.out.print("Digite o primeiro numero: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada invalida. Digite um numero valido: ");
            scanner.nextLine();
        }
        num1 = scanner.nextDouble();

        // Solicita o segundo numero
        System.out.print("Digite o segundo numero: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada invalida. Digite um numero valido: ");
            scanner.nextLine();
        }
        num2 = scanner.nextDouble();

        // Solicita a operacao
        System.out.print("Digite a operacao (+, -, *, /): ");
        operacao = scanner.next();

        // Valida a operacao e realiza o calculo correspondente
        OperacaoMatematica calculadora = new Calculadora();
        double resultado;
        switch (operacao) {
            case "+":
                resultado = calculadora.adicao(num1, num2);
                break;
            case "-":
                resultado = calculadora.subtracao(num1, num2);
                break;
            case "*":
                resultado = calculadora.multiplicacao(num1, num2);
                break;
            case "/":
                try {
                    resultado = calculadora.divisao(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
