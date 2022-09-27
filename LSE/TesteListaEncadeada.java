import java.util.Scanner;

public class TesteListaEncadeada {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                LSEAluno turma = new LSEAluno();
                int op;
                Aluno al;
                String nome, matr;
                double media;
                int faltas;

                do {
                        exibeMenu();
                        op = in.nextInt();
                        in.nextLine();
                        switch (op) {
                                case 1:
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turma.inserirAluno(al);
                                        break;
                                case 2:
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turma.inserirAlunoPorUltimo(al);
                                        break;
                                case 3:
                                        turma.exibir();
                                        break;
                                case 4: // método de busca para pegar os dados de um único aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turma.exibirEspecifico(al);
                                        break;
                                case 5: // get e set nova média de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        // al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        media = in.nextDouble();
                                        turma.inserirNovaMedia(nome, matr, media);
                                        break;
                                case 6: // get e set nova falta de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        faltas = in.nextInt();
                                        turma.inserirNovasFaltas(al, faltas);
                                        break;
                                case 7: // método de busca para achar um aluno e remover-lo

                                        turma.removerAlunoEspecifico();
                                        break;
                                case 0:
                                        System.out.println("Programa encerrado!");
                                        break;
                                default:
                                        System.out.println("Opção inválida");
                        }
                } while (op != 0);
        }

        public static void exibeMenu() {
                System.out.println("Opções:");
                System.out.println("1 - Inserir um novo aluno no início da turma");
                System.out.println("2 - Inserir um novo aluno no final da turma");
                System.out.println("3 - Exibir todos os alunos da turma");
                System.out.println("4 - Exibir dados de um único aluno da turma");
                System.out.println("5 - Alterar média de um aluno");
                System.out.println("6 - Alterar a quantidade de faltas de um aluno");
                System.out.println("7 - Remover um aluno da turma");
                System.out.println("0 - Sair do programa");
                System.out.print("Digite a opção desejada: ");
        }
}