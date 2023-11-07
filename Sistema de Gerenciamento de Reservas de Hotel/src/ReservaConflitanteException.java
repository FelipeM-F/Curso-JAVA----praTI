public class ReservaConflitanteException extends RuntimeException{
    public ReservaConflitanteException() {
        super("Quarto já está reservado!");
    }
}
