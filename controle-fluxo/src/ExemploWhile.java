import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("\nDoce comprado: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
            System.out.println("Mesada restante: " + mesada);
        }
        System.out.println("Mesada: " + mesada );
        System.out.println("Joãozinho gastou toda a mesada em doces!");

    }
            private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2,15);
        }


}
