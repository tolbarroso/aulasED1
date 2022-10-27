package lista3;

public class StackNode<T> {
    private T info;
    private StackNode<T> prox;
    
    public StackNode (T valor) {
        this.info = valor;
    }
    public void setInfo (T valor) {
        this.info = valor;
    }
    public T getInfo() {
        return this.info;
    }
    public void setProx(StackNode<T> novoProx) {
        this.prox = novoProx;
    }
    public StackNode<T> getProx () {
        return this.prox;
    }    
}