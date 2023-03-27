/**
* Exemplo de uso do padrão Singleton Eager 
* Descrição: Este código é um exemplo de implementação do padrão Singleton usando inicialização ansiosa (eager initialization).
* Neste exemplo, a classe "Singleton" representa uma classe que deve ter apenas uma instância em toda a aplicação. 
* A instância única da classe é criada imediatamente no momento da inicialização da classe usando inicialização ansiosa. 
* O construtor é privado para evitar a criação de novas instâncias fora da classe e o método "getInstance()" retorna a instância única da classe. 
* O cliente usa a classe "Singleton" para obter a instância única e realizar uma operação usando essa instância.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// Classe Singleton usando inicialização ansiosa
class Singleton {

    // Instância única da classe
    private static Singleton instance = new Singleton();

    // Construtor privado para impedir a criação de instâncias fora da classe
    private Singleton() {
        System.out.println("Instância única da classe Singleton criada");
    }

    // Método estático para retornar a instância única da classe
    public static Singleton getInstance() {
        return instance;
    }
}

// Cliente
class Cliente {
    public static void main(String[] args) {
        // Obtém a instância única da classe Singleton
        Singleton singleton = Singleton.getInstance();

        // Realiza uma operação usando a instância única da classe Singleton
        System.out.println("Operação realizada usando a instância única da classe Singleton");
    }
}