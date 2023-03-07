/**
* Desafio 5
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-06
*/
import java.util.InputMismatchException;
import java.util.Scanner; 
    
public class MedidorDeVelocidade {
    public static final double VELOCIDADE_MAXIMA_PERMITIDA = 60;
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Velocidade lida: ");
		
        try {
            double velocidadeAtual = leitor.nextDouble();
            
            if (velocidadeAtual < 0) {
                System.out.println("Nao eh permitido inserir numeros negativos.");
                return;
            }
            
            boolean multado = verificaMultado(velocidadeAtual);
            String mensagem = getMensagem(multado);
            System.out.println(mensagem);
        } catch (InputMismatchException e) {
            System.out.println("Valor de entrada invalido.");
        }
    }
    
    public static boolean verificaMultado(double velocidadeAtual) {
        return velocidadeAtual > VELOCIDADE_MAXIMA_PERMITIDA;
    }
    
    public static String getMensagem(boolean multado) {
        return multado ? "Foi multado" : "Nao foi multado";
    }
}

