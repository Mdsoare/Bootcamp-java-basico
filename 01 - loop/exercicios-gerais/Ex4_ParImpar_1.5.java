/**
* Objetivo: Fazer um programa que peca N numeros inteiros
* Calcule e mostre a quantidade de numeros pares 
* E a quantidade de numeros impares
*
* Realizado tratamento de erros
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-01
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros = 0, numero = 0, quantPar = 0, quantImpar = 0;

        System.out.print("Digite a quantidade de numeros inteiros: ");
        try {
            quantNumeros = scan.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entrada invalida. Eh necessario inserir um numero inteiro.");
            System.exit(1);
        }

        for (int i = 0; i < quantNumeros; i++) {
            System.out.print("Digite um numero: ");
            try {
                numero = scan.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Entrada invalida. Eh necessario inserir um numero inteiro.");
                scan.nextLine(); // descarta a entrada invalida
                i--; // decrementa o contador para nao contar a entrada invalida
                continue; // volta ao inicio do loop
            }

            if (numero % 2 == 0) {
                quantPar++;
            } else {
                quantImpar++;
            }
        }

        System.out.println("A quantidade de numeros pares digitados eh: " + quantPar);
        System.out.println("A quantidade de numeros impares digitados eh: " + quantImpar);
		scan.close();
    }
}