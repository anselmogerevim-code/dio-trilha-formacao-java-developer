import java.util.ArrayList;
import java.util.List;

// Classe Banco
// Representa um banco que possui um nome e uma lista de contas.
// É responsável por armazenar e gerenciar todas as contas criadas.
public class Banco {
    // Nome do banco
    private String nome;

    // Lista de contas associadas ao banco
    // Usamos ArrayList para poder adicionar/remover contas dinamicamente.
    private List<Conta> contas = new ArrayList<>();

    // Getter para o nome do banco
    public String getNome() {
        return nome;
    }

    // Setter para o nome do banco
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a lista de contas
    public List<Conta> getContas() {
        return contas;
    }

    // Setter para a lista de contas
    // Permite substituir toda a lista de contas por outra.
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Método para imprimir todas as contas do banco
    // Percorre a lista de contas e chama o método imprimirContas() de cada uma.
    // Esse método é sobrescrito em ContaCorrente e ContaPoupanca,
    // garantindo que cada tipo de conta imprima seu cabeçalho específico.
    public void imprimirContas() {
        System.out.println("\n=== Contas ===");
        for (Conta conta : contas) {
            // Aqui chamamos o método sobrescrito em cada subclasse
            conta.imprimirContas();
            System.out.println("---------------------");
        }
    }
}
