import java.util.Locale;
import java.util.Scanner;

public class EstruturasExcepcionais {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");

        int idade = 0;
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                idade = scanner.nextInt();
                idadeValida = true; // se não lançar exceção, sai do loop

            } catch (Exception e) {
                System.out.println("Idade inválida! Digite novamente a idade em números inteiros Ex:15, 18, 20");
                scanner.next(); // limpando o buffer

            }
        }


        System.out.println("Digite sua altura");
        //Outra forma de tratar exceções

        try { // tratando exceções - Outra maneira de tratar exceções (forma mais simples, encerra o programa ao lançar exceção)
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        System.out.println("========= Outra forma de tratar exceções =========");
        scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro ao ler dados!");
        }
    }
}
