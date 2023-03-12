/**
* Objetivo:  Mostra como implementar diferentes tipos de associacoes entre classes 
* utilizando diferentes formas de relacionamento: 
* Estrutural (composicao ou aglutinacao) e Comportamental (dependencia)
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-10
*/

/*
* Criacao de classe para composicao
*/
class Endereco{ 
	String estado;
	String cidade;
	String bairro;
	String rua;
	String numero;
	String complemento;
	int cep;
}

class Pessoa{
	String nome;
	int idade;
	String cor;
	char sexo;
	Endereco endereco; // criacao da associacao por composicao, i.e., com parte todo.
}

/*
* Criacao de classe para aglutinacao
*/
class Aluno{
	String nome;
	int matricula;
}

class Disciplina{
	String materia;
	Aluno aluno;  // criacao da associacao por aglutinacao, i.e., sem parte todo.
}

/*
* Criacao de classe para dependencia
*/

class Cliente{
	String nome;
	String cpf;
}

class Cupom{
	double desconto(){
		// logica aqui
	}
}

class Compra{
	int notaFiscal;
	Cliente cliente; // associacao por composicao
	
	void finalizar(Cupom cupom){ // associacao por dependencia
		// logica aqui
	} 
}