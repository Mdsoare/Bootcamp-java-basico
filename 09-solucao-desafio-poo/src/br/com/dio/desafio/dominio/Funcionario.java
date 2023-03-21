/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/

package br.com.dio.desafio.dominio;

// Classe mae Funcionario com atributos e metodos comuns a todos os funcionarios
public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
	
	public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
	
	public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  
}