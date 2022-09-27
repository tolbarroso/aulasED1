public class LSEAluno {
    // Atributo
    private LSENode primeiro;

    // Métodos públicos
    public boolean isEmpty() {
        // testa se a lista está vazia
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirAluno(Aluno al) {
        // verifica, usando a função "buscar" se o aluno já é cadastrado.
        LSENode novo;
        LSENode result = this.buscar(al);
        if (result != null) {
            System.out.println("Aluno já está na lista!");
        } else {
            // cria e preenche um novo nó com o aluno que foi passado como parâmetro.
            novo = new LSENode(al);
            // insere um novo aluno no início de lista de alunos.
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public void inserirAlunoPorUltimo(Aluno al) {
        // verifica, usando o "buscar", se o aluno já é cadastrado.
        LSENode aux = this.primeiro;
        LSENode result = this.buscar(al);
        if (result != null) {
            System.out.println("Aluno já está na lista!");
        } else {
            // insere um novo aluno no final de lista de alunos
            LSENode novo = new LSENode(al);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public LSENode buscar(Aluno al) {
        LSENode aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoA().compareTo(al) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void removerPrimeiro() {
        LSENode aux = this.primeiro;

        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = aux.getProx();
            this.primeiro = aux;
        }
    }

    public void removerUltimo() {
        LSENode aux = this.primeiro;
        LSENode provUltimo = null;

        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            while (aux.getProx() != null) {
                provUltimo = aux;
                aux = aux.getProx();
            }
            provUltimo.setProx(null);
        }
    }

    public void exibir() {
        // exibe o conteúdo de todos os nós da lista
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirEspecifico(Aluno al) {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (al.getMatr() != null) {
            System.out.println(al.getMatr() + " " + al.getNome() + " " + al.getMedia() + " " + al.getFaltas());
        }

    }

    public void inserirNovaMedia(String nome, String matr, double media) {
        Aluno aluno = new Aluno(matr, nome);
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (matr != null) {
            aluno.setMedia(media);
        }
        System.out.println(aluno.getMedia());
    }

    public void inserirNovasFaltas(Aluno al, int faltas) {
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (al.getMatr() != null) {
            al.setFaltas(faltas);
        }
        System.out.println(al.getFaltas());
    }

    public void removerAlunoEspecifico(String matr) {
        Aluno proc = new Aluno(matr);
        LSENode atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfoA()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } else { // lista com mais de um nó
            if (proc.compareTo(this.primeiro.getInfoA()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfoA().compareTo(proc) != 0) {
                        anterior = atual;
                        atual = atual.getProx();
                    } else {
                        break; // achou!!!
                    }
                }
                if (atual == null) {
                    System.out.println("Valor não pertence a lidta!");
                } else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }

    public LSEAluno criarCopia() {
        Aluno novoAl, alAux;
        LSEAluno outra = new LSEAluno();
        LSENode aux;

        if (this.isEmpty() == true) {
            return outra;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                alAux = aux.getInfoA();
                novoAl = new Aluno(alAux.getMatr(), alAux.getNome(), alAux.getMedia(), alAux.getFaltas());
                outra.inserirAlunoPorUltimo(novoAl);
                aux = aux.getProx();
            }
            return outra;
        }
    }

    /*public LSEAluno criarUniao(LSEAluno data2) {

        LSEAluno listaUniao;
        listaUniao = this.criarCopia();

        LSENode aux = data2.primeiro;

        while (aux != null) {
            Aluno tempStudent = new Aluno((aux.getInfo()).getMatr(), aux.getInfo().getNome());
            listaUniao.inserirAlunoPorUltimo(tempStudent);
            aux = aux.getProx();

        }

        return listaUniao;

    }*/

    public LSEAluno criarUniao() {
        Aluno novoAl, alAux, novoAl2, alAux2;
        LSEAluno outra = new LSEAluno();
        LSENode aux, aux2;

        if (this.isEmpty() == true) {
            return outra;
        } else {
            novoAl = new Aluno(alAux.getMatr(), alAux.getNome());
            outra.inserirAlunoPorUltimo(novoAl); 
            aux = aux.getProx(); 
    
            while (aux2 != null) { 
                alAux2 = aux2.getInfoA(); 
                novoAl2 = new Aluno(alAux2.getMatr(), alAux2.getNome());  
                outra.inserirAlunoPorUltimo(novoAl2);
                aux2 = aux2.getProx(); 
            } 	
            return outra; 
        } 
    }
}