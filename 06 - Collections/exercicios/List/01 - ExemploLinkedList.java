/**
* Objetivo: Trabalhar com LinkedList
*
* @author Marcelo Soares
* @version 2.0
* @since 2023-03-12
*/
//import java.util.Queue;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays; 
import java.util.List;

class ExemploLinkedList{
    
    public static void main(String[] args){
        
        System.out.println("Crie uma lista chamada notas1 com os valores [7, 8.5, 9.3, 5, 7, 0, 3.6]: ");
        List<Double> notas1 = new LinkedList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 )); 
        System.out.println("Notas 1 : " + notas1);
        System.out.println("");
        
        System.out.println("Crie outra lista chamada notas2 e importe os valores de nota1: ");
        LinkedList<Double> notas2 = new LinkedList<>(notas1);
        System.out.println("");
        System.out.println("Notas 2: " + notas2);
        
        System.out.println("");
        System.out.println("Mostre a primeira nota da lista sem remove-lo: ");
        Double primeiroItem = notas2.getFirst();
        System.out.println(primeiroItem);
        
        System.out.println("");
        System.out.println("Notas 2: " + notas2);
        
        System.out.println("");
        System.out.println("Mostre a primeira nota da lista removendo-o: ");
        System.out.println(primeiroItem = notas2.poll());
        
        System.out.println("");
        System.out.println("Notas 2: " + notas2);
        
    }
}