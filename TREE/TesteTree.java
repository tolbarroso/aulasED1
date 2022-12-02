import java.util.Scanner;

public class TesteTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroAlunos turmaED1 = new CadastroAlunos();
        int op;
        do {
            exibirOpcoes();
            op = in.nextInt();
            switch (op) {
                case 1:
                    turmaED1.cadastrarAluno();
                    break;
                case 2:
                    turmaED1.exibirDadosAluno();
                    break;
                case 3:
                    turmaED1.exibirAlunosTurma();
                    break;
                case 4:
                    turmaED1.alterarMediaAluno();
                    break;
                case 5:
                    turmaED1.excluirAluno();
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibirOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Exibir dados de um aluno");
        System.out.println("3 - Exibir todos os alunos da turma");
        System.out.println("4 - Alterar média do aluno");
        System.out.println("5 - Excluir aluno");
        System.out.println("0 - Sair");
        System.out.println("Informe a opção: ");
    }
}