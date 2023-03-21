/**
* Objetivo: Codigo refatorado para coleta de dados com Scanner;
*
* @author Marcelo Soares
* @since 2023-03-20
*/

import java.util.Scanner;

//Fazer a divisao de 2 valores inteiros
public class UncheckedException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLooping = true;
        do {
            String a, b;
            System.out.print("");
            System.out.print("Numerador: ");
            a = scanner.nextLine();
            System.out.print("");
            System.out.print("Denominador: ");
            b = scanner.nextLine();
			
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.print("");
                System.out.print("Entrada invalida, informe um numero inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.print("");
                System.out.print("Impossivel dividir um numero por 0.");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O codigo continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}