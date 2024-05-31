import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static void analisaCandidatura(double salarioPretendido) {
        double SALARIO_BASE = 2000.00;
        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoDeCandidatos() {

        List<String> listaDeCandidatosSelecionados = new ArrayList<>();
        String[] listaDeCandidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double SALARIO_BASE = 2000.00;

        while (candidatosSelecionados < 5 && candidatosAtuais < listaDeCandidatos.length) {
            String candidato = listaDeCandidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            System.out
                    .println(String.format("O candidato %s solicitou este salario %.2f", candidato, salarioPretendido));
            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println(String.format("O candidato %s foi selecionado para a vaga", candidato));
                listaDeCandidatosSelecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
        System.out.println("\nCandidatos selecionados:");
        Collections.sort(listaDeCandidatosSelecionados);
        listaDeCandidatosSelecionados.forEach(System.out::println);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(
                    String.format("CONSEGUIMOS CONTATO COM %s NA %d TENTATIVA\n", candidato, tentativasRealizadas));
        } else {
            System.out.println(String.format("NÃO CONSEGUIMOS CONTATO COM %s,  NÚMERO MÁXIMO TENTATIVAS %d\n REALIZADAS", candidato,
                    tentativasRealizadas));
        }
    }

    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

}
