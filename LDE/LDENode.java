package LDE;

public class LDENode<T extends Comparable<T>> {
    private T info;
    private LDENode<T> ant;
    private LDENode<T> prox;

    public LDENode(T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public LDENode<T> getAnt() {
        return this.ant;
    }

    public void setAnt(LDENode<T> novoAnt) {
        this.ant = novoAnt;
    }

    public LDENode<T> getProx() {
        return this.prox;
    }

    public void setProx(LDENode<T> novoProx) {
        this.prox = novoProx;
    }
}