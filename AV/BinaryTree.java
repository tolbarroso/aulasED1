package AV;

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode<T> raiz;

    public void insertNode(T valor) {
        TreeNode<T> aux, novo;
        novo = new TreeNode(valor);
        if (this.isEmpty() == true) {
            this.raiz = novo;
            System.out.println("Inserção efetuada");
        } else {
            aux = this.raiz;
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // inserção do lado esquerdo
                    if (aux.getLeft() != null) {
                        aux = aux.getLeft();
                    } else { // inserir
                        aux.setLeft(novo);
                        System.out.println("Inserção efetuada");
                        break;
                    }
                } else { // inserção do lado direito
                    if (aux.getRight() != null) {
                        aux = aux.getRight();
                    } else { // inserir
                        aux.setRight(novo);
                        System.out.println("Inserção efetuada");
                        break;
                    }
                }
            }
        }
    }

    public TreeNode<T> removeNode(TreeNode<T> r, T value) {
        if (r != null) {
            if (value.compareTo(r.getInfo()) == 0) {
                TreeNode<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) { // Não tem filhos
                    r = null;
                } else if (r.getLeft() == null) { // Não tem filho a esquerda
                    r = r.getRight();
                } else if (r.getRight() == null) { // Não tem filho a direita
                    r = r.getLeft();
                } else { // Tem ambos os filhos
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null) {
                        pai = filho;
                        filho = filho.getRight();
                    }
                    pai.setRight(filho.getLeft());
                    r.setInfo(filho.getInfo());
                }
            } else if (value.compareTo(r.getInfo()) < 0) {
                r.setLeft(removeNode(r.getLeft(), value));
            } else {
                r.setRight(removeNode(r.getRight(), value));
            }
        }
        return r;
    }

    public T buscar(T valor) {
        TreeNode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.raiz;
            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo(); // Achou!!!
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            }
            return null; // Não achou!!!
        }
    }

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            this.raiz = new TreeNode(value);
        } else {
            this.raiz.insertNode(value);
        }
    }

    public void remove(T value) {
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            this.raiz = this.removeNode(this.raiz, value);
        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    public void passeioPorNivel() {
        Queue<TreeNode<T>> fila;
        TreeNode<T> aux;
        if (this.isEmpty() == false) {
            fila = new Queue();
            fila.enQueue(raiz);
            while (fila.isEmpty() == false) {
                aux = fila.deQueue();
                if (aux.getLeft() != null) {
                    fila.enQueue(aux.getLeft());
                }
                if (aux.getRight() != null) {
                    fila.enQueue(aux.getRight());
                }
                System.out.println(aux.getInfo());
            }
        }
    }
}