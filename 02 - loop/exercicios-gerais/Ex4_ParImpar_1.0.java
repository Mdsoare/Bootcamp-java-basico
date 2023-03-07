/**
* Objetivo: Fazer um programa que peca N numeros inteiros
* Calcule e mostre a quantidade de numeros pares 
* E a quantidade de numeros impares
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-01
*/
import java.util.Scanner;

public class Ex4_ParImpar{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int quantNumeros = 0, numero = 0, quantPar = 0, quantImpar = 0;
		
		System.out.println("Digite a quantidade de numeros inteiros: ");
		quantNumeros = scan.nextInt();
		
		for (int i = 0; i < quantNumeros; i++){
				System.out.println("Digite um numero: ");
				numero = scan.nextInt();
				if (numero % 2 == 0) ++quantPar;
				else ++quantImpar;
		}
		System.out.println("A quantidade de numeros pares digitados eh: " + quantPar);
		System.out.println("A quantidade de numeros impares digitados eh: " + quantImpar);
		scan.close();
	}
}