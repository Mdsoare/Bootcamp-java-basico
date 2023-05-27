public class Cachorro extends Animais {

    static int contador;
    private double tamanhoDoRabo;

    public Cachorro(String nome, String cor, double d){
        this.nome = nome;
        this.cor = cor;
        this.tamanhoDoRabo = d;
        contador ++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cachorro.contador = contador;
    }
    public double getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(double tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void soar(){
        System.out.println("AU AU");
    }

    @Override
    public String toString() {
        return "Cachorro {" + "nome= '" + nome + '\'' + '}';
    }
}
