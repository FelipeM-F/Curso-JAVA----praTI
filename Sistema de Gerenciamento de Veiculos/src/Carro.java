
public class Carro extends Veiculo implements Promocao{
    private int qtdPortas;
    public Carro(String placa, String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(placa, marca, modelo, ano, preco);
        this.qtdPortas = qtdPortas;
    }
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
                "\nQuantidade de Portas: "+qtdPortas + "\n";
    }
    @Override
    public void aplicarDesconto(double valor) {
        if(valor>10)
        {
            System.out.println("O valor do desconto não pode ser maior que 5%");
            System.out.println("Aplicando valor máximo de 5%");
            aplicarDesconto(10);
        }
        else preco = preco - preco*valor/100;
    }


}
