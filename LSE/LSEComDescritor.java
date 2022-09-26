public class LSEComDescritor<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;
    
    public boolean isEmpty(){
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Inserir ordenado em ordem crescente e sem repetidos
    // Este código está inserindo repetidos
    // O que devemos fazer para que não sejam inserido valores repetidos????
    public void inserirOrdenado (T valor) {
        LSENode novo = new LSENode(valor);
        LSENode anterior = null, atual;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.primeiro.getInfo()) < 0) { // inserção no início
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.ultimo.getInfo()) > 0) { // inserção no final
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        }
        else { // inserção no "meio" da lsta
           atual = this.primeiro;
           while (atual != null) {
               if (atual.getInfo().compareTo(valor) > 0) { // inserir
                   anterior.setProx(novo);
                   novo.setProx(atual);
                   this.qtd++;
                   return;
               }
               else {
                   anterior = atual;
                   atual = atual.getProx();
               }
           }           
        }       
    }
    
    public void exibirTodos () {
        LSENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }       
    } 
    public void removerPrimeiro() {
        LSENode<T> aux;
        if(this.isEmpty() == true){
            System.out.println("Lista Vazia!");
        } else {
            aux = this.primeiro;
            this.primeiro = aux.getProx(); //ou this.primeiro = this.primeiro.getProx();
            this.qtd--;
        }
    }  
}