package Repository;

import Model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository{
    private Connection conn;

    public void create(Livro livro) {

        String sql = "INSERT INTO livros (titulo, autor,anoDePublicação,status) VALUES (?, ?,?,'DISPONIVEL')";
        this.conn = Conexao.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getAnoDePublicação());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("Inserção bem-sucedida!");
            } else {
                System.out.println("Erro ao inserir.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        Conexao.fecharConexao(this.conn);
    }


    public void devolverLivro(int id) {
        String sql = "UPDATE livros SET status= 'DISPONIVEL'  WHERE id = "+id;
        this.conn = Conexao.getConexao();

            try (
                    PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    System.out.println("Atualização bem-sucedida!");
                } else {
                    System.out.println("Erro ao atualizar.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            Conexao.fecharConexao(this.conn);

    }

    public void retirarLivro(int id) {
        String sql = "UPDATE livros SET  status= 'ALUGADO'  WHERE id = "+id;
        this.conn = Conexao.getConexao();

            try (
                    PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    System.out.println(resultado);
                    System.out.println("Atualização bem-sucedida!");
                } else {
                    System.out.println("Erro ao atualizar.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            Conexao.fecharConexao(this.conn);

    }

    public List<Livro> livrosDisponiveis(){
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros WHERE status = 'DISPONIVEL'";
        this.conn = Conexao.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro(rs.getString("titulo"),rs.getString("autor"),rs.getInt("anoDePublicação"));
                livro.setId(rs.getInt("id"));
                livro.setStatus(Livro.Status.DISPONÍVEL);
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Conexao.fecharConexao(this.conn);

        return livros;
    }

    public List<Livro> livrosAlugados(){
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros WHERE status = 'ALUGADO'";
        this.conn = Conexao.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro(rs.getString("titulo"),rs.getString("autor"),rs.getInt("anoDePublicação"));
                livro.setId(rs.getInt("id"));
                livro.setStatus(Livro.Status.ALUGADO);
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Conexao.fecharConexao(this.conn);
        }

        return livros;
    }
}
