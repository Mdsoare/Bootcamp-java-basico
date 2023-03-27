/**
* Exemplo de uso do padrão Observer
* Descrição:  O padrão Observer é usado para notificar um conjunto de objetos sobre mudanças em um objeto observado.
* Neste exemplo, a interface Observer define um método update() que é implementado pela classe ConcreteObserver. 
* A classe Subject mantém uma lista de objetos Observer que devem ser notificados quando o valor do sujeito é atualizado. 
* Quando o valor do Subject é atualizado, a lista de Observer é percorrida e cada objeto Observer é notificado da mudança.
*
* @author marcelo Soares
* @since 2023-03-26
*/

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update(int value);
}

public class Subject {
    private int value;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int value) {
        System.out.println(name + " received update: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserver("Observer 1"));
        subject.addObserver(new ConcreteObserver("Observer 2"));

        subject.setValue(1);
        subject.setValue(2);
    }
}