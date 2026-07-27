// Classe ContaCorrente
// Representa uma conta do tipo Corrente, que herda da classe abstrata Conta.
// Como herda de Conta, já possui atributos e métodos comuns (titular, agência, número, saldo).
// Aqui, sobrescrevemos alguns métodos para personalizar o comportamento da conta corrente.
public class ContaCorrente extends Conta {

    // Construtor da ContaCorrente
    // Recebe um objeto Cliente e passa para o construtor da classe mãe (Conta).
    // Isso garante que a conta corrente esteja associada a um cliente específico.
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Sobrescrevemos o método imprimirExtrato da interface IConta
    // Esse método imprime um extrato detalhado da conta corrente.
    // Primeiro mostramos o cabeçalho "Extrato da conta Corrente"
    // e depois chamamos o método da classe mãe (Conta) que imprime os dados básicos.
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato da conta Corrente ===");
        super.imprimirInfosComuns(); // imprime titular, agência, número e saldo
    }

    // Sobrescrevemos o método imprimirContas
    // Esse método é usado pelo Banco para listar todas as contas.
    // Aqui personalizamos o cabeçalho para diferenciar a conta corrente das demais contas.
    @Override
    protected void imprimirContas() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirInfosComuns(); // imprime os dados comuns da conta
    }
}

