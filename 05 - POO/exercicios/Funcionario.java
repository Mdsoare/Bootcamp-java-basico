/**
* Objetivo: Criar as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro"
* Realizar Upcasting e Downcasting de exemplos
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-10
*/

class Funcionario{ // Criacao da superclasse
	//Logica aqui: atributos e metodos 
}

class Gerente extends Funcionario{ // criacao da subclasse 
	//Logica aqui: atributos e metodos
}

class Vendedor extends Funcionario{ // criacao da subclasse 
	//Logica aqui: atributos e metodos
}

class Faxineiro extends Funcionario{ // criacao da subclasse 
	//Logica aqui: atributos e metodos
}

class TesteUpcastDowncast{
	public static void main(String[] args){
		
		// Criando objeto:
		Funcionario funcionario1 = new Funcionario(); 
		
		// Exemplos de Upcasting:
		Funcionario gerente1 = new Gerente();
		Funcionario vendedor1 = new Vendedor();
		Funcionario faxineiro1 = new Faxineiro(); 
		
		// Ou:
		Gerente gerente2 = new Gerente(); //Criando objeto
		Funcionario funcionario2 = gerente2; // Upcasting 
		
		
		// Exemplos de Downcasting: 
		//NOTA: Eh fortemenete recomendado evitar Downcasting!!!
		Funcionario gerente3 = (Funcionario) new Gerente();
		Funcionario vendedor2 = (Funcionario) new Vendedor();
		Funcionario faxineiro2 = (Funcionario) new Faxineiro();
		
		// Ou
		Faxineiro faxineiro = new Faxineiro(); //Criando objeto
        Funcionario faxineiro3 = faxineiro; // Downcasting
		
		
		//Exemplo de Downcasting, com erro em tempo de execucao (java.lang.ClassCastException):
		Faxineiro faxineiro4 = (Faxineiro) new Funcionario(); //Evitar esta forma!!!
		/*
		* OBS: O downcasting do objeto "Funcionario" para a classe "Faxineiro" como esta eh problematico 
		* porque um objeto da classe "Funcionario" nao pode ser convertido automaticamente para um objeto da classe "Faxineiro", 
		* ja que essa ultima eh uma subclasse de "Funcionario" e pode ter mais atributos e metodos especificos. 
		* Eh necessario que o objeto seja originalmente criado como um objeto da classe "Faxineiro"
		* ou de uma de suas subclasses. Caso contrario, um erro de tempo de execucao ocorrera.
		*/
	}
}

