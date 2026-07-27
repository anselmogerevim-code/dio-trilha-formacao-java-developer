package exemplo3.equipamentos.multifuncional;

import exemplo3.equipamentos.copiadora.Copiadora;
import exemplo3.equipamentos.digitalizadora.Digitalizadora;
import exemplo3.equipamentos.impresssora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}
