import java.util.Scanner;

public class TesteListaEncadeada {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                LSEAluno turmaM = new LSEAluno();
                LSEAluno turmaP = new LSEAluno();
                // LSEAluno turmaUniao = new LSEAluno();
                LSEAluno outra;
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
                                case 1: // cadastrar aluno no início
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaM.inserirAluno(al);
                                        // turmaUniao.inserirAlunoPorUltimo(al);
                                        break;
                                case 2: // cadastrar aluno no final
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaM.inserirAlunoPorUltimo(al);
                                        // turmaUniao.inserirAlunoPorUltimo(al);
                                        break;
                                case 3:
                                        turmaM.exibir();
                                        break;
                                case 4: // método de busca para pegar os dados de um único aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaM.exibirEspecifico(al);
                                        break;
                                case 5: // get e set nova média de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        // al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        media = in.nextDouble();
                                        turmaM.inserirNovaMedia(nome, matr, media);
                                        break;
                                case 6: // get e set nova falta de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        faltas = in.nextInt();
                                        turmaM.inserirNovasFaltas(al, faltas);
                                        break;
                                case 7: // método de busca para achar um aluno e remover-lo
                                        System.out.println("Insira a matrícula do aluno a ser removido: ");
                                        matr = in.nextLine();
                                        turmaM.removerAlunoEspecifico(matr);
                                        break;
                                case 8: // cadastrar aluno no início
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaP.inserirAluno(al);
                                        // turmaUniao.inserirAlunoPorUltimo(al);
                                        break;
                                case 9: // cadastrar aluno no final
                                        System.out.print("Informe o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.print("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaP.inserirAlunoPorUltimo(al);
                                        // turmaUniao.inserirAlunoPorUltimo(al);
                                        break;
                                case 10:
                                        turmaP.exibir();
                                        break;
                                case 11: // método de busca para pegar os dados de um único aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        turmaP.exibirEspecifico(al);
                                        break;
                                case 12: // get e set nova média de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        // al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        media = in.nextDouble();
                                        turmaP.inserirNovaMedia(nome, matr, media);
                                        break;
                                case 13: // get e set nova falta de um aluno
                                        System.out.println("Insira o nome do aluno: ");
                                        nome = in.nextLine();
                                        System.out.println("Informe a matrícula do aluno: ");
                                        matr = in.nextLine();
                                        al = new Aluno(matr, nome);
                                        System.out.println("Insira a nova média do aluno: ");
                                        faltas = in.nextInt();
                                        turmaP.inserirNovasFaltas(al, faltas);
                                        break;
                                case 14: // método de busca para achar um aluno e remover-lo
                                        System.out.println("Insira a matrícula do aluno a ser removido: ");
                                        matr = in.nextLine();
                                        turmaP.removerAlunoEspecifico(matr);
                                        break;
                                case 15: // método para unir duas listas
                                         // turmaUniao.exibir();
                                        outra.criarUniao(turmaM, turmaP);

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
                System.out.println("1 - Inserir um novo aluno no início da turma de Matemática");
                System.out.println("2 - Inserir um novo aluno no final da turma de Matemática");
                System.out.println("3 - Exibir todos os alunos da turma de Matemática");
                System.out.println("4 - Exibir dados de um único aluno da turma de Matemática");
                System.out.println("5 - Alterar média de um aluno de Matemática");
                System.out.println("6 - Alterar a quantidade de faltas de um aluno de Matemática");
                System.out.println("7 - Remover um aluno da turma de Matemática");
                System.out.println("8 - Inserir um novo aluno no início da turma de Português");
                System.out.println("9 - Inserir um novo aluno no final da turma de Português");
                System.out.println("10 - Exibir todos os alunos da turma de Português");
                System.out.println("11 - Exibir dados de um único aluno da turma de Português");
                System.out.println("12 - Alterar média de um aluno de Português");
                System.out.println("13 - Alterar a quantidade de faltas de um aluno de Português");
                System.out.println("14 - Remover um aluno da turma de Português");
                System.out.println("15 - Exibir lista geral das turmas");
                System.out.println("0 - Sair do programa");
                System.out.print("Digite a opção desejada: ");
        }
}