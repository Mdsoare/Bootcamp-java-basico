/**
* Desafio: No show da famosa banda Blue Cold Ice Cubes o vocalista, Antonio Queda, 
* escolheu todas as pessoas que estavam na posicao impar da fila para entrarem no camarote. 
* Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posicoes. 
* Voce resolveu criar um programa para saber, de acordo com o numero de pessoas na fila, quantas entrariam no camarote.
*
* @author Marcelo soares
* @since 2023-03-21
*/
import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        for (int i = 1; i <= tamanhoDaFila; i++) {
            if (i % 2 != 0) {
                pessoasNoCamarote++;
            }
        }
        
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}