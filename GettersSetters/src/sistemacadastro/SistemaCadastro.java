package sistemacadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        //Criamos uma pessoa no sitema
        Pessoa marcos = new Pessoa("Marcos", "12345678901");

        //Definimos o endereço de marcos
        marcos.setEndereco("Bernadino Miguel da Silva");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
