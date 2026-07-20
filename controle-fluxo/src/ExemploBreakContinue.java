public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++) {
            if(numero ==3)
                break;
            System.out.println("O número é: " + numero);
        }

        System.out.println("======= Fim do primeiro laço =======");

        for (int numero = 1; numero <=5; numero ++) {
            if(numero ==3)
                continue;
            System.out.println("O número é: " + numero);
        }
        System.out.println("======= Fim do segundo laço =======");
    }

}
