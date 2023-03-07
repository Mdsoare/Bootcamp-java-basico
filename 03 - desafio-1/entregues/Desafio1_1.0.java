/**
* Desafio 1: Seu sobrinho começou a ganhar mesada dos pais. 
* No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber quanto terá 
* se juntar todo o dinheiro, sem gastar nada, durante alguns meses. E você, 
* como um bom tio com habilidades de programação, vai criar um programa que com 
* as entradas do seu sobrinho vai calcular automaticamente a quantidade de 
* dinheiro que ele terá em X meses.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-06
*/

import java.util.Scanner; 
    
public class Desafio1 {
    public static void main(aString[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade de entradas: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int calculo = (entrada * mesada);
        System.out.println(calculo);
    }
}