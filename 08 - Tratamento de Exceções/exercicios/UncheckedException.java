/**
* Codigo criado pela instrutora Camila. Comentarios adicionados por mim (Marcelo Soares)
*/

import javax.swing.*; // a biblioteca possibilita o desenvolvimento de interfaces elaboradas com interacao mais agradavel. 

//Fazer a divisao de 2 valores inteiros
public class UncheckedException { // criacao da classe principal 
    public static void main(String[] args) { // metodo padrao para execucao 

        boolean continueLooping = true; // variavel de controle para loop do-while 
        do { // forca a execucao pelo menos uma vez antes de testar logica com while 
            String a = JOptionPane.showInputDialog("Numerador: "); // objetos responsavel por coletar string por meio de caixa de dialogo 
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{ // inicia o tratamento de excecoes 
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b)); // parse de String para int
                System.out.println("Resultado: " + resultado); // imprime o resultado
                continueLooping = false; // altera o valor da variavel de controle caso nao apresente erro e encerra o loop
            } catch (NumberFormatException e) { // trata excecao para entrada invalida
                e.printStackTrace(); // exibe a pilha de erro
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro! " + e.getMessage()); // imprime msg de erro. O loop neste caso persiste  
            } catch (ArithmeticException e) { // trata excecao de erro aritimetico para denominador "0"
                e.printStackTrace(); // exibe a pilha de erro
                JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por 0."); // imprime msg de erro. O loop neste caso persiste  
            }
            finally { // executa trecho de codigo independente de erro 
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping); // testa a variavel, se true inica / continua loop


        System.out.println("O codigo continua..."); // ao finalizar o loop exibe msg
    }

    public static int dividir(int a, int b) { // metodo auxiliar para retorno de divisao
        return a / b;
    }
}