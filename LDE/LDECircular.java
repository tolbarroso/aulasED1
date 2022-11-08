package LDE;

public class LDECircular <T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio (T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
    }

    public void inserirNoFinal (T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            novo.setAnt(this.ult);
            this.ult.setProx(novo);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
    }

    public void inserirOrdenadoDecrescente(T valor) { // Insere um novo nó na lista
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, proximo;
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
                    proximo = aux.getProx();
                    proximo.setAnt(novo);
                    novo.setAnt(aux);
                    novo.setProx(proximo);
                    this.qtd++;
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // Insere no meio da lista
                    proximo = aux.getProx();
                    proximo.setAnt(novo);
                    aux.setProx(novo);
                    novo.setAnt(aux);
                    novo.setProx(proximo);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getAnt();
                }
            }
        }
    }
    
    public void exibirTodos() {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.prim;
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.prim);
        }
        System.out.println(" ");
    }

    public void exibirInverso(){
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.ult;
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getAnt();
            } while (aux != this.ult);
        }
        System.out.println(" ");
    }

    public LDENode<T> buscar(T valor) { // busca simples
        LDENode<T> aux = this.prim;
        if (this.isEmpty() == true) {
            return null;
        }
        if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        }
        for (int i = 0; i < this.qtd; i++) {
            if (valor.compareTo(aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void removerPrimeiro(T valor) { // remover o primeiro da lista
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else {
            this.prim = this.prim.getProx();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
    }

    public void removerUltimo(T valor) { // remover o último valor da lista
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else {
            this.ult = this.ult.getAnt();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
    }

    public void remover(T valor) { // Remove um valor específico
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> anterior, proximo;
        if (retorno == null) {
            System.out.println("valor não encontrado!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else if (retorno == this.prim) { // remove o primeiro
            this.prim = this.prim.getProx();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (retorno == this.ult) { // remove o ultimo
            this.ult = this.ult.getAnt();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else { // remove no "meio"
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProx(proximo);
            proximo.setAnt(anterior);
            this.qtd--;
        }
    }

    public void remover2(){
        LDENode<T> anterior, proximo;
        LDENode<T> aux;
        

        else { // lista com mais de um nó
            aux = this.buscar(valor);
            if (aux != null) {
                anterior = aux.getAnt();
                proximo = aux.getProx();
                anterior.setProx(proximo);
                proximo.setAnt(anterior);
                this.qtd--;
                if (aux == this.prim) {
                    this.prim = proximo;
                } else if (aux == this.ult) {
                    this.ult = anterior;
                }
            } else {

            }
        }
    }
}