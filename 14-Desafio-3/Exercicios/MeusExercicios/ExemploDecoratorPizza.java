/**
* Exemplo de uso do padrão Decorator
* Descrição:  O padrão Decorator é usado para adicionar funcionalidade a um objeto dinamicamente. 
* Neste exemplo, a interface Pizza define um método getDescription() e um método getCost(). 
* A classe Margherita implementa a interface Pizza. A classe PizzaDecorator é uma classe abstrata que implementa a interface Pizza
* e encapsula uma instância de Pizza. As classes Cheese e Pepperoni são subclasses de PizzaDecorator. 
* Quando o método getDescription() é chamado em um objeto PizzaDecorator, ele chama o método getDescription() do objeto Pizza encapsulado 
* e adiciona a descrição do ingrediente adicional. Quando o método getCost() é chamado em um objeto PizzaDecorator, 
* ele chama o método getCost() do objeto Pizza encapsulado e adiciona o custo do ingrediente adicional.
*
* @author marcelo Soares
* @since 2023-03-26
*/

public interface Pizza {
    String getDescription();
    double getCost();
}

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());

        pizza = new Pepperoni(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
    }
}