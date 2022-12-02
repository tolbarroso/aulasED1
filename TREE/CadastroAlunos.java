import java.util.Scanner;

public class CadastroAlunos {
    private BinaryTree<Aluno> turma;

    public CadastroAlunos() {
        turma = new BinaryTree();
    }

    public void cadastrarAluno() {
        Scanner in = new Scanner(System.in);
        Aluno al;
        String nome, matr;
        System.out.print("Informe o nome do aluno: ");
        nome = in.nextLine();
        System.out.print("Informe a matrícula do aluno: ");
        matr = in.nextLine();
        al = new Aluno(matr, nome);
        turma.insert(al);
    }

    public void excluirAluno(){
        Scanner in = new Scanner(System.in);
        Aluno al;
        String matr;
        System.out.print("Informe a matrícula do aluno: ");
        matr = in.nextLine();
        al = new Aluno(matr);
        turma.remove(al);
    }

    public void alterarMediaAluno() {
        Scanner in = new Scanner(System.in);
        Aluno al, retorno;
        String matr;
        double media;
        System.out.print("Informe a matrícula do aluno: ");
        matr = in.nextLine();
        al = new Aluno(matr);
        retorno = turma.buscar(al);
        if (retorno == null) {
            System.out.println("Aluno não cadastrado!");
        } else {
            System.out.println("Dados atuais do aluno");
            System.out.println(retorno);
            System.out.print("Informe a nova média do aluno: ");
            media = in.nextDouble();
            retorno.setMedia(media);
            System.out.println("Média alterada.");
            System.out.println("Dados após a alteração");
            System.out.println(retorno);
        }
    }

    public void exibirDadosAluno() {
        Scanner in = new Scanner(System.in);
        Aluno al, retorno;
        String matr;
        System.out.print("Informe a matrícula do aluno: ");
        matr = in.nextLine();
        al = new Aluno(matr);
        retorno = turma.buscar(al);
        if (retorno == null) {
            System.out.println("Aluno não cadastrado!");
        } else {
            System.out.println("Dados do aluno");
            System.out.println(retorno);
        }
    }

    public void exibirAlunosTurma() {
        if (this.turma.isEmpty() == true) {
            System.out.println("Não existem alunos cadastrados");
        } else {
            this.turma.emOrdem();
        }
    }
}