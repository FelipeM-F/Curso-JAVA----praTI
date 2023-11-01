import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private boolean podePegarLivro;
    public List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        podePegarLivro = true;
        livrosEmprestados = new ArrayList<>();
    }

    public void listarLivros()
    {
        for (Livro livro : this.livrosEmprestados)
        {
            System.out.println(livro.exibirDetalhes());
        }
    }

    @Override
    public String toString() {
        if(livrosEmprestados.size() == 0)
        {
            return "Usuario{" +
                    "nome='" + nome + '\'' +
                    ", podePegarLivro=" + podePegarLivro +
                    '}';
        }

        System.out.println( "{" +
                "nome='" + nome + '\'' +
                ", podePegarLivro=" + podePegarLivro  +
                "} \n Livros emprestados:" );
        listarLivros();

        return "";
    }
}
