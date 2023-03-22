import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class ExemploImc {

  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in).useLocale(locale.US);
    // instanciando e criando um objeto Scanner
    
	char sexo;
    double h, psIdeal;

    System.out.printf("Informe o sexo (M/F)........: ");
    sexo = (char)System.in.read();
    // entrada de dados (lendo um caractere)

    System.out.printf("Informe a altura (em metros): ");
	h = ler.nextDouble();
	//entrada de dados (lendo um valor real)

    if ((sexo == 'M') || (sexo == 'm'))
      psIdeal = (72.7 * h) - 58;
    else psIdeal = (62.1 * h) - 44.7;

    System.out.printf("\nPeso Ideal = %.2f kgs\n", psIdeal);
  }

}
/*
efetuar a leitura do sexo e da altura (como um valor em metros,
variável h) de uma pessoa que serão aplicados nas seguintes fórmulas:

    Para homens, peso ideal = (72,7 * h) - 58;
    Para mulheres, peso ideal = (62,1 * h) - 44,7.
*/
