/**
* Objetivo: Classes CalculadoraDeMedias1 e CalculaMediaDaTurma criadas para simular erros em tempo de execucao e 
* uso do debugging.
* Exercicio proposto para atividades de debugging 
*
* @author Marcelo Soares
* @version 3.0
* @since 2023-03-20
*/

/*
// O codigo abaixo foi modificado para permitir apenas valores positivos entre 0 e 10
// i.e, inclui tratamento de erros de entradas invalidas (numeros negativos, palavras, etc.)
*/

import java.util.Scanner; //importa biblioteca necessaria para trabalhar com insercao de dados interativamente 

public class CalculadoraDeMedias3 { // criacao da classe principal 

    public static void main(String[] args) { // metodo main necessario para execucao do codigo
        Scanner scan = new Scanner(System.in); // instaciando objeto q permitira insercao de dados
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"}; // criacao do array tipo String

        double media = calculaMediaDaTurma(alunos, scan); // chamada do metodo calculaMediaDaTurma cujo valor sera guardado na variavel media

        System.out.printf("Media dos alunos: %.2f", media); // imprime o resultado considerando apenas 2 casas decimais
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) { //metodo auxiliar q coleta os valores, soma-os e depois retorna a media 
        double soma = 0.0; // variavelq guardara a soma das notas
        int cont = 0; // variavel de controle 

        for (String aluno : alunos) { // forEach usado para insercao das notas
            double nota = 0.0; // criacao de variavel q sera usada para iteracao. Nota: Necessaria porque sera usado dentro do while
            boolean entradaInvalida = true; // outra variavel para teste de entrada de dados validos
            while (entradaInvalida) { 
                try { //try-catch usado para tratamento de erros 
                    System.out.printf("Nota do aluno %s: ", aluno);
                    nota = scanner.nextDouble(); // coleta a nota digitada
                    if (nota < 0 || nota > 10) { // verifica se a nota esta entre 0 e 10
                        System.out.println("A nota deve ser um valor entre 0 e 10."); // trata erro de dado fora do escopo exigido
                        continue; // permanece executando o codigo
                    }
                    entradaInvalida = false; //caso a entrada seja invalida trata erro com catch 
                } catch (Exception e) {
                    System.out.println("Entrada invalida. Por favor, digite um numero."); //imprime uma mensagem de erro e continua executando o loop
                    scanner.nextLine(); //necessario para antes de coletar valor, limpar buffer
                }
            }
            soma += nota; // operacao de soma 
            cont++; // incremento 
        }
        return soma / cont; // retorno da media
    }
}