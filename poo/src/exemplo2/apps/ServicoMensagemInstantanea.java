package exemplo2.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    // Mais um método que todos os filhos deverão implementar
    public abstract void salvarHistoricoMensagem();

    // Somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Verificando conexão com a internet");
    }



}
