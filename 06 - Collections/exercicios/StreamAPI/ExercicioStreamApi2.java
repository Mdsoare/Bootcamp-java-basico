/**
* Objetivo: uso de Stream API
* 
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-17
*/

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

class ExercicioStreamApi2 {
	
	public static void main(String[] args) {
    
		// Criacao da lista de numeros aleatorios
		System.out.println("Crie uma lista e imprima seus valores: ");
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
    
		// Impressao dos valores da lista usando lambda
		System.out.println("Usando a funcao Lambda:");
		numerosAleatorios.forEach(s -> System.out.println(s)); // (argumento) -> (logica);
    
		// Impressao dos valores da lista usando reference method
		System.out.println("Usando Reference Method:");
		numerosAleatorios.forEach(System.out::println); // classe :: metodo;

		// Criacao de um Set com os 5 primeiros numeros da lista
		System.out.println("Coloque os 5 primeiros numeros em um Set:");
		numerosAleatorios.stream()
						 .limit(5) // como Set nao admite valores duplicados, o "1" nao sera exibido duas vezes .limit(5)
						 .collect(Collectors.toSet())
						 .forEach(System.out::println);
    
		// Conversao da lista de String em Integer
		System.out.println("Transforme a lista original de String em Integer:");
		List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
																	.map(Integer::parseInt)
																	.collect(Collectors.toList());  // uso do map permite fazer um parse de String para Integer
		numerosAleatoriosInteiros.forEach(System.out::println); // imprimindo a nova lista de Integer
		
		
		// Soma dos valores da lista numerosAleatoriosInteiros
		System.out.println("Soma dos valores da lista numerosAleatoriosInteiros:");
		int soma = numerosAleatoriosInteiros.stream()
											.reduce(0, (a, b) -> a + b); // funcao de acumulacao: soma dos elementos, onde "0" eh o valor inicial
		System.out.println(soma); // imprime a soma dos valores da lista
		
		/* Outro exemplo de uso do reduce:
		// Quadrado dos valores da lista numerosAleatoriosInteiros
		System.out.println("Quadrado dos valores da lista numerosAleatoriosInteiros:");
		int somaAoQuadrado = numerosAleatoriosInteiros.stream()
													  .reduce(1, (a, b) -> (int) Math.pow(a, b));
		System.out.println("A Quadrado dos valores ao quadrado eh: " + somaAoQuadrado);
		*/
		
		// Media dos valores da lista numerosAleatoriosInteiros
		System.out.println("Mostre a media dos valores da lista numerosAleatoriosInteiros:");
		numerosAleatorios.stream()
						 .mapToInt(Integer::parseInt) // converte para inteiros . Tambem admite .mapToInt(Integer::intValue)
						 .average() // calcula a media
						 .ifPresent(System.out::println); // imprime o resultado se presente
				
		// Gerando uma lista de numeros pares maiores do que 2
		System.out.println("Pegue os numeros maiores do que 2 e coloque numa lista:");
		List<Integer> numerosParesMaioresQueDois = numerosAleatoriosInteiros.stream()
																			.filter( i -> i % 2 == 0 && i > 2) // filtrando a lista
																			.collect(Collectors.toList());
		numerosParesMaioresQueDois.forEach(System.out::println); // imprimindo a nova lista de numeros pares
		
		// Removendo os numeros impares da lista numerosAleatoriosInteiros
		System.out.println("Remova os valores impares da lista:");
		numerosAleatoriosInteiros.removeIf( i -> i % 2 != 0);
		numerosAleatoriosInteiros.forEach(System.out::println); // imprimindo a nova lista
	}

}
