/**
* Exemplo de manipulação de Strings e datas   
* Descrição: Exemplos de como podemos tratar programas usando "Strings" e "Datas"
* exercício ministrado para ADA, Santander Coders 2023 
*
* @author marcelo Soares
* @since 2023-05-25
*/


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Mensagem {
    public static void main(String[] args) throws Exception {
        String  nome = "José";
        Locale brasil = new Locale("pt", "BR");
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil).toLowerCase();
        String saudacao;
        

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia!";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite!";
        } else{
            saudacao = "Hello";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}