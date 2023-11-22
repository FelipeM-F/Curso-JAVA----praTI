import java.time.LocalDate;
import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Dado> dados = new ArrayList<>();
        String[] categorias = {"Vendas", "Despesas", "Investimentos"};
        for (int i = 4; i <= 10; i++) {
            float numeroAleatorio = Float.parseFloat(String.format(Locale.US,"%.2f", Math.random() * 100));

            int indiceAleatorio = new Random().nextInt(categorias.length);
            String categoriaAleatoria = categorias[indiceAleatorio];

            LocalDate dataAleatoria = LocalDate.of(2020 + new Random().nextInt(4), 1 + new Random().nextInt(12), 1 + new Random().nextInt(28));

            dados.add(new Dado(i, numeroAleatorio, categoriaAleatoria, dataAleatoria));
        }
        AnaliseDados analisarDados = new AnaliseDados();

        dados.add(new Dado(10, 25, "Investimentos",LocalDate.of(2019,5,5)));
        dados.add(new Dado(11, 25, "Investimentos",LocalDate.of(2018,5,5)));

        System.out.println(dados);
        System.out.println("---------------------");
    /*    System.out.println(analisarDados.filtrarPorCategoria(dados,"Vendas"));
        System.out.println(analisarDados.somaPorCategoria(dados,"Vendas"));
        System.out.println(analisarDados.valorMax(dados));
        System.out.println(analisarDados.dadosPorCategoria(dados));*/
        System.out.println(analisarDados.ordenarPorValorEData(dados));

        List<Dado> dadosOrdenados = analisarDados.ordenarPorValorEData(dados);

        // Imprimindo os dados ordenados
        dadosOrdenados.forEach(System.out::println);

    }
}