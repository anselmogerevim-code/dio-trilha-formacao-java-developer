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
        this.refNoEntradaPilha = null; // topo começa como null
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
        return refNoEntradaPilha; // devolve a referência do topo
    }

    // Método isEmpty: verifica se a pilha está vazia
    public boolean isEmpty() {
        // Retorna true se o topo for null, caso contrário false
        return refNoEntradaPilha == null ? true : false;
    }

    // Sobrescreve o método toString para imprimir a pilha de forma legível
    @Override
    public String toString() {
        // Cabeçalho da representação da pilha
        String stringRetorno = "----------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------------\n";

        // Começa a percorrer a pilha a partir do topo
        No noAuxiliar = refNoEntradaPilha;

        // Loop para percorrer todos os nós da pilha
        while (true) {
            if (noAuxiliar != null) {
                // Adiciona o nó atual à string de retorno
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                // Avança para o próximo nó
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                // Sai do loop quando não há mais nós
                break;
            }
        }

        // Rodapé da representação da pilha
        stringRetorno += "================\n";
        return stringRetorno; // retorna a string completa
    }
}
