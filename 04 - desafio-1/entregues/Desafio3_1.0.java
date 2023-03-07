/**
* Desafio 3 : Sua tia Gertrudes é uma leitora assídua. 
* E ela gostaria de ter um aplicativo que dissesse para ela, 
* de acordo com o número de páginas de um livro, quanto tempo ela 
* levaria para ler lendo apenas 3 páginas por dia. Como você está 
* aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-06
*/

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de paginas: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        int calculo = (paginas / paginasLidas);
        System.out.print(calculo + " dias");

    }
}