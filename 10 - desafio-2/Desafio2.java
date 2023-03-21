/**
* Desafio: A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de cameras que iria verificar se os carros estao acima de 80km/h. 
* Porem, eles queriam também anotar a placa dos carros no banco de dados para que, a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de habilitação. 
* Para isso, contrataram voce para realizar esse programa, logo que voce fez um trabalho tao bom para a cidade A.
* Lembrando que toda vez que um carro eh pego pela camera e esta acima da velocidade permitida automaticamente ja eh contabilizado uma multa para ele.
*
* @author Marcelo soares
* @since 2023-03-21
*/

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        if (velocidade > 80) {
            multas++;
        }

        if (multas >= 3) {
            System.out.println(multas + " multas. Levou pontos na carteira");
        } else {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}