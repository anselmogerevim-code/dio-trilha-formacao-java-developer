import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivoIntegrado {
    public static void main(String[] args) {
        // Seleciona candidatos
        List<Candidato> aprovados = selecaoCandidatos();

        System.out.println("\n========= Candidatos Selecionados =========");
        for (Candidato candidato : aprovados) {
            System.out.println(candidato.nome + " - pediu R$ " + candidato.salarioPretendido);
        }

        // Avalia cada aprovado
        System.out.println("\n========= Avaliação dos Selecionados =========");
        for (Candidato candidato : aprovados) {
            System.out.println("Candidato " + candidato.nome + " pediu R$ " + candidato.salarioPretendido);
            analisarCandidato(candidato.salarioPretendido);
        }

        // Tenta contato com os aprovados
        System.out.println("\n========= Tentando Contato =========");
        for (Candidato candidato : aprovados) {
            entrandoEmContato(candidato.nome);
        }
    }

    // Método que seleciona até 5 candidatos com base no salário pretendido
    static List<Candidato> selecaoCandidatos() {
        String[] nomes = { "FELIPE", "JOAO", "MARIA", "LUCAS", "ANA", "MARIA", "LUCAS", "FELIPE", "PAULO", "JOAQUINA" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        List<Candidato> aprovados = new ArrayList<>();

        // Loop até selecionar 5 candidatos ou percorrer toda a lista
        while (candidatosSelecionados < 5 && candidatosAtual < nomes.length) {
            String nome = nomes[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + nome + " solicitou salário de R$ " + salarioPretendido);

            // Critério de seleção: salário pretendido menor ou igual ao salário base
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + nome + " foi selecionado");
                aprovados.add(new Candidato(nome, salarioPretendido)); // Cria objeto Candidato
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        return aprovados;
    }

    // Método que gera um salário pretendido aleatório entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    // Método que analisa um candidato individualmente
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    // Método que simula a tentativa de contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
    }

    // Método auxiliar que simula se o candidato atende ou não
    static boolean atender() {
        return new Random().nextInt(3) == 1; // 1 chance em 3 de atender
    }
}
