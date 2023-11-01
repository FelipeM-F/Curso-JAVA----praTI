public class LimiteLivrosExcedidoException extends RuntimeException{
    public LimiteLivrosExcedidoException() {
        super("Usuário ja possui 5 livros emprestados!");
    }
}
