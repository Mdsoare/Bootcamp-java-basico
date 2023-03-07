/**
* Objetivo: Fazer um programa que leia 5 numeros 
* e informe o maior e a media desses numeros
*
* Sem tratamento de erros:
* Usuario digitar valores invalidos 
* Retorna "0" para variavel "maior", se o usuario digitar apenas numeros negativos
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-01
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia{
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		int soma = 0;
		int media = 0;
		int contador = 0;
		
		do {
			System.out.print("Digite um numero: ");
			numero = scan.nextInt();
			soma += numero;
			if (numero > maior) maior = numero;
			++contador;
		}while(contador < 5);
	System.out.println("***************************************");
	System.out.println("O maior numero digitado eh: " + maior);
	System.out.println("A media dos numeros digitados eh: " + (soma/5));
	System.out.println("***************************************");
	System.out.println("Fim do programa!");
	scan.close();
	}
}