/**
* Exemplo de uso de Arrays    
* Descrição: Apenas alguns exemplos de como podemos tratar programas usando Arrays
* exercício ministrado para ADA, Santander Coders 2023 
*
* @author marcelo Soares
* @since 2023-05-25
*/

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        //Trabalhando com Array
        int[] numero = new int[5];   
        for (int i = 0; i < numero.length; i++){
            numero[i] = i * i;
        }
        for (int j = 0; j < numero.length; j++){
            System.out.println(numero[j]);     
        }
        //Outra forma de declarar Array
        String[] letras = {"A", "B", "C", "D", "E", "F", "G"};
        for (int k = 0; k < letras.length; k++ ){
            System.out.print(letras[k]);
        }
        //Outra forma de imprimir um Array
        System.out.print(Arrays.toString(letras));

        int[] numeros2 = {9, 10, 12, 25, 2};
        int maior = numeros2[0];
        int menor = numeros2[0];
        float media = 0;

        for (int l = 0; l < numeros2.length; l++) {
            if (numeros2[l] > maior) {
                maior = numeros2[l];
            }

            if (numeros2[l] < menor) {
                menor = numeros2[l];
            }
            media += numeros2[l];
        }
        media /= numeros2.length;
		
        System.out.println("\nResultado:");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }
}