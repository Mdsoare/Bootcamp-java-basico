import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ContaTerminal conta1 = new ContaTerminal();
            System.out.println("Benvindo ao sistema bancário!");

            System.out.println("Digite seu nome: ");
            conta1.setNomeCliente(sc.nextLine());

            System.out.println("Digite sua agencia: ");
            conta1.setAgencia(sc.nextLine());

            System.out.println("Digite o número da conta: ");
            conta1.setNumeroConta(sc.nextInt());
            sc.nextLine();

            System.out.println("Informe seu saldo: ");
            conta1.setSaldo(sc.nextDouble());
            sc.nextLine();

            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                            "sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque."
                    , conta1.getNomeCliente(), conta1.getAgencia(), conta1.getNumeroConta()
                    , conta1.getSaldo()));
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}