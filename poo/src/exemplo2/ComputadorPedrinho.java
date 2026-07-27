package exemplo2;

import exemplo2.apps.FacebookMessenger;
import exemplo2.apps.MSNMessenger;
import exemplo2.apps.ServicoMensagemInstantanea;
import exemplo2.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido = "tlg";
        if(appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();


    }


}
