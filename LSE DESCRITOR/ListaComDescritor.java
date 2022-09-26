public class ListaComDescritor {
    public static void main(String[] args) {
        LSEComDescritor<Integer> lista1 = new LSEComDescritor();
        LSEComDescritor<Double> lista2 = new LSEComDescritor();
        LSEComDescritor<Aluno> lista3 = new LSEComDescritor();

        lista1.inserirNoInicio(10);
        lista1.inserirNoInicio(30);
        lista1.inserirNoInicio(5);
        lista1.inserirNoInicio(45);

        lista2.inserirNoInicio(123.75);
        lista2.inserirNoInicio(87.58);
        lista2.inserirNoInicio(17.5);
        lista2.inserirNoInicio(141.90);

        Aluno alunoAux1 = new Aluno("567", "Maria");
        lista3.inserirNoInicio(alunoAux1);
        Aluno alunoAux2 = new Aluno("485", "João");
        lista3.inserirNoInicio(alunoAux2);
        Aluno alunoAux3 = new Aluno("941", "Mario");
        lista3.inserirNoInicio(alunoAux3);
        Aluno alunoAux4 = new Aluno("256", "Joana");
        lista3.inserirNoInicio(alunoAux4);
        
        System.out.println("VALORES DA LISTA 1");
        lista1.exibirTodos();

        System.out.println("VALORES DA LISTA 2");
        lista2.exibirTodos();

        System.out.println("VALORES DA LISTA 3");
        lista3.exibirTodos();
    }
}