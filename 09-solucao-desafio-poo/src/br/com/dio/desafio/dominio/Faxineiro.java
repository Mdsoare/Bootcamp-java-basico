/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/

package br.com.dio.desafio.dominio;

// Subclasse Faxineiro, que herda de Funcionario e adiciona atributos e metodos especificos de faxineiro
public class Faxineiro extends Funcionario {
    public Faxineiro(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}