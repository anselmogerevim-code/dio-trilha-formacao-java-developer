package one.digitalinovation;
// Declaração da classe No
// Essa classe representa um "nó" que pode ser usado em estruturas de dados,
// como listas encadeadas, pilhas ou filas.
public class No {

    // Atributo que guarda o conteúdo do nó.
    // Pode ser qualquer tipo de objeto, já que está declarado como Object.
    private Object object;

    // Referência para outro nó (o próximo nó na estrutura).
    // Isso permite criar ligações entre vários nós.
    private No refNo;

    // Construtor padrão (sem parâmetros).
    // Cria um nó vazio, sem objeto e sem referência.
    public No() {

    }

    // Construtor que recebe um objeto como parâmetro.
    // Inicializa o nó com esse objeto e define a referência como nula.
    public No(Object object) {
        this.object = object;   // Armazena o objeto passado
        this.refNo = null;      // Inicialmente não aponta para nenhum outro nó
    }

    // Método getter para acessar o objeto armazenado no nó.
    public Object getObject() {
        return object;
    }

    // Método setter para alterar o objeto armazenado no nó.
    public void setObject(Object object) {
        this.object = object;
    }

    // Método getter para acessar o próximo nó (referência).
    public No getRefNo() {
        return refNo;
    }

    // Método setter para alterar a referência para outro nó.
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    // Sobrescrita do método toString().
    // Retorna uma representação textual do nó, mostrando apenas o objeto armazenado.
    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }

}
