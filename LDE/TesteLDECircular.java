package LDE;

import java.util.Scanner;

public class TesteLDECircular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDECircular lista = new LDECircular();
        int op;
        int val;

        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1: // inserir primeiro
                    System.out.print("Informe o valor a ser inserido: ");
                    val = in.nextInt();
                    lista.inserirNoInicio(val);
                    break;
                case 2: // inserir último
                    System.out.print("Informe o valor a ser inserido: ");
                    val = in.nextInt();
                    lista.inserirNoFinal(val);
                    break;
                case 3: // exibir todos
                    lista.exibirTodos();
                    break;
                case 4: // exibir inverso
                    lista.exibirInverso();
                    break;
                case 5: // remover valor especíico
                    lista.exibirTodos();
                    System.out.print("Informe o valor a ser removido: ");
                    val = in.nextInt();
                    lista.remover(val);
                    break;
                case 6: // remover primeiro
                    System.out.print("Informe o valor a ser inserido: ");
                    val = in.nextInt();
                    lista.removerPrimeiro(val);
                    break;
                case 7: // remover último
                    System.out.print("Informe o valor a ser inserido: ");
                    val = in.nextInt();
                    lista.removerUltimo(val);
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
        System.out.println("1 - Inserir valor no início");
        System.out.println("2 - Inserir valor no final");
        System.out.println("3 - Exibir todos os valores");
        System.out.println("4 - Exibir todos os valores inversamente");
        System.out.println("5 - Remover valor específico da lista");
        System.out.println("6 - Remover o primeiro valor");
        System.out.println("7 - Remover o último valor");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}