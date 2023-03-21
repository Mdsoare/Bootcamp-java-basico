/**
* Desafio: Sua irma esta com o computador muito lento e pediu para voce formata-lo. 
* Mas ela gostaria muito de que todas as musicas dela fossem salvas e nao deletadas com o resto dos arquivos durante a formatacao.
* Todas as musicas estao no formato .mp3. Crie um programa que cada arquivo com esse formato nao seja deletado.
*
* @author Marcelo soares
* @since 2023-03-21
*/

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        if (arquivoDoPc.endsWith(".mp3")) { //metodo endsWith() da classe String
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }

    }
}