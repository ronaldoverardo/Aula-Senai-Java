import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Criar o projeto calculadora
		// Criar a classe Mais. Nela dever� ser solicitado ao usu�rio dois valores e a opera��o a ser realizada.
		// Criar a classe Calculadora sem atributos, somente com os m�todos somar, subtrair, multiplicar, dividir.
		// Instanciar o objeto calc1.
		// Chamar um m�todo de calc1 de acordo com o que o usu�rio solicitar.
		// Apresentar o resultado.
		
		// Objeto � uma instancia da classe (instanciar igual a criar)
		
		Calculadora calc1 = new Calculadora();		
		Scanner entrada = new Scanner( System.in );

		for(;;)
		{
			// Faz a pergunta ao operador e serta o numeral um com o que o operador digitou
			System.out.print("Digite o primeiro numero: ");
			calc1.setNumeralUm(entrada.nextDouble()); 

			System.out.print("Digite a opera��o +, -, *, /: ");
			calc1.setOperacao(entrada.next());
			// Faz a pergunta ao operador e serta o numeral dois com o que o operador digitou
			System.out.print("Digite o segundo numero: ");
			calc1.setNumeralDois(entrada.nextDouble()); 
			
			if( calc1.getOperacao().equals("+") )
			{
				System.out.println("Resuldado da Soma : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("-") )
			{
				System.out.println("Resuldado da Subtra��o : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("*") )
			{
				System.out.println("Resuldado da Multiplica��o : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("/") )
			{
				System.out.println("Resuldado da Divis�o : " + calc1.getResultado());
			}

			System.out.println("\n");
		}
	}

}
