package AV;

import java.util.Scanner;

public class CadastroProdutos {
    private BinaryTree<Produto> portfolio;
    
    public CadastroProdutos(){
        portfolio = new BinaryTree<>();
    }

    public void cadastrarProduto(){
        Scanner in = new Scanner (System.in);
        Produto prod;
        String codigo, descricao, fornecedor;
        double preco;
        int qtdEstoque;
        System.out.print("Informe o código do produto: ");
        codigo = in.nextLine();
        System.out.print("Informe a descrição do produto: ");
        descricao = in.nextLine();
        System.out.print("Informe o fornecedor do produto: ");
        fornecedor = in.nextLine();    
        System.out.print("Informe o preço do produto: ");
        preco = in.nextDouble();
        System.out.print("Informe a quantidade em estoque do produto: ");
        qtdEstoque = in.nextInt();
        prod = new Produto(codigo, descricao, fornecedor, preco, qtdEstoque);
        portfolio.insert(prod);
    }

    public void alterarQtdEstoque(){
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        int qtdEstoque;

        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = portfolio.find(prod);

        if(retorno == null){
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("Dados atuais do produtos: ");
            System.out.println(retorno);
            System.out.println("Informe a nova quantidade do produto no estoque: ");
            qtdEstoque = in.nextInt();
            retorno.setQtdEstoque(qtdEstoque);
            System.out.println("Quantidade alterada.");
            System.out.println("Dados após a alteração: ");
            System.out.println(retorno);

        }
    }

    public void alterarPreco(){
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        double preco;

        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = portfolio.find(prod);

        if(retorno == null){
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("Dados atuais do produtos: ");
            System.out.println(retorno);
            System.out.println("Informe o novo preço do produto: ");
            preco = in.nextDouble();
            retorno.setPreco(preco);
            System.out.println("Quantidade alterada.");
            System.out.println("Dados após a alteração: ");
            System.out.println(retorno);
        }        
    }

    public void exibirDadosProduto(){
        Scanner in = new Scanner (System.in);
        Produto prod, retorno;
        String codigo;        
        System.out.print("Informe o código do produto: ");
        codigo = in.nextLine(); 
        prod = new Produto(codigo);
        retorno = portfolio.find(prod);
        if (retorno == null) {
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("Dados do produto: ");
            System.out.println(retorno);
        }
    }

    public void exibirTodosProdutos() {
        if (this.portfolio.isEmpty() == true) {
            System.out.println("Não existem produtos cadastrados");
        } else {
            this.portfolio.emOrdem();
        }
    }

    public void removerProduto(){
        Scanner in = new Scanner (System.in);
        Produto prod, retorno;
        String codigo;
        System.out.print("Informe o código do produto: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = portfolio.find(prod);

        if(retorno == null){
            System.out.println("Produto não encontrado!");
        } else {
            portfolio.remove(retorno);
            System.out.println("Remoção efetuada!");
        }        
    }
}