/**
* Descrição:  Neste exemplo, a classe Factory implementa o padrão Factory. 
* O método criarForma recebe um parâmetro tipo que determina qual forma deve ser criada. 
* Se o parâmetro for "circulo", a classe Circulo é instanciada e retornada. Se o parâmetro for "quadrado", a classe Quadrado é instanciada e retornada. 
* Se o parâmetro for inválido, uma exceção é lançada. As classes Circulo e Quadrado são classes derivadas da classe abstrata Forma, 
* que define o método abstrato desenhar. As classes derivadas implementam esse método para desenhar a forma correspondente.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// A classe 'Factory' é responsável por criar instâncias das classes 'Circulo' e 'Quadrado'
public class Factory {
    // O método 'criarForma' recebe um parâmetro 'tipo', que determina qual forma deve ser criada
    public Forma criarForma(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) {
            // Se 'tipo' for 'circulo', cria-se uma nova instância da classe 'Circulo' e retorna-a
            return new Circulo();
        } else if (tipo.equalsIgnoreCase("quadrado")) {
            // Se 'tipo' for 'quadrado', cria-se uma nova instância da classe 'Quadrado' e retorna-a
            return new Quadrado();
        } else {
            // Se 'tipo' for inválido, lança-se uma exceção
            throw new IllegalArgumentException("Tipo de forma inválido: " + tipo);
        }
    }
}

// A classe 'Forma' é uma classe abstrata que representa uma forma geométrica genérica
public abstract class Forma {
    // A classe 'Forma' define um método abstrato 'desenhar' que deve ser implementado pelas classes derivadas
    public abstract void desenhar();
}

// A classe 'Circulo' é uma classe derivada de 'Forma' que representa um círculo
public class Circulo extends Forma {
    // O método 'desenhar' implementa a lógica para desenhar um círculo na tela
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}

// A classe 'Quadrado' é uma classe derivada de 'Forma' que representa um quadrado
public class Quadrado extends Forma {
    // O método 'desenhar' implementa a lógica para desenhar um quadrado na tela
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado");
    }
}