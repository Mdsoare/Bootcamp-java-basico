/**
* Objetivo: Criar as classes "Veiculo", "Carro", "Moto" e "Caminhao"
* Apenas para demonstrar o conceito de heranca em Java, 
* onde as classes filhas(subclasses ou derivadas) herdam atributos e metodos da classe pai(mae, base ou superclasse),
* alem de poderem adicionar seus proprios atributos e metodos especificos. 
* Nao ha implementacao de funcionalidades ou metodos que executem acoes. 
* Portanto, o codigo nao faz nada alem de definir as classes e seus atributos e metodos.
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-09
*/

class Veiculo{
	
	String modelo;
	String cor;
	int anoFabricacao;
	int capacidadeTanque;
	
	Veiculo(){
		// Metodo construtor
	}
	
	Veiculo(String modelo, String cor, int anoFabricacao, int capacidadeTanque){ // Sobrecarga do metodo construtor
		
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	void setModelo(String modelo){ //Implementacao de getters e setters
		this.modelo = modelo;		
	}
	
	void setCor(String cor){
		this.cor = cor;		
	}
	
	void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;		
	}
	
	void setCapacidadeTanque(int capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;		
	}
	
	String getModelo(){
		return modelo;
	}
	
	String getCor(){
		return cor;
	}
	
	int getAnoFabricacao(){
		return anoFabricacao;
	}
	
	int getCapacidadeTanque(){
		return capacidadeTanque;
	}
	
}

class Carro extends Veiculo{ // Subclasse que herda atributos e metodos da classe Veiculo, alem de caracteristicas proprias
	
	String cambio; // Manual ou automatico
	String tipoDePortaMala; // Sedan ou ret
	
	Carro(){
		
	}
	
	Carro(String cambio, String tipoDePortaMala){
		this.cambio = cambio;
		this.tipoDePortaMala = tipoDePortaMala;
	}
	
	void setCambio(String cambio){
		this.cambio = cambio;
	}
	
	void setTipoDePortaMala(String tipoDePortaMala){
		this.tipoDePortaMala = tipoDePortaMala;
	}
	
	String getCambio(){
		return cambio;
	}
	
	String getTipoDePortaMala(){
		return tipoDePortaMala;
	}

}

class Moto extends Veiculo{ // Subclasse que herda atributos e metodos da classe Veiculo, alem de caracteristicas proprias
	
	String cilindradas;
	
	Moto(){
		
	}
	
	Moto(String cilindradas){
		this.cilindradas = cilindradas;
	}
	
	
	void setCilindradas(String cilindradas){
		this.cilindradas = cilindradas;
	}

	String getCilindradas(){
		return cilindradas;
	}

}

class Caminhao extends Veiculo{ // Subclasse que herda atributos e metodos da classe Veiculo, alem de caracteristicas proprias
	
	String cambio; // Manual ou automatico
	String tipoAcoplamento; //Bau ou carroceria
	
	Caminhao(){
		
	}
	
	Caminhao(String cambio, String tipoAcoplamento){
		this.cambio = cambio;
		this.tipoAcoplamento = tipoAcoplamento;
	}

	
	void setCambio(String cambio){
		this.cambio = cambio;
	}
		
	void setTipoAcoplamento(String tipoAcoplamento){
		this.tipoAcoplamento = tipoAcoplamento;
	}
	
	String getCambio(){
		return cambio;
	}
	
	String getTipoAcoplamento(){
		return tipoAcoplamento;
	}
	
}