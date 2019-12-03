import java.text.SimpleDateFormat;
import java.util.Date;

public class Main 
{

	public static void main(String[] args)
	{
//		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		formato.format(new Date());
//		formato.parse("12/11/2019"); // Usado para inicializar uma data
		
		Cadeira cad1 = new Cadeira();
//		Cadeira cad2 = new Cadeira( true );
		Cadeira cad3 = new Cadeira( "Vermelho", "Acolchoado","Recaro", new Date(),true, 5 );
		
		Date data1;
		String fab1;
//		Date data2;
//		String fab2;

		cad1.quebrar();
		data1 = cad1.emitirDataFabric();
		fab1 = cad1.retornaFabricante();

//		cad2.quebrar();
//		data2 = cad2.emitirDataFabric();
//		fab2 = cad2.retornaFabricante();

		
		System.out.println( "A data de fabricação da cadeira 1 é: " + formato.format(data1) );
		System.out.println( "O fabricante é: " + fab1 );

//		System.out.println( "A data de fabricação da cadeira 2 é: " + formato.format(data2) );
//		System.out.println( "O fabricante é: " + fab2 );
		
		System.out.println( "O fabricante da cadeira 3 é: " + cad3.retornaFabricante() );
		
		
		
		
		
	}

}
