package br.com.desafioiphone.funcionalidades.musica;

public class Ipod implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
        System.out.println("Reproduzindo: " + musicaAtual);
        } else {
        System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionada música: " + musica);
    }

}
