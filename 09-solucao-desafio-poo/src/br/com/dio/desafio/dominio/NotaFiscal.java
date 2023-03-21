/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/

package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Cliente;
import br.com.dio.desafio.dominio.Produto;

// Classe NotaFiscal com atributos e métodos relacionados à nota fiscal
public class NotaFiscal {
    private Cliente cliente;
    private List<Produto> produtos;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
	
	public List<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }
}