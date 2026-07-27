// Interface IConta
// Define o "contrato" que todas as classes de conta (ex: ContaCorrente, ContaPoupanca)
// devem seguir. Ou seja, qualquer classe que implemente IConta precisa fornecer
// uma implementação para todos os métodos abaixo.
public interface IConta {

    // Método para realizar um saque
    // Recebe como parâmetro o valor a ser retirado do saldo da conta.
    // A implementação deve verificar se há saldo suficiente antes de debitar.
    void sacar(double valor);

    // Método para realizar um depósito
    // Recebe como parâmetro o valor a ser adicionado ao saldo da conta.
    // A implementação deve simplesmente somar o valor ao saldo atual.
    void depositar(double valor);

    // Método para realizar uma transferência
    // Recebe o valor a ser transferido e a conta de destino.
    // A implementação deve debitar o valor da conta atual e creditar na contaDestino.
    void transferir(double valor, Conta contaDestino);

    // Método para imprimir o extrato da conta
    // Deve mostrar informações como titular, agência, número e saldo.
    // Cada tipo de conta (corrente, poupança) pode personalizar o cabeçalho do extrato.
    void imprimirExtrato();
}
