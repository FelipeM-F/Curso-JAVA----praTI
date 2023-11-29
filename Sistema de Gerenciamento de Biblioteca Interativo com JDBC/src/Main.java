import Model.Livro;
import Repository.LivroRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LivroRepository livroRepo = new LivroRepository();

        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.next();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.next();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int anoPublicacao = scanner.nextInt();
                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
                    livroRepo.create(novoLivro);
                    break;
                case 2:
                    System.out.print("Digite o ID do livro que deseja alugar: ");
                    int idLivro = scanner.nextInt();
                    livroRepo.retirarLivro(idLivro);
                    break;
                case 3:
                    System.out.print("Digite o ID do livro que deseja devolver: ");
                    int idLivro2 = scanner.nextInt();
                    livroRepo.devolverLivro(idLivro2);
                    break;
                case 4:
                    List<Livro> alugados = livroRepo.livrosAlugados();
                    alugados.forEach(System.out::println);
                    break;
                case 5:
                    List<Livro> livrosDispo = livroRepo.livrosDisponiveis();
                    livrosDispo.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 6);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar um Livro");
        System.out.println("2. Alugar um Livro");
        System.out.println("3. Devolver um Livro");
        System.out.println("4. Ver Livros Alugados");
        System.out.println("5. Ver Livros Disponíveis");
        System.out.println("6. Sair");
    }

}

                /*Livro novoLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
                Livro novoLivro = new Livro("O Senhor dos Anéis as Duas Torres", "J.R.R. Tolkien", 1954);
                livroRepo.create(novoLivro);
                Livro novoLivro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
                livroRepo.create(novoLivro1);


                Livro novoLivro2 = new Livro("1984", "George Orwell", 1949);
                livroRepo.create(novoLivro2);

                // Example 3
                Livro novoLivro3 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
                livroRepo.create(novoLivro3);*/