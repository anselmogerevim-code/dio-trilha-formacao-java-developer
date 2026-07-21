public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("16025322");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido!"); // Exceção tratada

            // e.printStackTrace(); // Imprime a pilha de chamadas
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException {

        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
            //return "18.154.344"; // Simulando um cep formatado

        // Formata o CEP no padrão XXXXX-XXX
        String parte1 = cep.substring(0, 5); // primeiros 5 dígitos
        String parte2 = cep.substring(5);    // últimos 3 dígitos
        return parte1 + "-" + parte2;
    }
}

