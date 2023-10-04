public class Aluno
{
    private String nome;
    private int idade;
    private String numMatricula;
    private double notaMedia;

    public Aluno(String nome, int idade, String numMatricula, double notaMedia)
    {
        this.nome = nome;
        this.idade = idade;
        this.numMatricula = numMatricula;
        this.notaMedia = notaMedia;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNumMatricula()
    {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula)
    {
        this.numMatricula = numMatricula;
    }

    public double getNotaMedia()
    {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia)
    {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                nome + '\'' +
                ", idade=" + idade +
                ", numMatricula='" + numMatricula + '\'' +
                ", notaMedia=" + notaMedia;
    }
}
