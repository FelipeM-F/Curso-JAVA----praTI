import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class Dado {
    private int identificador;
    private float valor;
    private String categoria;
    private LocalDate data;

    public Dado(int identificador, float valor, String categoria, LocalDate data) {
        this.identificador = identificador;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        return new StringJoiner(", ",  "\n", "")
                .add("Identificador=" + identificador)
                .add("valor=" + valor)
                .add("categoria='" + categoria + "'")
                .add("data=" + dataFormatada)
                .toString();
    }
}
