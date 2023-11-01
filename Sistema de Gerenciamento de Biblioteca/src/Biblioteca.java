import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private List<Livro> acervo;
    private Set<String> categorias;
    private List<Usuario> usuarios;

    public Biblioteca()
    {
        this.acervo = new ArrayList<>();
        this.categorias = new HashSet<>();
        this.usuarios = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro)
    {
        this.acervo.add(livro);
        this.categorias.add(livro.getCategoria());
    }
    public void adicionarUsuario(Usuario usuario)
    {

        this.usuarios.add(usuario);
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

    public void listarUsuarios()
    {
        for (Usuario usuario : this.usuarios)
        {
            System.out.println(usuario);
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

    public boolean isLivroEmprestado(Livro livro) {
        return livro.livroEmprestado;
    }

    public void emprestarLivro (Usuario usuario, Livro livro) {
        if(isLivroEmprestado(livro) == true)
        {
            throw new LivroIndisponivelException();
        }
        if(usuario.livrosEmprestados.size() < 5)
        {
            usuario.livrosEmprestados.add(livro);
            livro.livroEmprestado = true;
        }
        else throw new LimiteLivrosExcedidoException();

    }
    public void devolverLivro(Usuario usuario, Livro livro) {
        usuario.livrosEmprestados.remove(livro);
        livro.livroEmprestado = false;
    }
}

