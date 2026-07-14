public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void mudarCanal() {

    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + (volume + 1));
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume para: " + (volume - 1));
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
