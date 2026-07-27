package br.com.desafioiphone.testeusuarioiphone;

import br.com.desafioiphone.iphone.Iphone;

public class UsuarioiPhone {
    public static void main(String[] args) {
    Iphone meuIphone = new Iphone();

    // Testando função Ipod
    System.out.println("\n====== Testando a função Ipod do Iphone ======");
    meuIphone.selecionarMusica("Imagine - John Lennon");
    meuIphone.tocar();
    meuIphone.pausar();
    meuIphone.selecionarMusica("One - Metallica");
    meuIphone.tocar();

    // Testando navegador
    System.out.println("\n====== Testando a função Navegador do Iphone ======");
    meuIphone.exibirPagina("https://www.google.com.br");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();

    // Testando telefone
    System.out.println("\n====== Testando a função Telefone do Iphone ======");
    meuIphone.ligar("123456789");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    }
}
