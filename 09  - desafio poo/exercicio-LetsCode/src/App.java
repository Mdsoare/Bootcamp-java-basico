public class App{

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Yellow", 0.75);
        Cachorro cachorro2 = new Cachorro("Pop", "white", 1.25);
        Cachorro cachorro3 = new Cachorro("Dog", "Gray", 0.85);
        Cachorro cachorro4 = new Cachorro("Pig", "Black", 0.45);

        System.out.println("Cachorro1_Nome: " + cachorro1.getNome());
        System.out.println("Cachorro2_Cor: " + cachorro2.getCor());
        System.out.println("Cachorro3_Tnh_Rabo: " + cachorro3.getTamanhoDoRabo());
        cachorro4.soar();
        System.out.println("Quantidade de Cães: " + cachorro4.getContador());       
    }
}