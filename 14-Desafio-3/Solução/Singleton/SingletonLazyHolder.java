/**
* Exemplo de uso do padrão Singleton LazyHolder
* Descrição: Este código é um exemplo de implementação do padrão Singleton usando a classe interna (inner class) Lazy Holder para inicialização preguiçosa (lazy initialization).
* Neste exemplo, a classe "Singleton" representa uma classe que deve ter apenas uma instância em toda a aplicação. 
* A instância única da classe é criada somente quando o método "getInstance()" é chamado pela primeira vez, 
* utilizando a classe interna (inner class) "SingletonHolder" para garantir que a inicialização seja preguiçosa. 
* O construtor é privado para evitar a criação de novas instâncias fora da classe e o método "getInstance()" retorna a instância única da classe. 
* O cliente usa a classe "Singleton" para obter a instância única e realizar uma operação usando essa instância.
*
* @author marcelo Soares
* @since 2023-03-26
*/


// Classe Singleton usando a classe interna (inner class) Lazy Holder para inicialização preguiçosa
class Singleton {

    // Construtor privado para impedir a criação de instâncias fora da classe
    private Singleton() {
        System.out.println("Instância única da classe Singleton criada");
    }

    // Classe interna (inner class) para inicialização preguiçosa da instância única da classe Singleton
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Método estático para retornar a instância única da classe Singleton usando a classe interna (inner class) Lazy Holder
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
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
