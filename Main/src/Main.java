
public class Main 
{

	public static void main(String[] args) 
	{
		Pessoa pessoa1 = new Pessoa();
//		Pessoa servivo = new Pessoa("Paulo Gulhões", 56, 1.90, 812348530.01);
		
		System.out.println( "O nome da pessoa é: " + pessoa1.getNome() );		
		System.out.println( "O nome da pessoa é: " + pessoa1.getIdade() );		
		System.out.println( "O nome da pessoa é: " + pessoa1.getAltura() );		
		System.out.println( "O nome da pessoa é: " + pessoa1.getCpf() );		
		
		pessoa1.envelhecer();
		System.out.println( "O nome da pessoa é: " +  pessoa1.getIdade() );		

		pessoa1.setNome("francisco");
		System.out.println( "O nome da pessoa é: " + pessoa1.getNome() );		

		pessoa1.setNome("pedro");
		System.out.println( "O nome da pessoa é: " + pessoa1.getNome() );		
		
		
	}
}
