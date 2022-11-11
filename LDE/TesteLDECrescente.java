package LDE;

import java.util.Scanner;

public class TesteLDECrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDECrescente lista = new LDECrescente(5);
        int op;
        int val;

        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    val = in.nextInt();
                    lista.inserirOrdenadoCrescenteComRepetidos(val);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser removido: ");
                    val = in.nextInt();
                    lista.inserirOrdenadoDecrescenteComRepetidos(val);
                    break;
                case 3:
                    lista.exibirTodos();
                    break;
                case 4:
                    System.out.println("Informe valor a ser buscado:");
                    val = in.nextInt();
                    lista.inserirOrdenadoDecrescenteSemRepetidos(val);
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
        System.out.println("1 - Insirir valor na lista");
        System.out.println("2 - Remover valor da lista");
        System.out.println("3 - Exibir todos os valores da lista");
        System.out.println("4 - Buscar um valor na lista");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}