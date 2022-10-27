package lista3;

/* Deque é um tipo abstrato de dados (TAD) no qual as seguintes operações são
permitidas:
(a) Push (A): Insere o elemento A no início da Deque.
(b) Pop (): Remove e retorna o elemento que está no início da Deque.
(c) Inject(A): Insere o elemento A no final da Deque.
(d) Eject(): Remove e retorna o elemento que está no final da Deque.
(e) isEmpty(): Testa se a Deque está vazia.
(f) isFull ():Testa se a Deque está cheia.
Escolha a estrutura de dados que julgar mais adequada para representar um TAD Deque onde é
possível armazenar uma quantidade ilimitada de elementos. Implemente um Deque genérico com
todas as operações que o caracterizam. */

public class Deque<T> {

    private DequeNode<T> topo;
    private DequeNode<T> ultimo;
    private int capacidade;
    private int qtd;

    public Deque(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public void push(T valor) {  // inserir no início
        DequeNode atual = new DequeNode(valor);
        if (this.isEmpty()) {
            this.topo = atual;
            this.ultimo = atual;
            this.qtd++;
        } else {
            atual.setProx(this.topo);
            this.topo = atual;
            this.qtd++;
        }
    }

    public T pop() { // retira e imprime o primeiro
        DequeNode<T> aux = this.topo;
        this.topo = this.topo.getProx();
        this.qtd--;
        return aux.getInfo();
    }

    public void inject(T valor) { // inserir no final
        DequeNode atual = new DequeNode(valor);
        if (this.isEmpty()) {
            this.topo = atual;
            this.ultimo = atual;
            this.qtd++;
        } else {
            this.ultimo.setProx(atual);
            this.ultimo = atual;
            this.qtd++;
        }
    }

    public T eject() { // retira e imprime o ultimo
        T info = this.ultimo.getInfo();
        if (this.topo.getProx() == null) {
            return info;
        } 
        DequeNode<T> aux = this.topo;
        while (aux.getProx() != this.ultimo) {
            aux = aux.getProx();
        }
        aux.setProx(null);
        this.ultimo = aux;
        return info;
    }

    public boolean isEmpty() { // se o deque tá vazia
        if (this.topo == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // se o deque tá cheia
        if (this.qtd == this.capacidade) {
            return true;
        }
        return false;
    }
}
