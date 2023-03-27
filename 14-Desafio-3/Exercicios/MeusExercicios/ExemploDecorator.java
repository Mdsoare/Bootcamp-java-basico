/**
* Exemplo de uso do padrão Decorator   
* Descrição: O padrão Facade é é utilizado para adicionar novas funcionalidades a um objeto existente sem alterar sua estrutura básica.
* Nesse exemplo, a interface "Janela" representa o componente base. A classe "JanelaSimples" é o componente concreto que implementa a interface "Janela". 
* A classe "JanelaDecorator" é o decorador abstrato que implementa a interface "Janela" e possui uma referência ao componente base.
* As classes "JanelaComBarraDeRolagem" e "JanelaComBorda' são decoradores concretos que estendem a classe "JanelaDecorator".
* A classe "Cliente" é a classe que utiliza os decoradores para adicionar novas funcionalidades à janela.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// Interface Component (componente base)
interface Janela {
    public void desenhar();
}

// Classe ConcreteComponent (componente concreto)
class JanelaSimples implements Janela {
    public void desenhar() {
        System.out.println("Desenhando janela simples.");
    }
}

// Classe Decorator (decorador abstrato)
abstract class JanelaDecorator implements Janela {
    protected Janela janelaDecorada;

    public JanelaDecorator(Janela janelaDecorada) {
        this.janelaDecorada = janelaDecorada;
    }

    public void desenhar() {
        janelaDecorada.desenhar();
    }
}

// Classes ConcreteDecorator (decoradores concretos)
class JanelaComBarraDeRolagem extends JanelaDecorator {
    public JanelaComBarraDeRolagem(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    public void desenhar() {
        super.desenhar();
        System.out.println("Adicionando barra de rolagem à janela.");
    }
}

class JanelaComBorda extends JanelaDecorator {
    public JanelaComBorda(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    public void desenhar() {
        super.desenhar();
        System.out.println("Adicionando borda à janela.");
    }
}

// Classe Cliente (classe que utiliza os decoradores)
class Cliente {
    public static void main(String[] args) {
        // Criando uma janela simples
        Janela janela = new JanelaSimples();

        // Adicionando a barra de rolagem à janela
        janela = new JanelaComBarraDeRolagem(janela);

        // Adicionando a borda à janela
        janela = new JanelaComBorda(janela);

        // Desenhando a janela com as novas funcionalidades
        janela.desenhar();
    }
}