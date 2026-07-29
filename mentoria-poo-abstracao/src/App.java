public class App {
    public static void main(String[] args){
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua funcionario", "Complemento endereço funcionario", "Bairro funcionario");
        System.out.println("--------------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setSalario(1000.00);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);
        System.out.println("--------------------");

        OperadorCaixa operadorCaixa = new OperadorCaixa();
        operadorCaixa.setNome("Camila Operador");
        operadorCaixa.setDocumento("987.654.321-00");
        operadorCaixa.setSalario(2000.00);
        operadorCaixa.setEndereco(endereco);
        System.out.println(operadorCaixa);

        System.out.println("--------------------");

        Gerente gerente = new Gerente();
        gerente.setNome("CamilaGerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        System.out.println(gerente);




    }
}
