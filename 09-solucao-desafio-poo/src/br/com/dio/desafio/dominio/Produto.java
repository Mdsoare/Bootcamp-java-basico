/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/

package br.com.dio.desafio.dominio;


// Classe Produto com atributos e métodos relacionados ao produto
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
	
	 public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}