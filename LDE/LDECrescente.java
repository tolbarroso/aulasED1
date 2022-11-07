package LDE;
//Lista Duplamente Encadeada Ordenada Em Ordem Crescente e Sem Repetições

public class LDECrescente<T extends Comparable<T>> {
    private LDENode<T> first;
    private LDENode<T> last;
    private int qtd;
    private int limit;

    public LDECrescente(int tam) {
        this.limit = tam;
    }

    public boolean isEmpty() { // Verifica se a lista tá vazia
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(T valor) { // Insere um novo nó na lista
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, previous;
        if (this.isEmpty() == true) { // Lista vazia?
            this.first = novo;
            this.last = novo;
            this.qtd++;
        } else if (valor.compareTo(this.first.getInfo()) < 0) { // Lista com um nó. Insere antes do primeiro
            novo.setProx(this.first);
            this.first.setAnt(novo);
            this.first = novo;
            this.qtd++;
        } else if (valor.compareTo(this.first.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else if (valor.compareTo(this.last.getInfo()) > 0) { // Lista com mais de um nó. Insere depois do último
            this.last.setProx(novo);
            novo.setAnt(this.last);
            this.last = novo;
            this.qtd++;
        } else if (valor.compareTo(this.last.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else { // Lista com mais de um nó. Insere no meio
            aux = this.first.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) { // Verifica repetição
                    System.out.println("Valor repetido. Inserção não efetuada.");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // Insere no meio da lista
                    previous = aux.getAnt();
                    previous.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(previous);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getProx();
                }

            }
        }
    }

    private LDENode<T> buscar(T valor) { // Busca o nó na lista
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.first;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void remover(T valor) { // Remove um valor específico
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> previous, next;
        if (retorno == null) {
            System.out.println("valor não encontrado!");
        } else if (this.qtd == 1) {
            this.first = null;
            this.last = null;
            this.qtd = 0;
        } else if (retorno == this.first) { // remove o primeiro
            this.first = this.first.getProx();
            this.first.setAnt(null);
            this.qtd--;
        } else if (retorno == this.last) { // remove o ultimo
            this.last = this.last.getAnt();
            this.last.setProx(null);
            this.qtd--;
        } else { // remove no "meio"
            previous = retorno.getAnt();
            next = retorno.getProx();
            previous.setProx(next);
            next.setAnt(previous);
            this.qtd--;
        }
    }

    public void exibirTodos() { // Exibe todos os valores da lista
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.first;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
        }
        System.out.println(" ");
    }
}