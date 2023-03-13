/**
* Objetivo: Dadas as seguintes informacoes sobre meus gatos, crie uma lista
* e ordene-a exibindo:
* (nome - idade - cor);
*
* Gato 1 = nome : Jon, idade : 18, cor : preto
* Gato 2 = nome : Simba, idade : 6, cor : tigrado
* Gato 3 = nome : Jon, idade : 12, cor : amarelo
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-12
*/
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.List; 

public class ExemploOrdenacaoList {
	
	public static void main(String[] args){
		
		List<Gato> meusGatos = new ArrayList<>();
		meusGatos.add(new Gato("Jon", 18, "preto"));
		meusGatos.add(new Gato("Simba", 6, "tigrado"));
		meusGatos.add(new Gato("Jon", 12, "amarelo"));
		
		System.out.println("--\tOrdem de Insercao\t--");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem aleatoria\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Natural (Nome)\t--");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Idade\t--");
		meusGatos.sort(Comparator.comparing(Gato::getIdade));
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Cor\t--");
		meusGatos.sort(Comparator.comparing(Gato::getCor));
		System.out.println(meusGatos);
				
		System.out.println("--\tOrdem Nome/Cor/Idade\t--");
		meusGatos.sort(Comparator.comparing(Gato::getNome).thenComparing(Gato::getCor).thenComparing(Gato::getIdade));
		System.out.println(meusGatos);
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) { 
		this.nome = nome; 
		this.idade = idade; 
		this.cor = cor; 
	}
	
	public String getNome() { 
		return nome;
	}

	public Integer getIdade() {
		return idade; 
	}

	public String getCor() { 
		return cor; 
	}
	
	@Override
	public String toString(){
		return "{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", cor='" + cor + '\'' +
				'}';
	}
	
	@Override
	public int compareTo(Gato gato) {
		return this.nome.compareToIgnoreCase(gato.getNome());
	}
}