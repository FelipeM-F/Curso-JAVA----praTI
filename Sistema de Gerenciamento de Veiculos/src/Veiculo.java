/*
Crie uma classe abstrata Veiculo com os seguintes atributos
placa (String).
marca (String).
modelo (String).
ano (int).
preço (double). métodos
Construtor com todos os parâmetros.
Métodos getters e setters.
Método abstrato 'exibirDetalhes()' que retorna uma String.
 */
public class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String placa, String marca, String modelo, int ano, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String exibirDetalhes() {
        return "------Informações " + getClass().getName() + "-------\n" +
                "Marca: " + this.marca + " - " +
                "Modelo: " + this.modelo + " - " +
                "Ano: " + this.ano + "\n"+
                "Placa: " + this.placa + " - "+
                "Preço: " + preco;
    }

    public void aplicarDesconto(double valorDesconto) {

    }
}
