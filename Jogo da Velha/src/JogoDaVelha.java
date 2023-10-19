public class JogoDaVelha {
    String[][] jogoV;
    int num;
    int jogadasRealizadas = 0;
    public JogoDaVelha() {
        jogoV = new String[3][3];
        num = 1;
        for (int i =0;i < jogoV.length; i++)
        {
            for(int j=0;j < jogoV[i].length ; j++)
            {
                jogoV[i][j] = String.valueOf(num);
                num++;
            }
        }
        imprimirTabuleiro();
    }
    public boolean realizarJogada(String jogada, String jogador)
    {
        for (int i = 0; i < jogoV.length; i++)
        {
            for (int j = 0; j < jogoV[i].length; j++)
            {
                if(jogada.equals(jogoV[i][j]))
                {
                    jogoV[i][j] = jogador;
                    jogadasRealizadas++;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean resultado()
    {
       if(jogadasRealizadas < 5) return false;
        if(jogadasRealizadas >= 9) {
            System.out.println("Sem Ganahdor!!");
            return true;
        }
        int teste = 0;
        // Teste Diagonais
        for (int i =1;i < jogoV.length; i++)
        {
            if (jogoV[i - 1][i - 1].equals(jogoV[i][i])) teste++;
            if (teste == 2) return true;
        }
        // Teste diagonal inversa
        for (int i =0;i < jogoV.length; i++)
        {
            teste = 0;
            for(int j=2;j > 0 ; j--)
            {
                if(jogoV[i+1][j-1].equals(jogoV[i][j])) teste++;
                i++;
                if(teste == 2) return true;
            }
        }
       // if(jogoV[1][1].equals(jogoV[2][0]) && jogoV[1][1].equals(jogoV[0][2])) return true;
        //Teste Linhas
        for (int i =0;i < jogoV.length; i++)
        {
            teste = 0;
            for(int j=1;j < jogoV[i].length ; j++)
            {
                if(jogoV[i][j-1].equals(jogoV[i][j])) teste++;
                if(teste == 2) return true;
            }
        }
        //Teste Colunas
        for (int i =0;i < jogoV.length; i++)
        {
            teste = 0;
            for(int j=1;j < jogoV[i].length ; j++)
            {
                if(jogoV[j-1][i].equals(jogoV[j][i])) teste++;
                if(teste == 2) return true;
            }
        }
        return false;
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoV.length; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < jogoV[i].length; j++)
            {
                System.out.print(jogoV[i][j] + " | ");
            }
            System.out.print("\n-------------");
            System.out.print("\n");
        }
    }
}
