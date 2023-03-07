/**
* Objetivo: Fazer um programa que leia um conjunto de dois valores,
* o primeiro representando o nome e o segundo a idade.
* OBS: Pare o programa inserindo o valor "0" no campo nome
*
* Nesta versao foi exemplificado o uso do "do-while" e o uso do "continue"
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-02-28
*/
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String args[]) {
		
		//instanciando objeto tipo "Scanner" e declarando variaveis:
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

		//Exemplo de loop com "do" para garantir pelo menos uma execucao:
        do {
			//lendo dados inseridos pelo usuario
            ler.nextLine();
            System.out.print("Digite seu nome: ");
            nome = ler.next();
			
			//tratando entrada de dados invalidas para a variavel idade
			try{
				// Testando valor da variavel nome, se "0" finaliza com "continue". 
				// Apenas para exemplo de uso:
                if (nome.equals("0")) continue; 
				System.out.print("Digite sua idade: ");
                idade = ler.nextInt();
                System.out.println("...\n");
			//Exibindo mensagem de erro em caso de dados invalidos
            }catch (Exception ex){
                System.out.println("ERRO! Idade invalida!");
                System.out.println("...\n");
            }
        // Testando variavel nome com while. Apenas para exemplo.        
        }while (!nome.equals("0")); 
        
		// Exibindo mensagem apos sair do loop(laco)
		System.out.println("...\n");
        System.out.println("Fim da execucao!");
		//metodo "close()" adicionado para liberar recursos
		ler.close();
    }
}