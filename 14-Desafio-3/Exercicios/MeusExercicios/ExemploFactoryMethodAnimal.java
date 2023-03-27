/**
* Exemplo de uso do padrão Factory Method
* Descrição:  O Factory Method é um padrão de projeto que fornece uma interface para criar objetos em uma superclasse, 
* mas permite que as subclasses alterem o tipo de objetos que são criados. 
* Neste exemplo, as classes Cat e Dog implementam a interface Animal, que define um método getSound() que retorna o som do animal. 
* As classes CatFactory e DogFactory implementam a interface AnimalFactory, que define um método createAnimal() que cria um objeto Animal. 
* O método createAnimal() é implementado de maneira diferente nas classes CatFactory e DogFactory, 
* o que permite que o tipo de objeto que é criado seja determinado em tempo de execução.
*
* @author marcelo Soares
* @since 2023-03-26
*/

public interface Animal {
    String getSound();
}

public class Cat implements Animal {
    @Override
    public String getSound() {
        return "Meow";
    }
}

public class Dog implements Animal {
    @Override
    public String getSound() {
        return "Woof";
    }
}

public interface AnimalFactory {
    Animal createAnimal();
}

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        System.out.println(animal.getSound());
    }
}