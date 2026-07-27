// Classe Cliente
// Representa uma pessoa que é titular de uma ou mais contas no banco.
// É uma classe simples, usada apenas para armazenar informações do cliente.
public class Cliente {
    
    // Atributo que guarda o nome do cliente
    private String nome;

    // Getter para o nome
    // Permite acessar o nome do cliente fora da classe.
    // Exemplo: cliente.getNome();
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    // Permite definir ou alterar o nome do cliente fora da classe.
    // Exemplo: cliente.setNome("Maria");
    public void setNome(String nome) {
        this.nome = nome;
    }
}
