package one.digitalinovation;

// Classe Fila
// Implementa uma estrutura de dados do tipo FILA (queue),
// utilizando nós encadeados (classe No).
public class Fila {

    // Referência para o último nó inserido na fila (entrada da fila).
    // Esse nó aponta para os anteriores, formando uma cadeia.
    private No refNoEntradaFila;

    // Construtor da fila.
    // Inicialmente, a fila está vazia, então a referência é nula.
    public Fila() {
        this.refNoEntradaFila = null;
    }

    // Método enqueue (inserir na fila).
    // Recebe um novo nó e o coloca na entrada da fila.
    public void enqueue(No novoNo) {
        // O novo nó aponta para o nó que já estava na entrada.
        novoNo.setRefNo(refNoEntradaFila);
        // Atualiza a referência da entrada para o novo nó.
        refNoEntradaFila = novoNo;
    }

    // Método first (primeiro da fila).
    // Retorna o nó que está na saída da fila (o mais antigo).
    public No first() {
        if (!this.isEmpty()) {
            // Começa pela entrada da fila.
            No primeiroNo = refNoEntradaFila;
            // Percorre até encontrar o último nó (aquele que não aponta para ninguém).
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            // Aqui deveria retornar o primeiro nó encontrado.
            // return primeiroNo;
        }
        // Se a fila estiver vazia, retorna null.
        return null;
    }

    // Método dequeue (remover da fila).
    // Remove e retorna o nó que está na saída da fila (o mais antigo).
    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; // percorre a fila
            No noAuxiliar = refNoEntradaFila; // guarda o nó anterior
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;          // atualiza o auxiliar
                    primeiroNo = primeiroNo.getRefNo(); // avança para o próximo
                } else {
                    // Quando chega ao último nó, desconecta ele da fila.
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            // Retorna o nó removido (o mais antigo).
            return primeiroNo;
        }
        // Se a fila estiver vazia, retorna null.
        return null;
    }

    // Método isEmpty (verifica se a fila está vazia).
    public boolean isEmpty() {
        // Se a referência da entrada for nula, a fila está vazia.
        return refNoEntradaFila == null ? true : false;
    }

    // Método toString (representação textual da fila).
    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while (true) {
                // Adiciona o conteúdo do nó atual à string.
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                // Avança para o próximo nó.
                noAuxiliar = noAuxiliar.getRefNo();
                // Se o próximo nó for o último (não aponta para ninguém), encerra.
                if (noAuxiliar.getRefNo() != null) {
                        noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            // Se a fila estiver vazia, retorna "null".
            stringRetorno = "null";
        }

        return stringRetorno;
    }

}
