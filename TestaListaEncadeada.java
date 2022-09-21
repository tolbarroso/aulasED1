import java.util.Scanner;

public class TestaListaEncadeada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSEAluno turma = new LSEAluno();
        int op;
        Aluno al;
        String nome, matr;
        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAluno(al);
                    break;
                case 2:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAlunoFinal(al);
                    break;
                case 3:
                    turma.exibir();
                    break;
                case 4:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.exibirAluno(matr);
                    break;
                case 5:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarMedia(matr);
                    break;
                case 6:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarFalta(matr);
                    break;
                case 7:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                    break;
                case 8:
                    turma.criarCopia();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar novo aluno no início da lista");
        System.out.println("2 - Cadastrar novo aluno no final da lista");
        System.out.println("3 - Exibir todos os alunos da turma");
        System.out.println("4 - Exibir os dados de um aluno");
        System.out.println("5 - Alterar a média de um aluno");
        System.out.println("6 - Alterar a quantidade de faltas de um aluno");
        System.out.println("7 - Remover um aluno");
        System.out.println("8 - Criar cópia da lista da turma");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}