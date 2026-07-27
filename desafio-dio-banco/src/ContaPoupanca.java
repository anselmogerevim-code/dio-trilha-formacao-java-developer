// Classe ContaPoupanca
// Representa uma conta do tipo Poupança, que herda da classe abstrata Conta.
// Como herda de Conta, ela já possui atributos e métodos comuns (titular, agência, número, saldo).
// Aqui, sobrescrevemos alguns métodos para personalizar o comportamento da poupança.
public class ContaPoupanca extends Conta {

    // Construtor da ContaPoupanca
    // Recebe um objeto Cliente e passa para o construtor da classe mãe (Conta).
    // Isso garante que a conta poupança esteja associada a um cliente específico.
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Sobrescrevemos o método imprimirExtrato da interface IConta
    // Esse método imprime um extrato detalhado da conta poupança.
    // Primeiro mostramos o cabeçalho "Extrato da conta Poupança"
    // e depois chamamos o método da classe mãe (Conta) que imprime os dados básicos.
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato da conta Poupança ===");
        super.imprimirInfosComuns(); // imprime titular, agência, número e saldo
    }

    // Sobrescrevemos o método imprimirContas
    // Esse método é usado pelo Banco para listar todas as contas.
    // Aqui personalizamos o cabeçalho para diferenciar a poupança das demais contas.
    @Override
    protected void imprimirContas() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirInfosComuns(); // imprime os dados comuns da conta
    }
}
