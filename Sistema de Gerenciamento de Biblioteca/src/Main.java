import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", "Ficção científica");
        Livro livro2 = new Livro("Crepúsculo", "Stephenie Meyer", "Romance");
        Livro livro3 = new Livro("O Poder do Subconsciente", "Joseph Murphy", "Autoajuda");
        Livro livro4 = new Livro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", "Não ficção");
        Livro livro5 = new Livro("Steve Jobs", "Walter Isaacson", "Biografia");
        Livro livro6 = new Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia");
        Livro livro7 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia");
        Livro livro8 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);

        biblioteca.listarLivros();
        biblioteca.listarCategorias();

        biblioteca.buscarPorCategoria("Fantasia");

        biblioteca.removerLivro(livro7);
        biblioteca.buscarPorCategoria("Fantasia");
        biblioteca.buscarPorCategoria("Romance");
        biblioteca.removerLivro("Crepúsculo");
        biblioteca.buscarPorCategoria("Romance");



    }

}