/**
* Objetivo: Fazer um programa que leia 5 numeros 
* e informe o maior e a media desses numeros
*
* Solucao para o uso de array, trocando o do-while pelo for
* Tratando o maior numero e a media com metodos de array
* Tratamento para entrada de dados invalida
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-01
*/
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ler 5 numeros do usuario
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.print("Digite o numero " + (i+1) + ":");
                numeros[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Erro: voce deve digitar um numero valido!");
                System.exit(0);
            }
        }

        // calcular a media
        double media = Arrays.stream(numeros).average().orElse(0);

        // encontrar o maior numero
        double maior = Arrays.stream(numeros).max().orElse(0);

        // imprimir os resultados
		System.out.println("***************************************");
        System.out.println("O maior numero eh " + maior);
        System.out.println("A media dos numeros eh " + media);
		System.out.println("***************************************");
		System.out.println("Fim do programa!");
		scanner.close();
    }
}