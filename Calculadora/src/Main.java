import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Criar o projeto calculadora
		// Criar a classe Mais. Nela deverá ser solicitado ao usuário dois valores e a operação a ser realizada.
		// Criar a classe Calculadora sem atributos, somente com os métodos somar, subtrair, multiplicar, dividir.
		// Instanciar o objeto calc1.
		// Chamar um método de calc1 de acordo com o que o usuário solicitar.
		// Apresentar o resultado.
		
		// Objeto é uma instancia da classe (instanciar igual a criar)
		
		Calculadora calc1 = new Calculadora();		
		Scanner entrada = new Scanner( System.in );

		for(;;)
		{
			// Faz a pergunta ao operador e serta o numeral um com o que o operador digitou
			System.out.print("Digite o primeiro numero: ");
			calc1.setNumeralUm(entrada.nextDouble()); 

			System.out.print("Digite a operação +, -, *, /: ");
			calc1.setOperacao(entrada.next());
			// Faz a pergunta ao operador e serta o numeral dois com o que o operador digitou
			System.out.print("Digite o segundo numero: ");
			calc1.setNumeralDois(entrada.nextDouble()); 
			
			if( calc1.getOperacao().equals("+") )
			{
				System.out.println("Resuldado da Soma : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("-") )
			{
				System.out.println("Resuldado da Subtração : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("*") )
			{
				System.out.println("Resuldado da Multiplicação : " + calc1.getResultado());
			}else if( calc1.getOperacao().equals("/") )
			{
				System.out.println("Resuldado da Divisão : " + calc1.getResultado());
			}

			System.out.println("\n");
		}
	}

}
