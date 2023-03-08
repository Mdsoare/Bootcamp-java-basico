/**
* Classe de exemplo para o exercício de Orientação a Objetos
* Exercícios de criação de objetos
* Aula: 03
* 
* @author Marcelo Soares
* @version 1.3
* @since 2023-03-08
*/

class Carro{
	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	Carro(){ 
		/* 
		* Sobrecarga -> metodo construtor. 
		* Boa pratica eh criar apos os atributos. 
		* OBS: Caso nao o criarmos, ele sera criado automaticamente
		*/
	}
	
	Carro(String cor, String modelo, int capacidadeTanque){
		// Sobrecarga -> estado inicial dos atributos.
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	void setCor(String cor){ 
		// metodos getter e setter. Seguindo as boas praticas
		this.cor = cor;
	}
	
	String getCor(){
		return cor;
	}
	
	void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	String getModelo(){
		return modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getCapacidadeTanque(){
		return capacidadeTanque;
	}
	
	double valorTotalEncherTanque(double valorCombustivel){ 
		// metodos mais complexos apos os getter e setter
		return capacidadeTanque * valorCombustivel;
	}
	
	
	public static void main(String[] args){
		//Metodo "main" criado para testar a classe "Carro"
		
		Carro carro1 = new Carro(); 
		/*Instanciando a classe "Carro" com o objeto "carro1":
		* Tipo "Carro"
		* Objeto "carro1" 
		* "new" palavra reservada para instanciar uma classe, neste caso "Carro" 
		* metodo construtor "Carro()"
		*/
		
		carro1.setCor("Azul");
		carro1.setModelo("BMW Seria 3");
		carro1.setCapacidadeTanque(59);
		// Setando valores atraves de metodos!
		
		System.out.println();
		System.out.println("Carro:");
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
		System.out.println("Valor tanque cheio: R$ " + carro1.valorTotalEncherTanque(6.39));
		// Obtendo os resultados...
		
		Carro carro2 = new Carro("Cinza", "Mercede-Benz Classe C", 66);
		// Novamente instanciando a classe "Carro" com o objeto "carro2"
		// Foi usada a sobrecarga com o metodo construtor "Carro(String cor, String modelo, int capacidadeTanque)"
		
		System.out.println();
		System.out.println("Carro:");
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque());
		System.out.println("Valor tanque cheio: R$ " + carro2.valorTotalEncherTanque(6.46));
		// Obtendo os resultados...
	}
	
}