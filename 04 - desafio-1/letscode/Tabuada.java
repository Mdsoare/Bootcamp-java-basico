/**
* Exemplo de uso de laço com "for ""  
* Descrição: Exemplo de como podemos tratar programas usando "for"
* exercício ministrado para ADA, Santander Coders 2023 
*
* @author marcelo Soares
* @since 2023-05-25
*/

public class Tabuada {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++){
            System.out.println("");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j  + " = " + j * i); 
            }
        }
    }
}