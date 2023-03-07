/**
* Objetivo: Criar um programa que calcule as areas do quadrado, retangulo e trapezio 
* com uso de sobrecarga
*
* Tratamento de erros de valores
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-04
*/

public class Quadrilatero{
    public static void main(String[] args){
        
        //Criacao das variaves ja invocando os metodos com sobrecarga
        int quadrado = area(5);
        double retangulo = area(3, 4);
        float trapezio = area(8.1f, 5, 4.5f);
        
        // Exibindo os resultados
        System.out.println("\nArea do quadrado: " + quadrado);
        System.out.println("\nArea do retangulo: " + retangulo);
        System.out.println("\nArea do trapezio: " + trapezio);
    }
    
    // Criacao do metodo "area"
    public static int area(int lado){
        if (lado < 0) {
            throw new IllegalArgumentException("O lado nao pode ser negativo.");
        }
        return (lado * lado);
    }
    
    // Sobrecarga do metodo "area"
    public static double area(double lado1, double lado2){
        if (lado1 < 0 || lado2 < 0) {
            throw new IllegalArgumentException("Os lados nao podem ser negativos.");
        }
        return (lado1 * lado2);
    }
    
    // Nova sobrecarga do metodo "area"
    public static float area(float baseMaior, int baseMenor, float altura){
        if (baseMaior < 0 || baseMenor < 0 || altura < 0) {
            throw new IllegalArgumentException("As bases e a altura nao podem ser negativas.");
        }
        return (( (baseMaior + baseMenor) * altura )/2);
    }
}