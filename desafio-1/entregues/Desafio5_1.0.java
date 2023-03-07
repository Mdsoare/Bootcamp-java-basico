/**
* Desafio 5: A prefeitura de uma cidade A instalou uma câmera para verificar quem estava 
* acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade 
* extremamente movimentada e a prefeitura não deu conta de enviar as multas necessárias para
* quem ultrapassasse a velocidade permitida de 60km/h.
*
* O seu papel será o de criar um programa que verifique os dados recebidos da câmera e 
* envie uma mensagem dizendo se o motorista será multado ou não.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-06
*/

import java.util.Scanner; 
    
public class Program {
    public static final int VELOCIDADE_MAXIMA_PERMITIDA = 60;
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
		System.out.print("Velocidade lida: ");
        int velocidadeAtual = leitor.nextInt();
        
        if (velocidadeAtual > VELOCIDADE_MAXIMA_PERMITIDA){
          System.out.print("Foi multado");
        }else {
          System.out.print("Nao foi multado");
        }
    }
}