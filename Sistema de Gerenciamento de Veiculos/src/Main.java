
public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("ABC1D23","Volkswagen", "Polo", 2023 , 65000,4);
        Veiculo carro2 = new Carro("AGC1E34","Chevrolet", "Onix", 2023 , 60000,4);
        Veiculo carro3 = new Carro("QWE1D23","Honda", "Civic", 2020 , 1300000,4);
        Veiculo moto1 = new Moto("IWE9D84","Honda", "CG Titan 160", 2019 , 17000,"ABS");;
        Veiculo moto2 = new Moto("QDF1A24","Yamaha", "MT 03", 2023 , 31000,"ABS");
        Veiculo moto3 = new Moto("CSA1A12","Honda", "CB Twister", 2023 , 24000,"ABS");

        Revenda revenda = new Revenda();
        revenda.adicionarVeiculo(carro1);
        revenda.adicionarVeiculo(carro2);
        revenda.adicionarVeiculo(carro3);
        revenda.adicionarVeiculo(moto1);
        revenda.adicionarVeiculo(moto2);
        revenda.adicionarVeiculo(moto3);

        System.out.println(revenda.listarVeiculos());
        revenda.removerVeiculo("AGC1E34");
        revenda.adicionarVeiculo(moto3);
        revenda.adicionarDesconto("ABC1D23",8);
        revenda.adicionarDesconto("IWE9D84",8);
        System.out.println(revenda.listarVeiculos());

    }
}