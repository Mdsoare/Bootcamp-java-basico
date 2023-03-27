/**
* Exemplo de uso do padrão Facade  
* Descrição: O padrão Facade é um padrão estrutural que fornece uma interface simplificada para um conjunto de interfaces complexas em um subsistema.
* Neste exemplo, o subsistema A é representado pela classe "ServicoA", o subsistema B é representado pela classe "ServicoB", e o Facade é representado pela classe "Facade". 
* O Facade contém referências para as classes "ServicoA" e "ServicoB", e fornece um método "executarServicos()" que invoca os métodos "executar()" de ambos os subsistemas. 
* O Cliente usa a classe Facade para executar os serviços. 
* Com o padrão Facade, o Cliente não precisa se preocupar com a complexidade dos subsistemas, apenas invoca o método da classe Facade para executá-los.
*
* @author marcelo Soares
* @since 2023-03-26
*/

// Subsistema A
class ServicoA {
    public void executar() {
        System.out.println("ServicoA executado");
    }
}

// Subsistema B
class ServicoB {
    public void executar() {
        System.out.println("ServicoB executado");
    }
}

// Facade
class Facade {
    private ServicoA servicoA;
    private ServicoB servicoB;

    public Facade() {
        servicoA = new ServicoA();
        servicoB = new ServicoB();
    }

    public void executarServicos() {
        servicoA.executar();
        servicoB.executar();
    }
}

// Cliente
class Cliente {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.executarServicos();
    }
}