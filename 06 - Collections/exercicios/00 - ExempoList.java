/**
* O codigo abaixo eh um exemplo de como utilizar a interface List para manipular listas de elementos
*
* O programa cria uma lista de notas de um aluno e realiza as seguintes operacoes:
*
* 1. Adiciona as sete notas na lista utilizando o metodo add da interface List.
* 2. Imprime a posicao da nota 5.0 utilizando o metodo indexOf da interface List.
* 3. Adiciona a nota 8.0 na posicao 4 da lista utilizando o metodo add da interface List.
* 4. Substitui a nota 5.0 pela nota 6.0 utilizando o metodo set da interface List.
* 5. Verifica se a nota 5.0 esta presente na lista utilizando o metodo contains da interface List.
* 6. Imprime a lista na ordem de insercao dos elementos utilizando um loop foreach.
*
* Ao executar o programa, ele ira imprimir na saida padrao a lista atualizada e os resultados das operacoes realizadas.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-12
*/
// import java.util.Arrays; // Se trabalhar com Arrays.asList
import java.util.ArrayList;
import java.util.List;

class ExempoList {
	
	public static void main(String[] args){
		
		System.out.println("Dada uma lista com sete notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faca:");
		System.out.println("");
		System.out.println("Crie um lista e adicione as sete notas:");
		
		
		/* Formas de criar:
		 * List notas = new ArrayList(); // Esta era a forma de criar uma lista antes do Java 5
		 * List<Double> notas = new ArrayList<>(); // Java 5 --> uso do Generics List<Tipo>. JDK 7 --> Diamond Operator "<>", i.e. nao precisa repetir <Double> no construtor
		 * ArrayList<Double> notas = new ArrayList<>(); // Porem, esta forma nao eh recomendada 
		 * List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 )); // Ja istanciando a lista
		 * List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ); // Esta forma nao permite adicao ou remocao de elementos. Erro de AbstractList.java:CODE
		 * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Semelhante a anterior, com algumas pequenas diferencas. Erro de ImmutableCollections.java:CODE
		*/
		
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		// System.out.println("Lista : " + notas.toString()); // Tb eh valido
		System.out.println("Lista : " + notas);
		System.out.println("");
		
		System.out.println("");
		System.out.println("Exiba a posicao da nota 5.0: ");
		System.out.println(notas.indexOf(5.0));
		
		System.out.println("");
		System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
		notas.add(4, 8.0);
		System.out.println("Lista atualizada: " + notas);
		
		System.out.println("");
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println("Lista atualizada: " + notas);
		
		System.out.println("");
		System.out.println("Confira se a nota 5.0 esta na lista: ");
		
		if (!notas.contains(5d)){
		    	System.out.println("Nota nao encontrada...");
		}
		
		System.out.println("Imprima a lista na ordem de insercao dos elementos: "); 
		/* Neste caso eh so imprimir msm, pq a List ja faz isso!
		 * System.out.println("Lista : " + notas.toString());
		 *
         * Impressao usando foreach apenas como exemplo:
        */
		for(Double nota : notas) System.out.println(nota);
				
	}
}