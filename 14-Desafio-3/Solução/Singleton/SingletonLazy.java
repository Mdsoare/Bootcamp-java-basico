/**
* Exemplo de uso do padrão Singleton Lazy 
* Descrição: Este código é um exemplo de implementação do padrão Singleton usando inicialização preguiçosa (lazy initialization) de um objeto pesado (heavy object).
* Neste exemplo, a classe "HeavyObject" representa um objeto pesado que pode levar tempo para ser criado. 
* A classe "LazyInitializationExample" usa inicialização preguiçosa para criar o objeto pesado apenas quando ele é necessário. 
* O método "getHeavyObject()" verifica se o objeto já foi criado antes de criar um novo. 
* O Cliente usa a classe "LazyInitializationExample" para obter uma referência para o objeto pesado e realiza uma operação pesada usando esse objeto.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// Classe HeavyObject
class HeavyObject {
    public HeavyObject() {
        // Construtor pesado que pode levar tempo para ser executado
        System.out.println("Construindo objeto pesado...");
    }

    public void execute() {
        // Método que realiza uma operação pesada
        System.out.println("Executando operação pesada...");
    }
}

// Classe LazyInitializationExample com inicialização preguiçosa
class LazyInitializationExample {

    private HeavyObject heavyObject;

    public HeavyObject getHeavyObject() {
        // Verifica se o objeto já foi criado
        if (heavyObject == null) {
            // Se ainda não foi criado, cria o objeto
            heavyObject = new HeavyObject();
        }
        // Retorna o objeto criado ou já existente
        return heavyObject;
    }
}

// Cliente
class Cliente {
    public static void main(String[] args) {
        // Cria a instância de LazyInitializationExample
        LazyInitializationExample example = new LazyInitializationExample();

        // Obtém a referência para o objeto pesado
        HeavyObject heavyObject = example.getHeavyObject();

        // Realiza uma operação pesada usando o objeto obtido
        heavyObject.execute();
    }
}