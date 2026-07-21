import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // Tenta criar um objeto Double a partir da string "a1.75".

        valor = NumberFormat.getInstance().parse("a1.75"); // Usa a classe NumberFormat para tentar interpretar a string "a1.75" como número.

        System.out.println(valor);

    }
}