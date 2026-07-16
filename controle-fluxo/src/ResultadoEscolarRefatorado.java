public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {
        int nota = 9;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 ? "Recuperação" : "Reprovado"; //Condição Ternária

        System.out.println(resultado);
    }

}