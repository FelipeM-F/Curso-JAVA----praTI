import java.time.LocalDate;

public class Artigo {

    private String titulo;
    private LocalDate dataPublicacao;

    public Artigo(String titulo, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "\nArtigo" +
                "titulo='" + titulo + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                "\n";
    }
}
