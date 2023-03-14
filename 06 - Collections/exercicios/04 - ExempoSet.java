/**
* Objetivo: Exemplos de uso com Set (HashSet, LinkedHashSet e TreeSet)
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-14
*/

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.text.DecimalFormat;

class ExempoSet {
	
	public static void main(String[] args){
		
		System.out.println("Dada uma lista com sete notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faca:");
		
		/* Formas de criar:
		
		// Set notas = new HashSet(); // antes do Java 5
		// Set<Double> notas = new HashSet<>(); // Generics (jdk 5) - Diamont Operator (jdk 7)
		// HashSet<Double> notas = new HashSet<>();
		// Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // Ja istanciando o cojunto. OBS: import java.util.Arrays; 
		// Set<Double> notas =  Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		// 
		// Adicao e Remocao:
		//
		// notas.add(1d);
		// notas.remove(5d);
		//
		
		*/
		
		System.out.println("");
		System.out.println("Crie um conjunto e adicione as notas:");
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //OBS: Como o Set nao admite repeticao de valores nao sera adicionado
		System.out.println("Conjunto : " + notas.toString()); 
		
		System.out.println("");
		System.out.println("Confira se a nota 5.0 esta no Conjunto: ");
		if (notas.contains(5d)) System.out.println("Nota encontrada...");
		
		System.out.println("");
		System.out.println("Exiba a menor nota: ");
		System.out.println(Collections.min(notas));  // Como existe um metodo nativo em Set vamos usar Collections
		
		System.out.println("");
		System.out.println("Exiba a maior nota: ");
		System.out.println(Collections.max(notas)); // Como existe um metodo nativo em Set vamos usar Collections
		
		System.out.println("");
		System.out.println("Exiba a soma das notas: ");
		Iterator<Double> iterator1 = notas.iterator(); // variavel iterator para realizar a interacao
		Double soma = 0d; // Variavel de controle para while
		while (iterator1.hasNext()){ // Enquanto tiver no iterator o proximo elemento faca:
			Double next = iterator1.next(); // variavel q recebera o falor da iteracao
			soma += next; // adiciona o valor a variavel soma 
		}
		//Arredondando a saida: necessario "import java.text.DecimalFormat;"
		DecimalFormat df = new DecimalFormat("#.##");
		String somaFormatada = df.format(soma);
		System.out.println(somaFormatada); // exibe o resultado da soma
		
		System.out.println("");
		System.out.println("Exiba a media das notas: ");
		Double media = (soma / notas.size());
		System.out.println(media); // exibe o resultado nao arredondado
						
		System.out.println("");
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println("Conjunto atualizado: " + notas);
		
		System.out.println("");
		System.out.println("Remova as notas menores que 7 e exiba a conjunto atualizado: ");
		Iterator<Double> iterator2 = notas.iterator(); 
		while(iterator2.hasNext()){
			Double next = iterator2.next();
			if (next < 7d) iterator2.remove();
		}
		System.out.println("Conjunto atualizado: " + notas);
		
		System.out.println("");
		System.out.println("Crie outro conjuto com os mesmo valores do primeiro conjunto usando LinkedHashSet: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d); //OBS: Como o Set nao admite repeticao de valores nao sera adicionado
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println("Conjunto atualizado : " + notas2);
		System.out.println("");
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		//Como LinkedHashSet conserva apenas a ordem de insercao, vamos usar a implementacao TreeSet que trabalha com a ordem natural
		Set<Double> notas3 = new TreeSet<>(notas2);  
		// Como os elementos sao Double, que possuie o comparable, funcionara sem erro. 
		// Mas em outras classes nao posseu o comparable e nem for usado o Comparetor, nao funcionara 
		System.out.println("Conjunto ordenado : " + notas3);
		
		System.out.println("");
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		notas3.clear();
		
		System.out.println("");
		System.out.println("Confira se o conjunto esta vazio: ");
		if (notas.isEmpty()) System.out.println("Conjunto vazio!");
		if (!notas2.isEmpty()) System.out.println("Conjunto nao esta vazio!");
	}
}