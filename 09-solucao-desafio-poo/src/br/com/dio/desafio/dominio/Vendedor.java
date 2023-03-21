/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/

package br.com.dio.desafio.dominio;

// Subclasse Vendedor, que herda de Funcionario e adiciona atributos e metodos especificos de vendedor
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int idade, double salario, double comissao) {
        super(nome, idade, salario);
        this.comissao = comissao;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.1 + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}