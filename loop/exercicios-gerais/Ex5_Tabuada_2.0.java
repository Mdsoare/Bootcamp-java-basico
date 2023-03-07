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
*
* Insercao de tratamento de erros para valores invalidos:
* adicionado um loop com "while" para permitir que o usuario insira um valor valido;
* Dentro do loop, eh feita a leitura da entrada com o metodo "nextInt()" do objeto Scanner;
* Se o valor lido nao estiver no intervalo [1, 10], eh lancada uma excecao "InputMismatchException";
* Se a excecao for capturada, eh exibida uma mensagem de erro e a entrada eh descartada com o metodo "nextLine()" do objeto "Scanner";
* Se o valor lido for valido, eh interrompido o loop e o programa continua normalmente.
*
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-01
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabuada = 0;
        
        while (true) {
            try {
                System.out.print("Digite a tabuada que deseja exibir [1-10]: ");
                tabuada = scanner.nextInt();
                
                if (tabuada < 1 || tabuada > 10) {
                    throw new InputMismatchException();
                }
                
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido! Digite um numero inteiro entre 1 e 10.");
                scanner.nextLine();
            }
        }
        
        System.out.printf("Tabuada de %d:\n", tabuada);
        
        for (int i = 1; i <= 10; i++) {
            int valor = tabuada * i;
            System.out.printf("%d X %d = %d%n", tabuada, i, valor);
        }
        
        System.out.println("Fim da execucao!");
        scanner.close();
    }
}