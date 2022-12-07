package AV;

public class Produto implements Comparable<Produto> {
    String codigo, descricao, fornecedor;
    double preco;
    int qtdEstoque;

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public Produto(String codigo, String descricao, String fornecedor, double preco, int qtdEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int compareTo(Produto data) {
        int retorno;
        retorno = this.getCodigo().compareToIgnoreCase(data.getCodigo());
        return retorno;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", fornecedor=" + fornecedor + ", preco="
                + preco + ", qtdEstoque=" + qtdEstoque + "]";
    }

}