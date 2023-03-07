/**
* Objetivo: Fazer um programa que peca uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja invalido
* E continue pedindo ate que o usuario informe um valor valido
*
* Alteracao do tipo da variavel nota para "double"
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-02-28
*/
import java.util.Scanner;

public class Ex2_Nota{
    public static void main(String[] args) {
		// Instanciando objeto tipo "Scanner" e declarando variavel nota tipo "double".
		// OBS: a variavel nota inicializa com um valor invalido (-1) para entrar no loop.
        Scanner scanner = new Scanner(System.in);
        double nota = -1; 

		// Inicio do loop. Continua pedindo valor ate que a nota seja valida
        while (nota < 0 || nota > 10) { 
			// Iniciando tratamento de erro de entrada de dados invalidos.
            try {
                System.out.print("Digite a nota (entre 0 e 10): ");
				
				/*  Usado scanner.nextLine() para obter a entrada do usuario como uma string e, 
				* em seguida, o Double.parseDouble() para converter a string em um valor double. 
				* Isso permite lidar com valores invalidos do tipo string 
				* e evitar o loop infinito que poderia ocorrer se fosse usado apenas scanner.nextDouble().
				*/
                nota = Double.parseDouble(scanner.nextLine());

                if (nota < 0 || nota > 10) {
                    System.out.println("Valor invalido! Tente novamente.");
                    System.out.println("...");
                }
			/* A excecao NumberFormatException caso o usuario digite uma entrada que nao pode ser convertida .
			* em um valor double. Entao, eh exibida uma mensagem de erro...	
            */
			} catch (NumberFormatException ex) {
                System.out.println("Entrada invalida! Tente novamente.");
                System.out.println("...");
            }
        }
		// Saindo do loop e exibindo mensagem
        System.out.println(nota + " Eh uma nota valida!");
        System.out.println("Fim do programa");
		//metodo "close()" adicionado para liberar recursos
		scanner.close();
    }
}