/**
* Exemplo de uso do padrão Observer    
* Descrição: Nesse exemplo, a classe "DadosMeteorologicos" representa o sujeito observado, que mantém os dados meteorológicos 
* e notifica os observadores quando há uma atualização nesses dados. 
* A interface "Observer" define as ações que podem ser tomadas pelos observadores, 
* enquanto a classe "DisplayAtual" implementa essa interface para representar um observador específico que exibe os dados atualizados em um console.
* Na classe principal "Programa", é criada uma instância do sujeito observado e uma instância do observador.
*
* @author marcelo Soares
* @since 2023-03-26
*/

import java.util.ArrayList;
import java.util.List;

// Interface que define as ações que podem ser tomadas pelo observador
interface Observer {
    void atualizar(double temperatura, double umidade, double pressao);
}

// Classe que representa o sujeito observado
class DadosMeteorologicos {
    private List<Observer> observadores;
    private double temperatura;
    private double umidade;
    private double pressao;

    public DadosMeteorologicos() {
        this.observadores = new ArrayList<>();
    }

    // Método para registrar um observador
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Método para remover um observador
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    // Método para atualizar os dados meteorológicos e notificar os observadores
    public void atualizarDados(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificarObservadores();
    }

    // Método para notificar os observadores sobre as mudanças nos dados meteorológicos
    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura, umidade, pressao);
        }
    }
}

// Classe que implementa a interface Observer e representa um observador específico
class DisplayAtual implements Observer {
    private double temperatura;
    private double umidade;
    private double pressao;

    // Método que é chamado pelo sujeito observado quando há uma atualização nos dados
    public void atualizar(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        exibirDados();
    }

    // Método que exibe os dados atualizados
    private void exibirDados() {
        System.out.println("Dados atualizados:");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Umidade: " + umidade);
        System.out.println("Pressão: " + pressao);
    }
}

// Classe principal que demonstra o uso do padrão Observer
public class Programa {
    public static void main(String[] args) {
        // Cria uma instância do sujeito observado
        DadosMeteorologicos dadosMeteorologicos = new DadosMeteorologicos();

        // Cria instâncias dos observadores
        DisplayAtual displayAtual = new DisplayAtual();

        // Registra os observadores no sujeito observado
        dadosMeteorologicos.registrarObservador(displayAtual);

        // Atualiza os dados meteorológicos, o que notifica o observador
        dadosMeteorologicos.atualizarDados(30.0, 50.0, 1013.25);
    }
}