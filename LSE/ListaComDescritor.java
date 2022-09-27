import java.util.Scanner;

public class ListaComDescritor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSEComDescritor<Aluno> turma = new LSEComDescritor();
        int op;
        Aluno al;
        String nome, matr;
        
        do {
            exibirOpcoes();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirOrdenado(al);
                    break;
                case 2:
                    turma.exibirTodos();
                    break;
                case 3:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    al = new Aluno(matr);
                    turma.remover(al);
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void exibirOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Exibir alunos cadastrados");
        System.out.println("3 - Remover aluno");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}