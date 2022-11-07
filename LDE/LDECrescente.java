package LDE;
//Lista Duplamente Encadeada Ordenada Em Ordem Crescente e Sem Repetições

public class LDECrescente<T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
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
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) { // Lista vazia?
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
        } else if (valor.compareTo(this.prim.getInfo()) < 0) { // Lista com um nó. Insere antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
        } else if (valor.compareTo(this.prim.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else if (valor.compareTo(this.ult.getInfo()) > 0) { // Lista com mais de um nó. Insere depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ult.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else { // Lista com mais de um nó. Insere no meio
            aux = this.prim.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) { // Verifica repetição
                    System.out.println("Valor repetido. Inserção não efetuada.");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // Insere no meio da lista
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
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
            aux = this.prim;
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
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else if (retorno == this.prim) { // remove o primeiro
            this.prim = this.prim.getProx();
            this.prim.setAnt(null);
            this.qtd--;
        } else if (retorno == this.ult) { // remove o ultimo
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
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
            aux = this.prim;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
        }
        System.out.println(" ");
    }
}