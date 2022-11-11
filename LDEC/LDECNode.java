package LDEC;

public class LDECNode<T extends Comparable<T>> {
    private T info;
    private LDECNode<T> ant;
    private LDECNode<T> prox;

    public LDECNode(T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public LDECNode<T> getAnt() {
        return this.ant;
    }

    public void setAnt(LDECNode<T> novoAnt) {
        this.ant = novoAnt;
    }

    public LDECNode<T> getProx() {
        return this.prox;
    }

    public void setProx(LDECNode<T> novoProx) {
        this.prox = novoProx;
    }
}