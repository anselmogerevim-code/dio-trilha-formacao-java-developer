// Classe abstrata Conta
// Serve como base para diferentes tipos de conta (Corrente, Poupança).
// Implementa a interface IConta, garantindo que todos os métodos obrigatórios existam.
// Não pode ser instanciada diretamente, apenas herdada.
public abstract class Conta implements IConta {

    // Constante que define a agência padrão para todas as contas
    private static final int AGENCIA_PADRAO = 1;

    // Variável estática usada para gerar números de conta sequenciais
    private static int SEQUENCIAL = 1;

    // Atributos comuns a todas as contas
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor da Conta
    // Toda nova conta recebe a agência padrão e um número sequencial único.
    // Também associa a conta a um cliente específico.
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Implementação do método sacar da interface IConta
    // Subtrai o valor do saldo da conta.
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
        saldo = saldo - valor; // ou saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Implementação do método depositar da interface IConta
    // Adiciona o valor ao saldo da conta.
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
        saldo = saldo + valor; // ou saldo += valor;
        } else {
            System.out.println("Valor inválido!");
            System.out.println("valor de depósito deve ser positivo!");

        }
    }

    // Implementação do método transferir da interface IConta
    // Realiza um saque na conta atual e um depósito na conta destino.
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);             // debita da conta atual
        contaDestino.depositar(valor); // credita na conta destino
    }

    // Métodos getters para acessar os atributos da conta
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método protegido que imprime informações comuns da conta
    // Usado por ContaCorrente e ContaPoupanca para evitar duplicação de código.
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: " +" R$ %.2f", this.saldo));
    }

    // Método abstrato que deve ser implementado pelas subclasses
    // Cada tipo de conta (Corrente, Poupança) imprime seu cabeçalho específico.
    protected abstract void imprimirContas();
}
