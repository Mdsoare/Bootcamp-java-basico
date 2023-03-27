/**
*  Exemplo de uso do padrão Factory Method
* Descrição:  Neste exemplo, a classe abstrata ClasseAbstrata define o método abstrato metodoAbstrato que deve ser implementado pelas subclasses e 
* também define um método concreto metodoConcreto que pode ser usado pelas subclasses. As classes ClasseConcreta1 e ClasseConcreta2 são as classes concretas 
* que implementam o método abstrato metodoAbstrato. A classe Programa é a classe principal que cria instâncias das classes concretas e chama seus métodos. 
*
* @author marcelo Soares
* @since 2023-03-26
*/

// A classe 'ClasseAbstrata' é a classe abstrata que define o método que será implementado pelas subclasses
public abstract class ClasseAbstrata {
    // O método 'metodoAbstrato' é o método abstrato que será implementado pelas subclasses
    public abstract void metodoAbstrato();
    
    // O método 'metodoConcreto' é um método concreto que pode ser usado pelas subclasses
    public void metodoConcreto() {
        System.out.println("Executando método concreto da classe abstrata");
    }
}

// A classe 'ClasseConcreta1' é uma das classes concretas que implementa o método abstrato 'metodoAbstrato'
public class ClasseConcreta1 extends ClasseAbstrata {
    // O método 'metodoAbstrato' é implementado pela classe 'ClasseConcreta1'
    @Override
    public void metodoAbstrato() {
        System.out.println("Executando método abstrato da classe concreta 1");
    }
}

// A classe 'ClasseConcreta2' é outra classe concreta que implementa o método abstrato 'metodoAbstrato'
public class ClasseConcreta2 extends ClasseAbstrata {
    // O método 'metodoAbstrato' é implementado pela classe 'ClasseConcreta2'
    @Override
    public void metodoAbstrato() {
        System.out.println("Executando método abstrato da classe concreta 2");
    }
}

// A classe 'Programa' é a classe principal que cria instâncias das classes concretas e chama seus métodos
public class Programa {
    public static void main(String[] args) {
        // Cria uma instância da classe 'ClasseConcreta1'
        ClasseAbstrata classe1 = new ClasseConcreta1();
        
        // Chama o método 'metodoAbstrato' da classe 'ClasseConcreta1'
        classe1.metodoAbstrato();
        
        // Chama o método 'metodoConcreto' da classe abstrata
        classe1.metodoConcreto();
        
        // Cria uma instância da classe 'ClasseConcreta2'
        ClasseAbstrata classe2 = new ClasseConcreta2();
        
        // Chama o método 'metodoAbstrato' da classe 'ClasseConcreta2'
        classe2.metodoAbstrato();
        
        // Chama o método 'metodoConcreto' da classe abstrata
        classe2.metodoConcreto();
    }
}