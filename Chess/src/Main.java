import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
	    String tabuleiro[][] = new String[3][3];
        int x = 0, y = 0, jogador = 1, jogadas = 0;
        boolean vencedor = false;
		String simbolo = "O";

		// Preenche a matriz do jogo com traços
		for (int z = 0; z < 3; z++) 
		{
		  for (int d = 0; d < 3; d++) 
		  {
		      tabuleiro[z][d] = "-";
		  }
		}
		
        while (!vencedor && jogadas < 9) 
        {
        	System.out.println("Digite a Linha (0 - 2): ");
    		Scanner s = new Scanner( System.in );
    		x = s.nextInt();
            while( x < 0 || x > 2 )
            {
                System.out.println("Índice da linha inválido\n Digite a Linha (0 - 2): ");
        		s = new Scanner( System.in );
        		x = s.nextInt();
            }
            System.out.println("Digite a Coluna (0 - 2): ");
    		s = new Scanner( System.in );
            y = s.nextInt();
            while( y < 0 || y > 2 )
            {
                System.out.println("Índice da coluna inválido\n Digite a Coluna (0 - 2): ");
                s = new Scanner(System.in);
                y = s.nextInt();
            }
            
            boolean jogada = false;

            
			if (!tabuleiro[x][y].equals("X") && !tabuleiro[x][y].equals("Y")) 
			{
				if( jogador == 1 )
				{
	                tabuleiro[x][y] = "X";
	                jogada = true;
	                jogadas++;
					simbolo = "X";
				}else
				{
					tabuleiro[x][y] = "O";
					jogada = true;
					jogadas++;
					simbolo = "O";
				}
				
				if(x==0 && y==0)
				{
				   if((tabuleiro[0][1].equals(simbolo) && tabuleiro[0][2].equals(simbolo)) || (tabuleiro[1][0].equals(simbolo) && tabuleiro[2][0].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][2].equals(simbolo)))
				       vencedor = true;
				}
				if(x==0 && y==1)
				{
					if((tabuleiro[0][0].equals(simbolo) && tabuleiro[0][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][1].equals(simbolo)))
						vencedor = true;
				}
				if(x==0 && y==2)
				{
					if((tabuleiro[0][1].equals(simbolo) && tabuleiro[0][0].equals(simbolo)) || (tabuleiro[1][2].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][0].equals(simbolo)))
						vencedor = true;
				}
				if(x==1 && y==0)
				{
					if((tabuleiro[0][0].equals(simbolo) && tabuleiro[2][0].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[1][2].equals(simbolo)))
						vencedor = true;
				}
				if(x==1 && y==1)
				{
					if((tabuleiro[0][1].equals(simbolo) && tabuleiro[2][1].equals(simbolo)) || (tabuleiro[1][0].equals(simbolo) && tabuleiro[1][2].equals(simbolo)) || (tabuleiro[0][0].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) || (tabuleiro[0][2].equals(simbolo) && tabuleiro[2][0].equals(simbolo)))
						vencedor = true;
				}
				if(x==1 && y==2)
				{
					if((tabuleiro[0][2].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[1][0].equals(simbolo)))
						vencedor = true;
				}
				if(x==2 && y==0)
				{
					if((tabuleiro[0][0].equals(simbolo) && tabuleiro[1][0].equals(simbolo)) || (tabuleiro[2][1].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][2].equals(simbolo)))
						vencedor = true;
				}
				if(x==2 && y==1)
				{
					if((tabuleiro[2][0].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][1].equals(simbolo)))
						vencedor = true;
				}
				if(x==2 && y==2)
				{
					if((tabuleiro[2][1].equals(simbolo) && tabuleiro[2][0].equals(simbolo)) || (tabuleiro[1][2].equals(simbolo) && tabuleiro[0][2].equals(simbolo)) || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][0].equals(simbolo)))
						vencedor = true;
				}
            } else 
            {
                System.out.println("\n A posição já foi preenchida. \n");
                jogada = false;
            }

			
			
            if (jogada && !vencedor) 
            {
                if (jogador == 1) 
                {
                    jogador = 2;
                } else 
                {
                    jogador = 1;
                }
            }

            String matriz = "\n";
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    matriz += tabuleiro[i][j] + " ";
                }
                matriz += "\n";
            }
            System.out.println(matriz);
        }

        
        if(vencedor)
        {
            System.out.println("O Jogador "+jogador+" foi o vencedor!!!");
        }else
        {
            System.out.println("O Jogo terminou empatado.");
        }
        
	}
}
