/**
* Desafio : Voce levou sua namorada na incrivel rede de lanchonetes Dc'Monalds e ficou maravilhado como aquele lanche era gostoso. 
* Porem, ficou horrorizado como algumas coisas no aplicativo do cardapio estavam erradas. 
* Entao, voce se ofereceu para ajuda-los com seus conhecimentos de programacao. 
* Ao conversar com o gerente, ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:
* Pao
* Presunto
* Carne
* Pao
*
* Ajude o restaurante a programar isso.
*
* @author Marcelo soares
* @since 2023-03-21
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");

        System.out.println("Pao");
        for (int i = 1; i < listaIngredientes.length - 1; i++) {
            System.out.println(listaIngredientes[i]);
        }
        System.out.println("Pao");
    }
}