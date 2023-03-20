/**
* Objetivo: Classes CalculadoraDeMedias1 e CalculaMediaDaTurma criadas para simular erros em tempo de execucao e 
* uso do debugging.
* Exercicio proposto para atividades de debugging 
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-20
*/

/*
// O codigo abaixo foi modificado alterando as variaveis media, soma e nota de int para double
// A classe calculaMediaDaTurma tambem foi modificada para retornar um double e assim corrigir 
// o codigo no trato do calculo de media, porem nao faz tratamento de erro de entrada invalida
*/
import java.util.Scanner; 

public class CalculadoraDeMedias2{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
		
		double media = calculaMediaDaTurma(alunos, scan);
		
		System.out.printf("Media dos alunos: %.2f", media);
		
	}
		
	public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
		
		double soma = 0.0;
		for(String aluno : alunos){
			System.out.printf("Nota do aluno %s: ", aluno);
			double nota = scanner.nextDouble();
			soma += nota;
		}
		return soma/alunos.length;		
	}
}