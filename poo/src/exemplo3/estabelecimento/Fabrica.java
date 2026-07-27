package exemplo3.estabelecimento;
import exemplo3.equipamentos.copiadora.Copiadora;
import exemplo3.equipamentos.digitalizadora.Digitalizadora;
import exemplo3.equipamentos.digitalizadora.Scanner;
import exemplo3.equipamentos.impresssora.Deskjet;
import exemplo3.equipamentos.impresssora.Impressora;
import exemplo3.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }

}
