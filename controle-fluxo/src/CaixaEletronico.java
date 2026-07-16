public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 20.50;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo após saque: " +saldo);
        }else
            System.out.println("Saldo insuficiente");

        System.out.println("Saldo: " +saldo);

    }
}
