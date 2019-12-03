import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		char letraEntrada[];
		int contLetrasPresentes = 0;
		char anagramaVector[][] = 
		{
			{'b','a','b'},
			{'c','m','o'},
			{'e','i','b'}
		};
		System.out.println("Seja bem vindo ao Anagrama Plus!");
		System.out.println("\nForme palavras com as seguintes letras b, a, c, m, o, e, i ");
		System.out.println("\nDigite uma palavra: ");
		Scanner entrada = new Scanner( System.in );
		String palavraEntrada = entrada.nextLine();
		
		
		for( int g = 0; g < palavraEntrada.length(); g++ )
		{
			letraEntrada = palavraEntrada.toCharArray();
			
			// Estes dois for são para varrer e ler cada caracter da matriz
			for( int l = 0; l < 3; l++ )
			{
				for( int c = 0; c < 3; c++ ) 
				{
					if( anagramaVector[l][c] == letraEntrada[g] )
						contLetrasPresentes++;
				}
			}
		}
		if( contLetrasPresentes > palavraEntrada.length() )
		{
			int temp = (contLetrasPresentes - palavraEntrada.length());
			contLetrasPresentes = contLetrasPresentes - temp;
		}
		if( contLetrasPresentes == palavraEntrada.length() ) 
			System.out.println("\nPalavra encontrada");
		else
			System.out.println("\nPalavra não existe");
	
		
		entrada.close();
	}
}