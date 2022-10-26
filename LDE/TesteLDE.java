package LDE;

import java.util.Scanner;

public class TesteLDE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDE listaInt = new LDE(5);
        int op;
        int valor;

        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    valor = in.nextInt();
                    listaInt.inserirNoInicio(valor);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser inserido: ");
                    valor = in.nextInt();
                    listaInt.inserirNoFinal(valor);
                    break;
                case 3:
                    listaInt.exibirTodos();
                    break;
                case 4:
                    listaInt.exibirAoContrario();
                    break;
                case 0:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Insirir valor no início da lista");
        System.out.println("2 - Insirir valor no final da lista");
        System.out.println("3 - Exibir todos os valores da lista");
        System.out.println("4 - Exibir os valores da lista do último pro primeiro");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}