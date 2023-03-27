/**
* Exemplo de uso do padrão Adapter    
* Descrição: O padrão Facade é utilizado para adaptar uma classe existente para outra interface esperada pelo cliente, 
* de modo que o cliente possa utilizar ambas as classes de forma transparente.
* Nesse exemplo, a classe "TomadaDeDoisPinos" representa a classe que deve ser adaptada e a interface "TomadaDeTresPinos" é a interface esperada pelo cliente. 
* A classe "AdaptadorDeTomada" é a classe que adapta a classe "TomadaDeDoisPinos" para a interface "TomadaDeTresPinos".
* A classe "Cliente" é a classe que utiliza a interface "TomadaDeTresPinos".
*
* @author marcelo Soares
* @since 2023-03-26
*/

// Classe Adaptee (classe que deve ser adaptada)
class TomadaDeDoisPinos {
    public void ligarTomadaDeDoisPinos() {
        System.out.println("Ligado na tomada de dois pinos.");
    }
}

// Interface Target (interface esperada pelo cliente)
interface TomadaDeTresPinos {
    public void ligarTomadaDeTresPinos();
}

// Classe Adapter (classe que adapta a classe Adaptee para a interface Target)
class AdaptadorDeTomada implements TomadaDeTresPinos {
    TomadaDeDoisPinos tomadaDeDoisPinos;

    public AdaptadorDeTomada(TomadaDeDoisPinos tomadaDeDoisPinos) {
        this.tomadaDeDoisPinos = tomadaDeDoisPinos;
    }

    public void ligarTomadaDeTresPinos() {
        System.out.println("Ligando tomada de três pinos...");
        tomadaDeDoisPinos.ligarTomadaDeDoisPinos();
    }
}

// Classe Cliente (classe que utiliza a interface Target)
class Cliente {
    public static void main(String[] args) {
        TomadaDeTresPinos tomada = new AdaptadorDeTomada(new TomadaDeDoisPinos());
        tomada.ligarTomadaDeTresPinos();
    }
}