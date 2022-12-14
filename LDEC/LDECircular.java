package LDEC;

public class LDECircular<T extends Comparable<T>> {
    private LDECNode<T> prim;
    private LDECNode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T valor) {
        LDECNode<T> novo = new LDECNode(valor);
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

    public void inserirNoFinal(T valor) {
        LDECNode<T> novo = new LDECNode(valor);
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

    public void exibirTodos() {
        LDECNode<T> aux;
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

    public void exibirInverso() {
        LDECNode<T> aux;
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

    public LDECNode<T> buscar(T valor) { // busca simples
        LDECNode<T> aux = this.prim;
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

    public void removerUltimo(T valor) { // remover o ??ltimo valor da lista
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

    public void remover (T valor) { // Remove um valor espec??fico
        LDECNode<T> retorno = this.buscar(valor);
        LDECNode<T> anterior, proximo;
        if (retorno == null) {
            System.out.println("valor n??o encontrado!");
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

    public void remover2 (T valor) {
        LDECNode<T> aux, anterior, proximo;
        if (this.isEmpty() == true) { // Caso 1: lista vazia!
            System.out.println("Lista vazia");
        } else if (this.qtd == 1) { // Caso 2: lista com apenas um n??
            if (valor.compareTo(this.prim.getInfo()) == 0) {
                this.prim = null;
                this.ult = null;
                this.qtd--;
            } else {
                System.out.println("Valor n??o encontrado");
            }
        } else { // Caso 3: caso geral (lista com mais de um n??)
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
                System.out.println("Valor n??o encontrado");
            }
        }
    }
}