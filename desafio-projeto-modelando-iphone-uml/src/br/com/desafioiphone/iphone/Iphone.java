package br.com.desafioiphone.iphone;

import br.com.desafioiphone.funcionalidades.musica.ReprodutorMusical;
import br.com.desafioiphone.funcionalidades.navegador.NavegadorInternet;
import br.com.desafioiphone.funcionalidades.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Atributo para armazenar a música atual
    private String musicaAtual;

    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Reproduzindo música: " + musicaAtual + " pelo Iphone");
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Pausando música: " + musicaAtual + " pelo Iphone");
        } else {
            System.out.println("Nenhuma música em reprodução.");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica; // guarda na variável da classe
        System.out.println("Selecionando música: " + musica + " pelo Iphone");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url + " no Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do Safari no Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina da web no Iphone");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no Iphone");
    }

    public void atender() {
        System.out.println("Atendendo ligacao no Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

}
