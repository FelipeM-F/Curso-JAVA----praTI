import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas implements Repositorio<Reserva>{
    private List<Reserva> reservas;

    public GerenciadorReservas()
    {
        reservas = new ArrayList<>();
    }

    public List<Reserva> getReservas()
    {
        return reservas;
    }

    @Override
    public Reserva adicionar(Reserva item)
    {
        for (Reserva reserva : reservas)
        {
            if (reserva.getQuarto() == item.getQuarto())
            {
                throw new ReservaConflitanteException();
            }
        }
        reservas.add(item);
        return item;
    }

    @Override
    public Reserva remover(Reserva item)
    {
        reservas.remove(item);
        return item;
    }

    @Override
    public <Integer> Reserva buscar(Integer codigo)
    {
        for (Reserva reserva : reservas)
        {
            if (reserva.getCodigo() == codigo)
            {
                System.out.println(reserva);
                return reserva;
            }
        }
        return null;
    }
}
