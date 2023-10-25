import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner s = new Scanner(System.in);
        String jogador1 = "X";
        String jogador2 = "O";
        int quemJoga = 0;
        while(jogo.resultado() != true)
        {
            if(quemJoga ==0) {
                System.out.println("Jogador X escolha um número na tabela: ");
                if( jogo.realizarJogada(s.nextLine(), jogador1) == true)
                {
                    quemJoga = 1;
                    jogo.imprimirTabuleiro();
                } else System.out.println("Valor errado digite novamente");
            }
            else if(quemJoga ==1) {
                System.out.println("Jogador O escolha um número na tabela: ");
                if( jogo.realizarJogada(s.nextLine(), jogador2) == true)
                {
                    quemJoga = 0;
                    jogo.imprimirTabuleiro();
                } else System.out.println("Valor errado digite novamente");
            }
        }
        System.out.println("Jogo encerrado");
        jogo.imprimirTabuleiro();
    }
}
