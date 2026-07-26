public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        //forma simplificada de imprimir os estados brasileiros
        for (EstadoBrasileiro estadoBrasileiro : EstadoBrasileiro.values()) {
            System.out.println(estadoBrasileiro.getNome() + " \nSigla: " + estadoBrasileiro.getSigla());
            System.out.println("Código IBGE: " + estadoBrasileiro.getCodigoIbge()+"\n");
        }
        EstadoBrasileiro estadoBrasileiro = EstadoBrasileiro.SAO_PAULO;
        System.out.println(estadoBrasileiro.getNome());
        System.out.println(estadoBrasileiro.getSigla());
        System.out.println(estadoBrasileiro.getCodigoIbge());

        System.out.println(estadoBrasileiro.getNomeMaiusculo());//maiusculo
        System.out.println(estadoBrasileiro.getCodigoIbge());
    }
}
