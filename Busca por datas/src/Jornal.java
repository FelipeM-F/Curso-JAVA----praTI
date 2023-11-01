import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Jornal {

    private static final List<Artigo> artigos = new ArrayList<>();

    static {
        artigos.add(new Artigo("Brasil vence Argentina e conquista a Copa América", LocalDate.of(2018, 5, 11)));
        artigos.add(new Artigo("Pesquisa aponta que inflação deve continuar alta no Brasil", LocalDate.of(2020, 7, 10)));
        artigos.add(new Artigo("Bolsonaro sanciona lei que amplia porte de armas no Brasil", LocalDate.of(2010, 7, 9)));
        artigos.add(new Artigo("Morre o ex-presidente João Figueiredo", LocalDate.of(2015, 7, 8)));
        artigos.add(new Artigo("NASA lança nova missão para explorar Marte", LocalDate.of(2017, 7, 7)));
        artigos.add(new Artigo("Anunciada nova variante da COVID-19", LocalDate.of(2023, 7, 6)));
        artigos.add(new Artigo("Intel anuncia novo processador para computadores", LocalDate.of(2020, 7, 5)));
        artigos.add(new Artigo("Crise climática: temperatura da Terra atinge novo recorde", LocalDate.of(2021, 7, 12)));
        artigos.add(new Artigo("Guerra na Ucrânia: EUA e aliados anunciam novas sanções contra a Rússia", LocalDate.of(2022, 7, 13)));
        artigos.add(new Artigo("Bolsonaro anuncia demissão de Ministro da Economia", LocalDate.of(2014, 4, 14)));
        artigos.add(new Artigo("Anvisa aprova novo medicamento para tratamento da COVID-19", LocalDate.of(2023, 1, 15)));
        artigos.add(new Artigo("Brasil supera a marca de 100 milhões de casos de COVID-19", LocalDate.of(2010, 3, 16)));
        artigos.add(new Artigo("NASA detecta sinais de vida em Marte", LocalDate.of(2019, 3, 17)));
        artigos.add(new Artigo("Intel anuncia nova linha de processadores para servidores", LocalDate.of(2022, 4, 18)));
    }

    public static List<Artigo> getArtigos() {
        return artigos;
    }

    public static void adicionarArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public static void removerArtigo(Artigo artigo) {
        artigos.remove(artigo);
    }

    public static List buscarPorData(LocalDate de, LocalDate ate)
    {
        List<Artigo> artigosDeAte = new ArrayList<>();
        for (Artigo artigo : artigos)
        {
            if(artigo.getDataPublicacao().isAfter(de) && artigo.getDataPublicacao().isBefore(ate))
            {
                artigosDeAte.add(artigo);
            }
        }
        // Ordena a lista pela data de publicação
        artigosDeAte.sort(Comparator.comparing(Artigo::getDataPublicacao));
        return artigosDeAte;
    }

}
