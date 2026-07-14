public class Usuario {
    public static void main(String[] args) {

        SmartTv smarTv = new SmartTv();

        System.out.println("A TV está ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();

        System.out.println("Novo volume: " + smarTv.volume);
        
        System.out.println("Canal atual: " + smarTv.canal);

        smarTv.mudarCanal(13);
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();

        smarTv.ligar();
        System.out.println("Novo Status -> TV está ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> TV está ligada? " + smarTv.ligada);

    }

}
