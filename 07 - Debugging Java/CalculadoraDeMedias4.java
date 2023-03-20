/**
* Objetivo: Classes CalculadoraDeMedias1 e CalculaMediaDaTurma criadas para simular erros em tempo de execucao e 
* uso do debugging.
* Exercicio proposto para atividades de debugging 
*
* @author Marcelo Soares
* @version 4.0
* @since 2023-03-20
*/

/*
// Codigo modificado como possivel solucao para o exercicio proposto
*/

import java.util.Scanner;

public class CalculadoraDeMedias4 {

    public static final int NOTA_MINIMA = 0;
    public static final int NOTA_MAXIMA = 10;

    public static void main(String[] args) {
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        Scanner scanner = new Scanner(System.in);
        double media = calculaMediaDaTurma(alunos, scanner);
        System.out.printf("Media dos alunos: %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0.0;
        int cont = 0;

        for (String aluno : alunos) {
            double nota = coletaNota(scanner, aluno);
            soma += nota;
            cont++;
        }
		scanner.close();
        return soma / cont;
    }

    public static double coletaNota(Scanner scanner, String aluno) {
        while (true) {
            try {
                System.out.printf("Nota do aluno %s: ", aluno);
                double nota = scanner.nextDouble();
                if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                    throw new IllegalArgumentException("A nota deve ser um valor entre 0 e 10.");
                }
                return nota;
            } catch (Exception e) {
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                scanner.nextLine();
            }
        }
    }
}