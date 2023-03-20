/**
* Objetivo: Classes CalculadoraDeMedias1 e CalculaMediaDaTurma criadas para simular erros em tempo de execucao e 
* uso do debugging.
* Exercicio proposto para atividades de debugging 
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-19
*/

/*
// O codigo abaixo, embora compile, apresenta erros de logica
// Note que o trabalho de calculo deveria ser do tipo double no lugar do int ao longo do codigo
// Tambem nao tem tratamento de erros de entradas 
*/
import java.util.Scanner; 

public class CalculadoraDeMedias1{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
		
		int media = calculaMediaDaTurma(alunos, scan);
		
		System.out.printf("Media dos alunos %d", media);
		
	}
		
	public static int calculaMediaDaTurma(String[] alunos, Scanner scanner){
		
		int soma = 0;
		for(String aluno : alunos){
			System.out.printf("Nota do aluno %s: ", aluno);
			int nota = scanner.nextInt();
			soma += nota;
		}
		return soma/alunos.length;		
	}
}