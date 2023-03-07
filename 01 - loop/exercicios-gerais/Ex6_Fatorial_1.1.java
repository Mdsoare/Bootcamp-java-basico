/**
* Objetivo: Desenvolver um programa que calcule 
* o fatorial de um numero inteiro fornecido pelo usuario
* Ex.: 5! = 120
*
* Uso do for no lugar do while
*
* @author Marcelo Soares
* @version 1.1
* @since 2023-03-01
*/
import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fatorial;
		
	    System.out.print("Digite um numero inteiro positivo: ");
		fatorial = scanner.nextInt();
    
		if (fatorial < 0) {
			System.out.println("Numero invalido. O numero deve ser inteiro e positivo.");
		} else if (fatorial == 0 || fatorial == 1) {
			System.out.println(fatorial + "! = 1");
		} else {
			int numero = fatorial;
			for (int i = fatorial-1; i >= 1; i--){
				fatorial *= i;
			}
			System.out.println(numero + "! = " + fatorial);
		}
		//System.out.println("Fim do programa!");
		scanner.close();
	}
}

