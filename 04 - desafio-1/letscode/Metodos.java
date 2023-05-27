/**
* Exemplo de uso de Métodos em Java    
* Descrição: Apenas alguns exemplos de como podemos tratar programas usando Métodos
* exercício ministrado para ADA, Santander Coders 2023 
*
* @author marcelo Soares
* @since 2023-05-25
*/

public class Metodos {
    public static void main(String[] args) {
    String nome = "Let's Code";
    saudacao(nome);
	
	int resultado = soma(2, 3);
	System.out.println(resultado);
    }

    public static void saudacao(String nome) {
        System.out.println("Olá! " + nome);        
    }

	public static int soma(int a, int b){
		return a + b;
	}
}