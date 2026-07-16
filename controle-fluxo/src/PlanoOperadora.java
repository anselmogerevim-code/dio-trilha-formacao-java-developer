public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "t"; // M / T
        //equalsIgnoreCase para ignorar se é maiúsculo ou minúsculo
        if (plano.equalsIgnoreCase("B")) {
            System.out.println("100 minutos de ligação");
        } else if (plano.equalsIgnoreCase("M")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
        } else if (plano.equalsIgnoreCase("T")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
            System.out.println("5Gb Youtube");
        } else {
            System.out.println("Plano inválido");
        }

        System.out.println("---------------------------------------------------");

        //Usando switch case:
        switch (plano.toUpperCase()) { //toUpperCase para ignorar se é maiúsculo ou minúsculo
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");

                break;
            }
            default:
                System.out.println("Plano inválido");
        }



    }

}
