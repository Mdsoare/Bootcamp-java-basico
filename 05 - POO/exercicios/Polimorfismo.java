/**
* Objetivo: Criar classes para demostrar o conceito de sobreescrita e polimorfismo
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-10
*/

class ClasseMae{
	
	void metodo1(){
		System.out.println("Metodo 1");
	}
	
	void metodo2(){
		System.out.println("Metodo 2");
	}
}

class ClasseFilha1 extends ClasseMae{ 
	
	@Override // Conceito de polemorfismo
	void metodo1(){
		System.out.println("Metodo 1 da ClasseFilha1");
	}
	//Como nao tem @override para o metodo2, na execucao teremos sobreescrita
}


class ClasseFilha2 extends ClasseMae{ 
	
	@Override // Conceito de polemorfismo
	void metodo1(){
		System.out.println("Metodo 1 da ClasseFilha2");
	}
	
	
	@Override // Conceito de polemorfismo
	void metodo2(){
		System.out.println("Metodo 2 da ClasseFilha2");
	}
}

class RodarAplicacao{
	public static void main(String[] args){
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe : classes) {
			classe.metodo1();
		}
		
		System.out.println("");
		
		for (ClasseMae classe : classes) {
			classe.metodo2();
		}
		
		System.out.println("");
		
		ClasseFilha2 classeFilha2 = new ClasseFilha2(); 
		classeFilha2.metodo2(); // Conceito de sobreescrita
	}
	
}