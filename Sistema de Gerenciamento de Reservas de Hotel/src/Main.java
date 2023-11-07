import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Reserva reserva1 = new Reserva(
                1,
                "João da Silva",
                LocalDate.of(2023, 11, 10),
                LocalDate.of(2023, 11, 12),
                101
        );
        Reserva reserva2 = new Reserva(
                2,
                "Maria da Silva",
                LocalDate.of(2023, 11, 11),
                LocalDate.of(2023, 11, 14),
                102
        );
        Reserva reserva3 = new Reserva(
                3,
                "José dos Santos",
                LocalDate.of(2023, 11, 12),
                LocalDate.of(2023, 11, 16),
                103
        );
        Reserva reserva4 = new Reserva(
                4,
                "Ana Paula",
                LocalDate.of(2023, 11, 13),
                LocalDate.of(2023, 11, 18),
                104
        );
        Reserva reserva5 = new Reserva(
                5,
                "Pedro Henrique",
                LocalDate.of(2023, 11, 14),
                LocalDate.of(2023, 11, 20),
                105
        );
        Reserva reserva6 = new Reserva(
                6,
                "Letícia Souza",
                LocalDate.of(2023, 11, 15),
                LocalDate.of(2023, 11, 22),
                106
        );
        Reserva reserva7 = new Reserva(
                7,
                "Carlos Alberto",
                LocalDate.of(2023, 11, 16),
                LocalDate.of(2023, 11, 24),
                107
        );
        Reserva reserva8 = new Reserva(
                8,
                "Fernanda Gomes",
                LocalDate.of(2023, 11, 17),
                LocalDate.of(2023, 11, 26),
                108
        );

        GerenciadorReservas gerenciadorReservas = new GerenciadorReservas();


        gerenciadorReservas.adicionar(reserva1);
        gerenciadorReservas.adicionar(reserva2);
        gerenciadorReservas.adicionar(reserva3);
        gerenciadorReservas.adicionar(reserva4);
        gerenciadorReservas.adicionar(reserva5);
        gerenciadorReservas.adicionar(reserva6);
        gerenciadorReservas.adicionar(reserva7);
        gerenciadorReservas.adicionar(reserva8);

        System.out.println(gerenciadorReservas.getReservas());

        Reserva reserva9 = new Reserva(
                9,
                "Fernanda Gomes",
                LocalDate.of(2023, 11, 17),
                LocalDate.of(2023, 11, 26),
                108
        );

        //gerenciadorReservas.adicionar(reserva9);

        gerenciadorReservas.buscar(4);
        gerenciadorReservas.buscar(2);

        gerenciadorReservas.remover(reserva2);

        System.out.println(gerenciadorReservas.getReservas());
    }

}