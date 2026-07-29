public class OperadorCaixa  extends FuncionarioCLT {

    public OperadorCaixa(String nome, String documento, Double ValorSalario, Endereco endereco) {
        super(nome, documento, ValorSalario, endereco);
    }

    



    public OperadorCaixa() {
    }

    public String toString() {
        return "OperadorCaixa [nome=" + nome + ", documento=" + documento + ", ValorSalario=" + ValorSalario + ", endereco="
                + endereco.getRua() + "]";
    }





}
