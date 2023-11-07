import java.time.LocalDate;
import java.time.Period;

public class Reserva {
    private Integer codigo;
    private String cliente;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Integer quarto;

    public Reserva(Integer codigo, String cliente, LocalDate dataEntrada, LocalDate dataSaida, Integer quarto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int diasReservados()
    {
        Period periodo = Period.between(getDataEntrada(), getDataSaida());
        int dias = periodo.getDays();
        return dias;
    }

    @Override
    public String toString() {
        return "\nReserva núumero=" + codigo +
                ", cliente='" + cliente + '\'' +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", quarto=" + quarto + "\n";
    }
}
