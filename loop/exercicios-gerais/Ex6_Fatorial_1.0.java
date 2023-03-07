/**
* Objetivo: Desenvolver um programa que calcule 
* o fatorial de um numero inteiro fornecido pelo usuario
* Ex.: 5! = 120
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-01
*/
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		int fatorial;
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = scanner.nextInt();
		
		if (numero == 0 || numero == 1) {
			 System.out.println(numero + "! = " + 1);
		} else {
		    fatorial = numero;
			int count = (fatorial - 1);
			
			while(count > 0){
				fatorial *= count;
				count--;	
			}
			System.out.println(numero + "! = " + fatorial);
		}
        scanner.close();
		
	}
	
}