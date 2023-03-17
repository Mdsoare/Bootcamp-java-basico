/**
* Objetivo: Crie uma classe LinguagemFavorita que possua os atributos
* nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
* 3 linguagens e faça um programa que ordene esse conjunto por:
* A. Ordem de Inserção
* B. Ordem Natural (nome)
* C. IDE
* D. Ano de criação e nome
* E. Nome, ano de criacao e IDE
* Ao final, exiba as linguagens no console, um abaixo da outra.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-14
*/

import java.util.ArrayList; 
import java.util.List; 
import java.util.Collections; 
import java.util.Comparator; 

public class LinguagemFavorita{
	
	public static void main(String[] args){
		
		List<Linguagem> minhaLiguagemFavorita = new ArrayList<>(){{
		add(new Linguagem("Java", 1991, "Intellij"));
		add(new Linguagem("Python", 1991, "PyCharm"));
		add(new Linguagem("JavaScript", 1995, "Eclipse"));
		}};
		
		System.out.println("");
		System.out.println("--\tOrdem de Insercao\t--");
		System.out.println(minhaLiguagemFavorita);
		
		System.out.println("");
		System.out.println("--\tOrdem Natural (Nome)\t--");
		Collections.sort(minhaLiguagemFavorita);
		System.out.println(minhaLiguagemFavorita);
		
		System.out.println("");
		System.out.println("--\tOrdem IDE\t--");
		Collections.sort(minhaLiguagemFavorita, new ComparatorIde()); 
		System.out.println(minhaLiguagemFavorita);
		
		System.out.println("");
		System.out.println("--\tOrdem AnoDeCriacao/Nome\t--");
		Collections.sort(minhaLiguagemFavorita, new ComparatorAnoDeCriacaoNome()); 
		System.out.println(minhaLiguagemFavorita);
		
		System.out.println("");
		System.out.println("--\tOrdem Nome/AnoDeCriacao/Ide\t--");
		Collections.sort(minhaLiguagemFavorita, new ComparatorNomeAnoDeCriacaoIde()); 
		System.out.println(minhaLiguagemFavorita);
		
		System.out.println("");
		System.out.println("--\tNome Ordenado um Abaixo do Outro\t--");
		for(Linguagem nome : minhaLiguagemFavorita) System.out.println(nome.getNome());
	}
}

class Linguagem implements Comparable<Linguagem>{
	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	Linguagem(String nome, Integer anoDeCriacao, String ide){
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Integer getAnoDeCriacao(){
		return anoDeCriacao;
	}
	
	public String getIde(){
		return ide;
	}

	@Override
	public String toString(){ 
		return "{" +
				"Nome='" + nome + '\'' +
				", Ano de criacao='" + anoDeCriacao + '\'' +
				", IDE='" + ide + '\'' +
				'}';
	}
	@Override
	public int compareTo(Linguagem linguagem) { 
		return this.getNome().compareToIgnoreCase(linguagem.getNome());
	}
}

class ComparatorAnoDeCriacao implements Comparator<Linguagem>{ 
	@Override
	public int compare(Linguagem lg1, Linguagem lg2){
		return Integer.compare(lg1.getAnoDeCriacao(), lg2.getAnoDeCriacao());
	}
}

class ComparatorIde implements Comparator<Linguagem>{ 
    @Override
    public int compare(Linguagem lg1, Linguagem lg2){
        return lg1.getIde().compareTo(lg2.getIde());
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<Linguagem>{ 
	@Override
	public int compare(Linguagem lg1, Linguagem lg2){
		int anoDeCriacao = lg1.getAnoDeCriacao().compareTo(lg2.getAnoDeCriacao());
		if (anoDeCriacao != 0 ) return anoDeCriacao;
		
		return lg1.getNome().compareTo(lg2.getNome());
	}
}
	
class ComparatorNomeAnoDeCriacaoIde implements Comparator<Linguagem>{ 
    @Override
    public int compare(Linguagem lg1, Linguagem lg2){
            
        int nome = lg1.getNome().compareToIgnoreCase(lg2.getNome());
        if (nome != 0 ) return nome;
        
        int anoDeCriacao = lg1.getAnoDeCriacao().compareTo(lg2.getAnoDeCriacao());
        if (anoDeCriacao != 0 ) return anoDeCriacao;
        
        return lg1.getIde().compareTo(lg2.getIde());
    }
}