/**
* Objetivo: Desenvolver um programa que calcule 
* o fatorial de um numero inteiro fornecido pelo usuario
* Ex.: 5! = 120
*
* Melhor organizacao do codigo separando a logica de calculo para o metodo "calcularFatorial()"
* Tratamento de erros para valores invalidos digitados pelo usuario
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-01
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fatorial;
		
		try {
			System.out.print("Digite um numero inteiro: ");
			fatorial = scanner.nextInt();
			
			if (fatorial < 0) {
				throw new IllegalArgumentException("O numero deve ser maior ou igual a zero.");
				}
			
			int resultado = calcularFatorial(fatorial);
			
			System.out.println(fatorial + "! = " + resultado);
			System.out.println("Fim do programa!");
		
		} catch (InputMismatchException e) {
			System.out.println("Erro: o valor inserido nao e um numero inteiro valido.");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static int calcularFatorial(int valor) {
		if (valor == 0 || valor == 1) {
			return 1;
		} else {
			int fatorial = valor;
			int count = valor - 1;

			while (count > 0) {
				fatorial *= count;
				count--;
			}

			return fatorial;
		}
	}
}