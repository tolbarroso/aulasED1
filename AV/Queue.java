package AV;

public class Queue<T> {
    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    private int capacidade;
    private int qtd;

    public Queue(int capacidade) {
        this.capacidade = capacidade;
    }

    public Queue(){ }

    public boolean isEmpty() {
        if (this.inicio == null && this.qtd == 0 && this.fim == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.qtd == this.capacidade) {
            return true;
        }
        return false;
    }

    public void enQueue(T value) { // inserir valor no FINAL da fila
        QueueNode<T> atual = new QueueNode(value);
        if (this.qtd == 0) {
            this.inicio = atual;
            this.fim = atual;
            this.qtd++;
        } else {
            this.fim.setProx(atual);
            this.fim = atual;
            this.qtd++;
        }
    }

    public T deQueue() { // retirar o elemento do INÍCIO da fila
        QueueNode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.getProx();
            this.qtd--;
        }
        return aux.getInfo();
    }

    public T head() { // imprimi o elemento de cima da fila
        return this.inicio.getInfo();
    }
}
