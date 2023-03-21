/**
* Desafio: O seu amigo quer verificar quais os imoveis estao disponiveis em uma certa corretora na regiao onde ele mora. 
* A corretora disponibilizou uma API para ele, mas como ele nao entende nada de programacao, pediu a sua ajuda. 
* Para deixar tudo bonitinho, voce resolveu criar um aplicativo para seu querido amigo, 
* mas quando foi olhar a API retornava os dados de uma forma esquisita, separado por barras. 
* Ajude seu amigo deixando a informação mais amigável possível.
*
* @author Marcelo soares
* @since 2023-03-21
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        String[] array = frase.split("/");

        String classificacao = array[0];
        String valor = array[1];
        String disponibilidade = array[2];

        String mensagem = "Imovel: " + classificacao + " R$" + valor + " " + disponibilidade;

        System.out.println(mensagem);
    }
}
