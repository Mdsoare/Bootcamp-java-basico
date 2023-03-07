/**
* Objetivo: Criar um programa que calcule as areas do quadrado, retangulo e trapezio 
* com uso de sobrecarga
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-04
*/

public class Quadrilatero{
	public static void main(String[] args){
		
		//Criacao das variaves ja invocando os metodos com sobrecarga
		int quadrado = area(5);
		double retangulo = area(3.0 , 4.5);
		float trapezio = area(8.0f , 5f , 4.3f);
		
		// Exibindo os resultados
		System.out.println("\nArea do quadrado: " + quadrado);
		System.out.println("\nArea do retangulo: " + retangulo);
		System.out.println("\nArea do trapezio: " + trapezio);
	}
	
	// Criacao do metodo "area" - OBS: Ass = metodo + parametro
	public static int area(int lado){
		
		return (lado * lado);
	}
	
	// Sobrecarga do metodo "area" - OBS: Houve mudanca de assinatura
	public static double area(double lado1, double lado2){
		return (lado1 * lado2);
	}
	
	// Nova sobrecarga do metodo "area"
	public static float area(float baseMaior, float baseMenor, float altura){
		return (( (baseMaior + baseMenor) * altura ) /2);
	}
}