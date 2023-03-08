/**
* Classe de exemplo para o exercício de Orientação a Objetos
* Exercícios com criação do construtor, estado inicial dos atributos e criação dos métodos "get" e "set"
* Aula: 03
* 
* @author Marcelo Soares
* @version 1.2
* @since 2023-03-08
*/

class Carro{
	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	Carro(){ // Sobrecarga -> metodo construtor. Boa pratica eh criar apos os atributos
		
	}
	
	Carro(String cor, String modelo, int capacidadeTanque){// Sobrecarga -> estado inicial dos atributos.
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	void setCor(String cor){ // metodos sets e gets. Seguindo as boas praticas
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
	
	double valorTotalEncherTanque(double valorCombustivel){ // metodos mais complexos apos os sets e gets
		return capacidadeTanque * valorCombustivel;
	}
}