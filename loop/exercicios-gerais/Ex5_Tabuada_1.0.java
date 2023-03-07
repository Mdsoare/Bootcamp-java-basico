/**
* Objetivo: Desenvolver um gerador de tabuada,
* Capaz de gerar uma tabuada de qualquer numero inteiro entre 1 e 10.
* O usuario deve imformar de qual numero ele deseja ver a tabuada.
* A saida deve ser conforme o exemplo abaixo:
*
* Tabuada de 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-01
*/
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabuada;
        
        System.out.print("Digite a tabuada que deseja exibir [1-10]: ");
        tabuada = scanner.nextInt();
        
        System.out.printf("Tabuada de %d:\n", tabuada);
        
        for (int i = 1; i <= 10; i++) {
            int valor = tabuada * i;
            System.out.printf("%d X %d = %d%n", tabuada, i, valor);
        }
        
        System.out.println("Fim da execucao!");
        scanner.close();
    }
}
