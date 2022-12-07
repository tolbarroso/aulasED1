package AV;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        CadastroProdutos estoque = new CadastroProdutos();
        int op;
        do {
            exibirOpcoes();
            op = in.nextInt();
            switch (op){
                case 1: estoque.cadastrarProduto();
                        break;
                case 2: estoque.exibirDadosProduto();
                        break;
                case 3: estoque.exibirTodosProdutos();
                        break;
                case 4: estoque.alterarPreco();
                        break;
                case 5: estoque.alterarQtdEstoque();
                        break;
                case 6: estoque.removerProduto();
                        break;
                case 0: System.out.println("PROGRAMA ENCERRADO");
                        break;
                default: System.out.println("OPÇÃO INVÁLIDA");
            } 
        } while (op != 0);
    }
    
    public static void exibirOpcoes () {
        System.out.println("OPÇÕES: ");
        System.out.println("1 - CADASTRAR UM PRODUTO");
        System.out.println("2 - EXIBIR DADOS DE UM PRODUTO");
        System.out.println("3 - EXIBIR DADOS DE TODOS OS PRODUTOS EM ESTOQUE");
        System.out.println("4 - ALTERAR PREÇO DO PRODUTO");
        System.out.println("5 - ALTERAR QUANTIDADE DE UM PRODUTO NO ESTOQUE");
        System.out.println("6 - REMOVER UM PRODUTO");
        System.out.println("0 - SAIR");
        System.out.println("INFORME UMA OPÇÃO: ");   
    }
}