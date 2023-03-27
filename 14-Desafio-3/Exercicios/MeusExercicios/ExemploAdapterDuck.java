/**
* Exemplo de uso do padrão Adapter
* Descrição:  O padrão Adapter é usado para permitir que objetos com interfaces incompatíveis trabalhem juntos.
* Neste exemplo, a interface Duck define um método quack() e um método fly(). A classe MallardDuck implementa a interface Duck. 
* A interface Turkey define um método gobble() e um método fly(). A classe WildTurkey implementa a interface Turkey.
* A classe TurkeyAdapter implementa a interface Duck e encapsula uma instância de Turkey. Quando o método quack() é chamado em um objeto TurkeyAdapter, 
* ele chama o método gobble() do objeto Turkey. Quando o método fly() é chamado em um objeto TurkeyAdapter, ele chama o método fly() do objeto Turkey cinco vezes.
*
* @author marcelo Soares
* @since 2023-03-26
*/

public interface Duck {
    void quack();
    void fly();
}

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

public interface Turkey {
    void gobble();
    void fly();
}

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The duck says...");
        duck.quack();
        duck.fly();

        System.out.println("The turkey adapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}