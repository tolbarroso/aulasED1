package LDE;

public class LDEDecrescente <T extends Comparable<T>> {
    // lista circular com ordenação decrescente
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() { // Verifica se a lista tá vazia
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirDecrescente(T valor) { // Insere um novo nó na lista
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) { // Lista vazia?
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.prim.getInfo()) > 0) { // Lista com um nó. Insere antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.ult.getInfo()) < 0) { // Lista com mais de um nó. Insere depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else { // Lista com mais de um nó. Insere no meio
            aux = this.prim.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) { // Verifica repetição. Insere apos a repetição
                    anterior = aux.getProx();
                    anterior.setAnt(novo);
                    novo.setAnt(aux);
                    novo.setProx(anterior);
                    this.qtd++;
                    break;
                } else if (valor.compareTo(aux.getInfo()) > 0) { // Insere no meio da lista
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setProx(novo);
                    novo.setAnt(aux);
                    novo.setProx(anterior);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getAnt();
                }
            }
        }
    }
}