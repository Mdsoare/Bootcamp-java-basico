/**
* O codigo abaixo eh um exemplo de como utilizar a interface List para manipular listas de elementos
*
* Referencias:
* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
* https://www.devmedia.com.br/trabalhando-com-a-classe-list-no-java/34148
* https://www.devmedia.com.br/java-collections-ordenacao-e-busca-com-o-metodo-sort-da-classe-collections/29444
* https://www.baeldung.com/java-collections-remove-elements-matching-criteria
* https://www.devmedia.com.br/java-metodo-para-calculo-de-media-aritmetica/1661
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-12
*/
// import java.util.Arrays; // Se trabalhar com Arrays.asList

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

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
		
		if (!notas.contains(5d)) System.out.println("Nota nao encontrada...");
				
		System.out.println("Imprima a lista na ordem de insercao dos elementos: "); 
		for(Double nota : notas) System.out.println(nota); //Embora a List ja conserva a ondem de insercao, portanto era so imprimir "notas", vamos exemplificar usando foreach
		
		System.out.println("");
		System.out.println("Exiba a terceira nota adicionada: ");
		System.out.println(notas.get(2)); //OBS: O indice inicia com "0"
		
		System.out.println("");
		System.out.println("Exiba a menor nota: ");
		System.out.println(Collections.min(notas));  // Como existe um metodo nativo em List vamos usar Collections
		
		System.out.println("");
		System.out.println("Exiba a maior nota: ");
		System.out.println(Collections.max(notas)); // Como existe um metodo nativo em List vamos usar Collections
		
		System.out.println("");
		System.out.println("Exiba a soma dos valores: "); // Tb nao existe metodo nativo em List para isso. Usaremos o Iterator
 		
		Iterator<Double> iterator1 = notas.iterator(); // variavel iterator para realizar a interacao com a lista
		Double soma = 0d; // Variavel de controle para while
		while (iterator1.hasNext()){ // Enquanto tiver no iterator o proximo elemento faca:
			Double next = iterator1.next(); // variavel q recebera o falor da iteracao
			soma += next; // adiciona o valor a variavel soma 
		}
		
		System.out.println(soma); // exibe o resultado da soma.

		/* 
		* OBS: Existem outras formas, por exemplo:
		*
		* Double soma = 0;
		* for (Double nota : notas) {
		*	soma += nota;
		* }
		* System.out.println(soma);
		*/
				
		System.out.println("");
		System.out.println("Exiba a media das notas: ");
		double media = soma / notas.size(); // size retorna o tamanho da lista (um inteiro)
		System.out.println(media);
	
		System.out.println("");
		System.out.println("Remova a nota 0.0: ");
		notas.remove(0d); // remove trabalha com posicao ou valor. Aqui foi usado o valor. Tb eh valido usar notas.remove(Double.valueOf(0)) ou notas.remove(new Double(0))
		System.out.println("Lista atualizada: " + notas);
	
		System.out.println("");
		System.out.println("Remova a nota da posicao 0: ");
		notas.remove(0);
		System.out.println("Lista atualizada: " + notas);
	
		System.out.println("");
		System.out.println("Remova as notas menores que 7 e exiba a lista atualizada: ");
			
		Iterator<Double> iterator2 = notas.iterator(); 
		while(iterator2.hasNext()){
			Double next = iterator2.next();
			if (next < 7d) iterator2.remove();
		}
		
		System.out.println("Lista atualizada: " + notas);
		
		/* OBS: Existem outras formas, por exemplo:
		 *
		 *	notas.removeIf(nota -> nota < 7);
		 * System.out.println("Lista atualizada: " + notas);
		*/
		
		System.out.println("");
		System.out.println("Apague toda a lista: ");
		notas.clear();
		
		System.out.println("");
		System.out.println("Confira se a lista esta vazia: ");
		// System.out.println("Lista atualizada: " + notas);
		if (notas.isEmpty()) System.out.println("A lista esta vazia!"); // .isEmpty() retorna um boleano. Aqui esperado true
	}
}