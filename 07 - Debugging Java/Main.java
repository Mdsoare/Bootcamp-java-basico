/**
* Objetivo: Classe Main criada para simular execucao de metodos e mostrar a pilha.
* Exercicio proposto para atividades de debugging 
*
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-19
*/

class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa Main...");
        System.out.println("");
        a();
        System.out.println("");
        System.out.println("Finalizando o programa Main...");
    }
    
    static void a(){
        System.out.println("");
        System.out.println("Iniciando o metodo a...");
        for (int i = 0; i <= 4; ++i) System.out.print("\t" + i + "\t");
        b();
        System.out.println("");
        System.out.println("Finalizando o metodo a...");
    }
    
    static void b(){
        System.out.println("");
        System.out.println("Iniciando o metodo b...");
        for (int i = -5; i <= 0; ++i) System.out.print("\t" + i + "\t");
        c();
        System.out.println("");
        System.out.println("Finalizando o metodo b...");
    }
    
    static void c(){
        System.out.println("");
        System.out.println("Iniciando o metodo c...");
        Thread.dumpStack();
        System.out.println("");
        System.out.println("Finalizando o metodo c...");
    }
}