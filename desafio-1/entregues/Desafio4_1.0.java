/**
* Desafio 4: Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
* Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, 
* principalmente as crianças que estão muito acostumadas com a tecnologia, 
* poderiam colocar suas moedas e receber dois doces aleatórios. 
* Cada 1 real irá render 2 doces aleatórios.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-06
*/

import java.util.Scanner; 
    
public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o valor: ");
        int dinheiro = leitor.nextInt();
        
        int calculo = (dinheiro * 2);
        System.out.print("O cliente obteve " + calculo + " doces");
    }
}