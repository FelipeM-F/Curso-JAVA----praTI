import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AnaliseDados {

    public List<Dado> filtrarPorCategoria(List<Dado> dados, String categoria){

        List<Dado> dadosFiltrados = dados.stream().filter(dado -> dado.getCategoria().equals(categoria)).collect(Collectors.toList());
        return dadosFiltrados;
    }

    public float somaPorCategoria(List<Dado> dados, String categoria) {
        double somaDados = filtrarPorCategoria(dados, categoria).stream().mapToDouble(Dado::getValor).sum();
        return (float) somaDados;
    }

    public float valorMax(List<Dado> dados) {

        double valorMax = dados.stream().mapToDouble(Dado::getValor).max().orElse(0);
        return (float) valorMax;
    }
    public double obterMaiorValor(List<Dado> dados) {
        return dados.stream()
                .mapToDouble(Dado::getValor)
                .reduce(Double::max)
                .orElse(-1);
    }

 /*   public Map<String, List<Dado>> DadosPorCategoria(List<Dado> dados){

        Map<String, List<Dado>> dadosAgrupados = dados.stream().collect(Collectors.groupingBy(Dado::getCategoria));
        return dadosAgrupados.values().stream().toList();
    }*/

    public List<List<Dado>> dadosPorCategoria(List<Dado> dados){

        Map<String, List<Dado>> dadosAgrupados = dados.stream().collect(Collectors.groupingBy(Dado::getCategoria));
        return dadosAgrupados.values().stream().collect(Collectors.toList());
    }

    public List<Dado> ordenarPorValorEData(List<Dado> dados) {
        List<Dado> dadosOrdenados = dados.stream().sorted(Comparator.comparingDouble(Dado::getValor).thenComparing(Dado::getData)).collect(Collectors.toList());
        return dadosOrdenados;
    }

}
