package LDE;

public class LDE<T extends Comparable<T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;
    private int limite;

    public LDE(int tam) {
        this.limite = tam;
    }

    public boolean isEmpty() {
        if (this.qtd == 0 && this.primeiro == null && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T valor) { //Insere um novo nó no início da lista
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        }
    }

    public void inserirNoFinal(T valor) { //Insere um novo nó no final da lista
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        }
    }

    public void exibirTodos() { //Exibe todos os nós da lista em ordem normal
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
        }
        System.out.println(" ");
    }

    public void exibirAoContrario(){ //Exibe todos os nós do último pro primeiro
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.ultimo;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getAnt();
            }
        }
        System.out.println(" ");
    }

    public void removerNoInicio(){ //Remove o primeiro nó da lista
        if(this.isEmpty() == true){
            System.out.println("Lista Vazia!");
        } else if (this.qtd == 1) { // ou (this.primeiro == this.ultimo) ou (this.primeiro.equals(this.ultimo))
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else {
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            this.qtd--;
        }
    }

    public void removerNoFinal(){ //Remove o último nó da lista
        if(this.isEmpty() == true){
            System.out.println("Lista Vazia!");
        } else if (this.qtd == 1) { // ou (this.primeiro == this.ultimo) ou (this.primeiro.equals(this.ultimo))
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProx(null);
            this.qtd--;
        }
    }
}