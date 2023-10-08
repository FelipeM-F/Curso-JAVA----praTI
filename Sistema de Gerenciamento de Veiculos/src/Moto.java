/*
mplementando a interface
Faça as classes Carro e Moto implementarem a interface Promocao.
Implemente o método aplicarDesconto de modo que carros recebam um
desconto de no máximo 10% e motos de no máximo 5% do preço original.
 */
public class Moto extends Veiculo implements Promocao{
    private String tipoFreio;
    public Moto(String placa, String marca, String modelo, int ano, double preco, String tipoFreio) {
        super(placa, marca, modelo, ano, preco);
        this.tipoFreio = tipoFreio;
    }
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
                "\nTipo de Freio= "+tipoFreio + "\n";
    }

    @Override
    public void aplicarDesconto(double valor) {
        if(valor>5)
        {
            System.out.println("O valor do desconto não pode ser maior que 5%");
            System.out.println("Aplicando valor máximo de 5%");
            aplicarDesconto(5);
        }
        else preco = preco - preco*valor/100;
    }

}
