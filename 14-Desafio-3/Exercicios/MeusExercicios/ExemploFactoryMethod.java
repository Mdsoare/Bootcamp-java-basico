/**
* Exemplo de uso do padrão Factory Method
* Descrição: Neste exemplo, temos a classe abstrata "Produto" que representa um produto genérico. As classes concretas "ProdutoA" e "ProdutoB" implementam esta classe abstrata e representam produtos específicos.
* Temos também a interface "Factory" que define o "Factory Method" para criar objetos do tipo "Produto". 
* As classes concretas "FactoryA" e "FactoryB" implementam esta interface e são responsáveis por criar objetos das classes "ProdutoA" e "ProdutoB", respectivamente.
* Por fim, na classe "Exemplo", criamos uma instância de cada uma das classes "FactoryA" e "FactoryB" 
* e utilizamos o método "criarProduto()" para criar objetos das classes "ProdutoA" e "ProdutoB". 
* Em seguida, chamamos o método "exibirDetalhes()" de cada um dos objetos criados para exibir detalhes sobre eles.
*
* @author marcelo Soares
* @since 2023-03-26
*/


// Produto.java - Classe abstrata que representa um produto
public abstract class Produto {
    public abstract void exibirDetalhes();
}

// ProdutoA.java - Classe concreta que implementa a classe Produto
public class ProdutoA extends Produto {
    @Override
    public void exibirDetalhes() {
        System.out.println("Este é o Produto A");
    }
}

// ProdutoB.java - Classe concreta que implementa a classe Produto
public class ProdutoB extends Produto {
    @Override
    public void exibirDetalhes() {
        System.out.println("Este é o Produto B");
    }
}

// Factory.java - Interface que define o Factory Method
public interface Factory {
    Produto criarProduto();
}

// FactoryA.java - Classe concreta que implementa a interface Factory
public class FactoryA implements Factory {
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}

// FactoryB.java - Classe concreta que implementa a interface Factory
public class FactoryB implements Factory {
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}

// Exemplo.java - Classe que utiliza o Factory Method para criar produtos
public class Exemplo {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Produto produtoA = factoryA.criarProduto();
        produtoA.exibirDetalhes();
        
        Factory factoryB = new FactoryB();
        Produto produtoB = factoryB.criarProduto();
        produtoB.exibirDetalhes();
    }
}