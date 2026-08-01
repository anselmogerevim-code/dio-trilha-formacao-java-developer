// Define o pacote onde as classes estão organizadas
package one.digitalinovation;

// Classe que representa a estrutura de dados Pilha
public class Pilha {

    // Referência para o nó que está no topo da pilha
    // Se for null, significa que a pilha está vazia
    private No refNoEntradaPilha = null;

    // Construtor da pilha
    // Inicializa a pilha como vazia
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Método push: insere um novo nó no topo da pilha
    public void push (No novoNo) {
        // Guarda o nó que atualmente está no topo
        No refAuxiliar = refNoEntradaPilha;
        // Atualiza o topo para o novo nó
        refNoEntradaPilha = novoNo;
        // Faz o novo nó apontar para o antigo topo
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    // Método pop: remove e retorna o nó do topo da pilha
    public No pop(){
        // Só remove se a pilha não estiver vazia
        if (!this.isEmpty()) {
            // Guarda o nó que será removido
            No noPoped = refNoEntradaPilha;
            // Atualiza o topo para o próximo nó
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            // Retorna o nó removido
            return noPoped;
        }
        // Se a pilha estiver vazia, retorna null
        return null;
    }

    // Método top: retorna o nó do topo sem removê-lo
    public No top() {
        return refNoEntradaPilha;
    }

    // Método isEmpty: verifica se a pilha está vazia
    public boolean isEmpty() {
        // Retorna true se o topo for null, caso contrário false
        return refNoEntradaPilha == null ? true : false;
    }
}
