public class Aluno implements Comparable<Aluno> {
    private String matr;
    private String nome;
    private double media;
    private int faltas;

    public Aluno(String m) {
        this.matr = m;
    }

    public Aluno(String m, String n) {
        this.matr = m;
        this.nome = n;
    }

    public String getMatr() {
        return this.matr;
    }

    public void setMatr(String m) {
        this.matr = m;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double m) {
        this.media = m;
    }

    public int getFaltas() {
        return this.faltas;
    }

    public void setFaltas(int f) {
        this.faltas = f;
    }

    @Override
    public String toString() {
        return "Matrícula = " + this.matr + ", Nome = " + this.nome + ", Média final = " + this.media + ", Faltas = " + this.faltas;
    }

    @Override
    public int compareTo(Aluno data) {
        int result;
        result = this.getMatr().compareToIgnoreCase(data.getMatr());
        return result;
    }
}