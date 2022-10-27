package lista3;

public class Stack<T> {

    private StackNode<T> topo;

    public boolean isEmpty() {
        if (this.topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T valor) {  // inserir no início (topo)
        StackNode novo = new StackNode(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public boolean isFull() {
        return false;
    }

    public T pop() {
        StackNode<T> aux = this.topo;
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }

    public T top() {
        return this.topo.getInfo();
    }
}