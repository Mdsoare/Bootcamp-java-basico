/**
* Objetivo: Fazer um programa que leia um conjunto de dois valores,
* o primeiro representando o nome e o segundo a idade.
* OBS: Pare o programa inserindo o valor "0" no campo nome.
*
* Nesta versao foi icluido tratando para a variavel "nome" 
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-02-28
*/
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String args[]) {
		
		//instanciando objeto tipo "Scanner" e declarando variaveis:
        Scanner ler = new Scanner(System.in);
		String nome;
        int idade;

		//Criando laco	
        while(true){
			//lendo dados inseridos pelo usuario
			ler.nextLine();
			System.out.print("Digite seu nome: ");
			nome = ler.next();
			// Testando valor da variavel nome, se "0" finaliza com "break"
			if (nome.equals("0")) break;
			//tratando entrada de dados invalidas para a variavel idade
			try{          
				System.out.print("Digite sua idade: ");
				idade = ler.nextInt();
			//Exibindo mensagem de erro em caso de dados invalidos
			}catch (Exception ex){
				System.out.println("ERRO! Idade invalida!");
                System.out.println("...\n");
			}
        }
		
		// Exibindo mensagem apos sair do loop(laco)
        System.out.println("...\n");
        System.out.println("Fim da execucao!");
		//metodo "close()" adicionado para liberar recursos
		ler.close();
    }
}