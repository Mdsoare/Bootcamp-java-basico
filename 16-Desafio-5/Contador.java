import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = solicitarNumero(sc, "Digite o primeiro parâmetro");
        int numero2 = solicitarNumero(sc, "Digite o segundo parâmetro");
    
        try {
            int iteracoes = contar(numero1, numero2);
            imprimirNumeros(iteracoes);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    static int solicitarNumero(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    static void imprimirNumeros(int iteracoes) {
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println(String.format("Imprimindo o número %d", i));
        }
    }

    static int contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("ERRO: O segundo número deve ser maior que o primeiro!");
        } else {
            return numero2 - numero1;
        }
    }
}
