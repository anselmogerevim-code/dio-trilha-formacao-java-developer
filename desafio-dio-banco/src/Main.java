public class Main {
    public static void main(String[] args) {
        // Criamos um banco e definimos o nome
        Banco banco = new Banco();
        banco.setNome("Banco XPTO");

        // === Clientes de Conta Corrente ===
        // Criamos a cliente Maria e sua conta corrente
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        Conta ccMaria = new ContaCorrente(maria);
        banco.getContas().add(ccMaria); // adiciona a conta ao banco

        // Criamos o cliente Anselmo e sua conta corrente
        Cliente anselmo = new Cliente();
        anselmo.setNome("Anselmo");
        Conta ccAnselmo = new ContaCorrente(anselmo);
        banco.getContas().add(ccAnselmo);

        // Criamos o cliente João e sua conta corrente
        Cliente joao = new Cliente();
        joao.setNome("João");
        Conta ccJoao = new ContaCorrente(joao);
        banco.getContas().add(ccJoao);

        // === Clientes de Conta Poupança ===
        // O mesmo cliente Anselmo também terá uma conta poupança
        Conta cpAnselmo = new ContaPoupanca(anselmo);
        banco.getContas().add(cpAnselmo);

        // Criamos a cliente Ana e sua conta poupança
        Cliente ana = new Cliente();
        ana.setNome("Ana");
        Conta cpAna = new ContaPoupanca(ana);
        banco.getContas().add(cpAna);

        // === Operações de teste ===
        // Depósitos iniciais em cada conta
        ccMaria.depositar(1000);   // Maria deposita 1000
        ccJoao.depositar(500);     // João deposita 500
        cpAnselmo.depositar(2000); // Poupança de Anselmo recebe 2000
        ccAnselmo.depositar(300);  // Corrente de Anselmo recebe 300
        cpAna.depositar(800);      // Ana deposita 800

        // Operações adicionais
        ccMaria.sacar(250);        // Maria saca 250 → saldo final 750
        cpAnselmo.transferir(500, ccJoao); // Anselmo transfere 500 da poupança para João
        ccAnselmo.depositar(200);  // Anselmo adiciona mais 200 na corrente → saldo final 500
        cpAna.sacar(100);  
        ccAnselmo.depositar(-2);        // Ana saca 100 → saldo final 700

        // === Impressão das contas ===
        // Aqui o banco percorre todas as contas e imprime os dados
        banco.imprimirContas();
    }
}
