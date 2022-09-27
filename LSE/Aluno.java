public class Aluno implements Comparable<Aluno> {
    // Atributos
    private String matr;
    private String nome;
    private double media;
    private int faltas;

    // Construtor
    public Aluno(String m, String n) {
        this.matr = m;
        this.nome = n;
    }

    public Aluno(String m) {
        this.matr = m;
    }

    public Aluno(String ma, String n, double me, int f) {
        this.matr = ma;
        this.nome = n;
        this.media = me;
        this.faltas = f;
    }

    // Métodos GET e SET
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int compareTo(Aluno al) {
        int result;
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }

    public String toString() {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }
}
