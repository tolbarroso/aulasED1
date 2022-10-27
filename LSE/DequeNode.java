package lista3;

public class DequeNode<T> {
    private T info;
    private DequeNode<T> prox;
    
    public DequeNode (T valor) {
        this.info = valor;
    }
    public void setInfo (T valor) {
        this.info = valor;
    }
    public T getInfo() {
        return this.info;
    }
    public void setProx(DequeNode<T> novoProx) {
        this.prox = novoProx;
    }
    public DequeNode<T> getProx () {
        return this.prox;
    }
}