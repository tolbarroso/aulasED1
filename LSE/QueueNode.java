package lista3;

public class QueueNode<T> {
    private T info;
    private QueueNode<T> prox;
    
    public QueueNode (T valor) {
        this.info = valor;
    }
    public void setInfo (T valor) {
        this.info = valor;
    }
    public T getInfo() {
        return this.info;
    }
    public void setProx(QueueNode<T> novoProx) {
        this.prox = novoProx;
    }
    public QueueNode<T> getProx () {
        return this.prox;
    }
}