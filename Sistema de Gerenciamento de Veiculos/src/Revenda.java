/*
Crie uma classe Revenda:
Crie 5 atributos do tipo Veiculo
Crie um método adicionarVeiculo(Veiculo veiculo): para adicionar um veículo.
Crie um método removerVeiculo(String placa): para remover um veículo
Crie um método listarVeiculos(): para listar todos os veículos
Crie um método adicionarDesconto(String placa, double valorDesconto):
para adicionar um desconto no veículo específico.
 */
public class Revenda {
    public Veiculo v1;
    public Veiculo v2;
    public Veiculo v3;
    public Veiculo v4;
    public Veiculo v5;
    public int contVeic;

    public void adicionarVeiculo(Veiculo v) {
        if (v1 == null)
        {
            v1 = v;
            contVeic++;
        } else if (v2 == null)
        {
            v2 = v;
            contVeic++;
        } else if (v3 == null)
        {
            v3 = v;
            contVeic++;
        } else if (v4== null)
        {
            v4 = v;
            contVeic++;
        } else if (v5 == null)
        {
            v5 = v;
            contVeic++;
        } else System.out.println("Revenda Cheia");
    }
    public void removerVeiculo (String placa)
    {
        if (v1.placa.equals(placa))
        {
            v1 = null;
            contVeic--;
        } else if (v2.placa.equals(placa))
        {
            v2 = null;
            contVeic--;
        } else if (v3.placa.equals(placa))
        {
            v3 = null;
            contVeic--;
        } else if (v4.placa.equals(placa))
        {
            v4 = null;
            contVeic--;
        } else if (v5.placa.equals(placa))
        {
            v5 = null;
            contVeic--;
        } else System.out.println("Veículo não encontrado");
    }

    public String listarVeiculos() {
        return "Carros Disponíveis: \n"+
                v1.exibirDetalhes()+
                v2.exibirDetalhes()+
                v3.exibirDetalhes()+
                v4.exibirDetalhes()+
                v5.exibirDetalhes();
    }

    public void adicionarDesconto(String placa, double valorDesconto)
    {
        if (v1.placa.equals(placa))
        {
            v1.aplicarDesconto(valorDesconto);

        } else if (v2.placa.equals(placa))
        {
            v2.aplicarDesconto(valorDesconto);

        } else if (v3.placa.equals(placa))
        {
            v3.aplicarDesconto(valorDesconto);

        } else if (v4.placa.equals(placa))
        {
            v4.aplicarDesconto(valorDesconto);

        } else if (v5.placa.equals(placa))
        {
            v5.aplicarDesconto(valorDesconto);

        } else System.out.println("Veículo não encontrado");
    }
}
