public class LSENode {
    // Atributos
    private Aluno info;
    private LSENode prox;

    // Construtor      
    public LSENode (Aluno valor) {
        this.info = valor;
    }     

    // Métodos GET e SET
    public void setInfo (Aluno valor) {
        this.info = valor;
    }

    public void setProx (LSENode novoProx) {
        this.prox = novoProx;
    }

    public Aluno getInfo() {
        return this.info;
    }
    
    public LSENode getProx() {
        return this.prox;
    }
}