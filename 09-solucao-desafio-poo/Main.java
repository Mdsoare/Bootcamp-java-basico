/**
* Desafio de POO para demonstrar os conceitos de "Abstracao", "Encapsulamento", "Heranca" e "Polimorfismo" 
*
* @author Marcelo Soares
* @since 2023-03-21
*/


import br.com.dio.desafio.dominio.Funcionario;
import br.com.dio.desafio.dominio.Gerente;
import br.com.dio.desafio.dominio.Vendedor;
import br.com.dio.desafio.dominio.Faxineiro;
import br.com.dio.desafio.dominio.Cliente;
import br.com.dio.desafio.dominio.Produto;
import br.com.dio.desafio.dominio.NotaFiscal;

public class Main {
    public static void main(String[] args) {
        // Instanciando um Gerente
        Gerente gerente = new Gerente("João", "123456789", 5000.0, "Vendas");

        // Instanciando um Vendedor
        Vendedor vendedor = new Vendedor("Maria", "987654321", 2000.0, 0.1);

        // Instanciando um Faxineiro
        Faxineiro faxineiro = new Faxineiro("José", "111111111", 1000.0);

        // Instanciando um Cliente Pessoa Física
        Cliente pessoaFisica = new ClientePF("Fulano", "123456789", "Rua A, 123");

        // Instanciando um Cliente Pessoa Jurídica
        Cliente pessoaJuridica = new ClientePJ("Empresa XYZ", "987654321", "Rua B, 456");

        // Instanciando um Produto
        Produto produto = new Produto("Caneta", 2.0);

        // Instanciando uma Nota Fiscal
        NotaFiscal notaFiscal = new NotaFiscal(pessoaFisica);

        // Adicionando o produto à nota fiscal
        notaFiscal.adicionarProduto(produto);

        // Calculando o valor total da nota fiscal
        double valorTotal = notaFiscal.calcularValorTotal();

        // Imprimindo os dados dos objetos criados
        System.out.println("Dados do Gerente: " + gerente);
        System.out.println("Dados do Vendedor: " + vendedor);
        System.out.println("Dados do Faxineiro: " + faxineiro);
        System.out.println("Dados do Cliente Pessoa Física: " + pessoaFisica);
        System.out.println("Dados do Cliente Pessoa Jurídica: " + pessoaJuridica);
        System.out.println("Dados do Produto: " + produto);
        System.out.println("Dados da Nota Fiscal: " + notaFiscal);
        System.out.println("Valor total da compra: R$ " + valorTotal);
    }
}