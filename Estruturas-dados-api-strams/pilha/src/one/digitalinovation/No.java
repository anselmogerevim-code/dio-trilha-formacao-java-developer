// Define o pacote da classe No
package one.digitalinovation;

// Classe que representa um nó da pilha
public class No {

    // Valor armazenado no nó
    private int dado;
    // Referência para o próximo nó (encadeamento)
    private No refNo = null;

    // Construtor vazio: permite criar um nó sem valor inicial
    public No() {
    }

    // Construtor que inicializa o nó com um valor
    public No(int dado) {
        this.dado = dado;
    }

    // Getter para acessar o valor armazenado
    public int getDado() {
        return dado;
    }

    // Setter para modificar o valor armazenado
    public void setDado(int dado) {
        this.dado = dado;
    }

    // Getter para acessar o próximo nó
    public No getRefNo() {
        return refNo;
    }

    // Setter para definir o próximo nó
    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    // Sobrescreve o método toString para imprimir o nó de forma legível
    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }
}
