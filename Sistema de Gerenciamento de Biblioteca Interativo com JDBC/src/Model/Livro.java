package Model;

import java.util.StringJoiner;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoDePublicação;
    private Status status;

    public enum Status {
        DISPONÍVEL,
        ALUGADO
    }

    public Livro(String titulo, String autor, int anoDePublicação) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicação = anoDePublicação;
        this.status = Status.DISPONÍVEL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicação() {
        return anoDePublicação;
    }

    public void setAnoDePublicação(int anoDePublicação) {
        this.anoDePublicação = anoDePublicação;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Livro.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("titulo='" + titulo + "'")
                .add("autor='" + autor + "'")
                .add("anoDePublicação=" + anoDePublicação)
                .add("status=" + status)
                .toString();
    }
}
