/**
* Descrição:  Neste exemplo, a classe Configuracao implementa o padrão Singleton. O membro estático instancia armazena a única instância da classe. 
* O construtor da classe é privado para evitar que outras classes instanciem a classe diretamente. 
* O método estático getInstancia é responsável por retornar a única instância da classe, criando uma nova instância se instancia ainda não tiver sido inicializado.
* Os membros da classe armazenam a configuração e os métodos de acesso são fornecidos para configurar e obter os valores da configuração. 
*
* @author marcelo Soares
* @since 2023-03-26
*/

public class Configuracao {
    // O membro estático 'instancia' armazena a única instância da classe Configuracao
    private static Configuracao instancia = null;

    // O construtor da classe é privado para evitar que outras classes instanciem a classe diretamente
    private Configuracao() {
        // Aqui são inicializados os valores padrão da configuração
        this.porta = 8080;
        this.endereco = "localhost";
        this.debug = false;
    }

    // O método estático 'getInstancia' é responsável por retornar a única instância da classe Configuracao
    public static Configuracao getInstancia() {
        // Se 'instancia' ainda não foi inicializado, cria-se uma nova instância da classe
        if (instancia == null) {
            instancia = new Configuracao();
        }
        // Retorna a instância existente ou recém-criada
        return instancia;
    }

    // Membros da classe que armazenam a configuração
    private int porta;
    private String endereco;
    private boolean debug;

    // Métodos de acesso aos membros da classe
    public int getPorta() {
        return this.porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}