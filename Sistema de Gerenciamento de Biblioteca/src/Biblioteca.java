import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private List<Livro> acervo;
    private Set<String> categorias;

    public Biblioteca()
    {
        this.acervo = new ArrayList<>();
        this.categorias = new HashSet<>();
    }
    public void adicionarLivro(Livro livro)
    {
        this.acervo.add(livro);
        this.categorias.add(livro.getCategoria());
    }
    public void removerLivro(Livro livro)
    {
        this.acervo.remove(livro);
        if(verificaCategoria(livro.getCategoria()) == false)
        {

            this.categorias.remove(livro.getCategoria());
        }
    }

    public void removerLivro(String tituloLivro)
    {
        for (Livro livro : this.acervo) {

            if (livro.getTitulo().equals(tituloLivro))
            {
                removerLivro(livro);
                break;
            }
        }
    }
    public void listarLivros()
    {
        for (Livro livro : this.acervo)
        {
            System.out.println(livro.exibirDetalhes());
        }
    }
    public void listarCategorias()
    {
        for (String categoria : this.categorias)
        {
            System.out.println(categoria);
        }
    }
    public void buscarPorCategoria(String categoria)
    {
        int teste = 0;
        System.out.println("Lista de livros de "+ categoria + ": ");
        for (Livro livro : this.acervo) {
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro.exibirDetalhes());

            }
        }
    }

    public boolean verificaCategoria(String categoria)
    {
        for (Livro livro : this.acervo) {
            if (livro.getCategoria().equals(categoria)) {
                return true;
            }
        }
        return false;
    }
}

