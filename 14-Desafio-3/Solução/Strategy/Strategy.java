/**
* Exemplo de código que implementa o padrão Strategy    
* Descrição: Neste exemplo, a interface "Estrategia" define um método "executarOperacao()" 
* que é implementado pelas classes "Soma", "Subtracao" e "Multiplicacao", que representam diferentes estratégias para realizar operações matemáticas. 
* A classe "Calculador"a utiliza uma dessas estratégias para realizar a operação desejada, dependendo da estratégia definida no momento da criação da instância. 
* A classe "Programa" utiliza a calculadora com diferentes estratégias para realizar operações de soma, subtração e multiplicação. 
* Isso demonstra como o padrão "Strategy" permite que diferentes algoritmos sejam encapsulados como estratégias e usados ​​de forma intercambiável em diferentes contextos.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// A interface 'Estrategia' define um método que será implementado pelas classes concretas
public interface Estrategia {
    public int executarOperacao(int numero1, int numero2);
}

// A classe 'Soma' implementa a interface 'Estrategia' para realizar a operação de soma
public class Soma implements Estrategia {
    // Implementação do método 'executarOperacao' para realizar a soma
    @Override
    public int executarOperacao(int numero1, int numero2) {
        return numero1 + numero2;
    }
}

// A classe 'Subtracao' implementa a interface 'Estrategia' para realizar a operação de subtração
public class Subtracao implements Estrategia {
    // Implementação do método 'executarOperacao' para realizar a subtração
    @Override
    public int executarOperacao(int numero1, int numero2) {
        return numero1 - numero2;
    }
}

// A classe 'Multiplicacao' implementa a interface 'Estrategia' para realizar a operação de multiplicação
public class Multiplicacao implements Estrategia {
    // Implementação do método 'executarOperacao' para realizar a multiplicação
    @Override
    public int executarOperacao(int numero1, int numero2) {
        return numero1 * numero2;
    }
}

// A classe 'Calculadora' utiliza uma estratégia para realizar operações matemáticas
public class Calculadora {
    // Atributo que armazena a estratégia utilizada pela calculadora
    private Estrategia estrategia;
    
    // Construtor que define a estratégia utilizada pela calculadora
    public Calculadora(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    // Método que utiliza a estratégia para realizar a operação matemática
    public int realizarOperacao(int numero1, int numero2) {
        return estrategia.executarOperacao(numero1, numero2);
    }
}

// A classe 'Programa' é a classe principal que utiliza a calculadora com diferentes estratégias
public class Programa {
    public static void main(String[] args) {
        // Cria uma instância da classe 'Calculadora' com a estratégia de soma
        Calculadora calculadora = new Calculadora(new Soma());
        
        // Utiliza a calculadora para realizar uma soma
        int resultado = calculadora.realizarOperacao(5, 3);
        System.out.println("Resultado da soma: " + resultado);
        
        // Atualiza a estratégia da calculadora para a subtração
        calculadora = new Calculadora(new Subtracao());
        
        // Utiliza a calculadora para realizar uma subtração
        resultado = calculadora.realizarOperacao(5, 3);
        System.out.println("Resultado da subtração: " + resultado);
        
        // Atualiza a estratégia da calculadora para a multiplicação
        calculadora = new Calculadora(new Multiplicacao());
        
        // Utiliza a calculadora para realizar uma multiplicação
        resultado = calculadora.realizarOperacao(5, 3);
        System.out.println("Resultado da multiplicação: " + resultado);
    }
}