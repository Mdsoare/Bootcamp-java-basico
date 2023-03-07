/**
* Desafio 1
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-06
*/

import java.util.Scanner;

public class CalculoDeMesada {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.print("Digite a quantidade de calculos de mesada que voce deseja realizar: ");
			int quantidadeDeCalculos = leitor.nextInt();
			int valorDaMesada = 50;
			int valorTotalDaMesada = calculoMesada(quantidadeDeCalculos, valorDaMesada);
			System.out.println("O valor total da mesada eh: " + valorTotalDaMesada + " Reais");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}
	public static int calculoMesada(int quantidadeDeCalculos, int valorDaMesada) {
		return quantidadeDeCalculos * valorDaMesada;
	}
}