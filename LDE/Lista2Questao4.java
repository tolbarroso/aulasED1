package LDE;
/* Considere uma lista duplamente encadeada. Implemente um método de inserção 
ordenada, em ordem decrescente, que aceita valores repetidos. Este método de inserção 
deve receber, como parâmetro, o valor a ser inserido. Se os valores a serem inseridos 
já existirem na lista (ou seja, se forem repetidos), eles devem ser inseridos DEPOIS 
de todos os valores que são iguais a eles. */

import java.util.Scanner;

public class Lista2Questao4<T extends Comparable<T>> {
    // lista decrescente
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
        LDENode<T> aux, proximo;
        if (this.isEmpty() == true) { // Lista vazia?
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
        } else if (valor.compareTo(this.prim.getInfo()) < 0) { // Lista com um nó. Insere antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ult.getInfo()) > 0) { // Lista com mais de um nó. Insere depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
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

}