//---------------------------------------------------------------------------------------------------------+
//																										   |
//---------------------------------------------------------------------------------------------------------+
//		Autor: Ronaldo Verarado																			   |
//		Data: 17/10/2019																				   |
//																										   |
//																										   |
//---------------------------------------------------------------------------------------------------------+
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{
//		String nome = null;
//		String nome2 = null;
//		int num1 = 0;
//		int num2 = 0;
//		int resultado = 0;
		
//		float num1 = 0;
//		float num2 = 0;
//		float resultado = 0;
		
//		System.out.println( "Olá Mundo !!!!!");
//		System.out.println( "Boa Noite, muito prazer me chamo " + nome + ".");
		
//		System.out.println( "Qual o seu nome ? ");
//		Scanner entrada = new Scanner( System.in );
//		nome2 = entrada.next();
		
//		System.out.println( "Seu nome é : " + nome2 + "." );

		/*
		 * System.out.println( "Digiter o primeiro numero :"); Scanner entrada = new
		 * Scanner( System.in );
		 * 
		 * num1 = entrada.nextInt();
		 * 
		 * System.out.println( "Digiter o segundo numero :"); num2 = entrada.nextInt();
		 * 
		 * resultado = num1 + num2;
		 * 
		 * System.out.println( "A Soma dos numeros : " + resultado ); //
		 * System.out.println( "A Soma dos numeros : " + ( num1 + num2 ) );
*/
		
/*		 System.out.println( "Digiter o primeiro numero :"); Scanner entrada = new
		 Scanner( System.in );
		  
		 num1 = entrada.nextInt();
		  
		 System.out.println( "Digiter o segundo numero :"); num2 = entrada.nextInt();
		  
		 resultado = num1 / num2;
		 
		 System.out.println( "A Soma dos numeros : " +  Math.sqrt(resultado) ); //
//		 System.out.println( "A Soma dos numeros : " +  resultado ); //
//		 System.out.println( "A Soma dos numeros : " + ( num1 + num2 ) );
*/		
/*		String sobrenome = " Verardo";
		System.out.println("Nome: " + nome + sobrenome);
		
		Integer idade = 20;
		Integer idade2 = 40;
		
		String frase = nome + " " + idade2;
		System.out.println(frase);
		
		Integer idade3 = idade + idade2;
		String idadeletra = idade3.toString();
		System.out.println(idadeletra);
*/
//		int idade = 0;
//		
//		System.out.println( "Qual é a sua idade ? ");
//		Scanner entrada = new Scanner( System.in );
//		idade = entrada.nextInt();
//		
//		if( idade > 18 ) 
//		{
//			System.out.println( "Parabéns, voce pode tirar sua habilitação!");
//		}
//		else
//		{
//			System.out.println( "Sinto muito, voce não tem idade suficiente par a sua primeira habilitação.");
//		}
//		// encerra o scanner
//		entrada.close();

//		String nome = null;
//		
//		System.out.println( "Qual seu nome ? ");
//
//		Scanner entrada = new Scanner( System.in );
//		nome = entrada.nextLine();
//		
//		if( nome.length() == 0 ) 
//		{
//			System.out.println( "Nome está vazio");
//		}
//		else
//		{
//			System.out.println( "Nome tem caracteres");
//		}
//		// encerra o scanner
//		entrada.close();			

		
//		System.out.println( "Digite um numero:");
//		Scanner entrada = new Scanner( System.in );
//		int num1 = entrada.nextInt();
//
////		int total = ( ( num1 / 2 ) * 2 );
////		if( total == num1 )
//		if( num1 % 2 == 0 )
//		{
//			System.out.println( "O numero " + num1 + " é par.");
//		}else
//		{
//			System.out.println( "O numero " + num1 + " é impar.");
//		}
//		
//		
//		// encerra o scanner
//		entrada.close();			

	
//		System.out.println( "Digite sua idade:");
//		Scanner entrada = new Scanner( System.in );
//		int num1 = entrada.nextInt();
//
//		if( num1 >= 18 )
//		{
//			System.out.println( "Voce pode tirar sua carteira de habilitação");
//		}else
//		{
//			if( num1 < 14  )
//			{
//				System.out.println( "Falta muito tempo ainda");
//			}else
//			{
//				System.out.println( "Falta pouco.");
//			}
//		}
//		// encerra o scanner
//		entrada.close();			
	
		
		// Perguntar o salario e informar a quantidade de IR que o usuário paga por mês
		// Se salario <= 1500 não para  IR
		// Se 1500 < salario <= 2500 paga 10%
		// Se 2500 < salario <= 4500 paga 20%
		// se 4500 > salario paga 30%

//		int descontoIRatual = 0;
//		int salarioLiquido = 0;
//		System.out.println( "Qual seu salário: ");
//		Scanner entrada = new Scanner( System.in );
//		float salario = entrada.nextInt();
//		
//		if( salario <= 1500 )
//		{
//			System.out.println( "Não terá que pagar IR :) !!!!" );
//		}else if( salario <= 2500 )
//		{
//			descontoIRatual = (int)(salario*0.1);
////			salarioLiquido = (int)(salario*0.9);
//			salarioLiquido = (int)(salario - descontoIRatual);
//			System.out.println( "Terá que pagar na faixa de 10% IR: " + descontoIRatual );
//			System.out.println( "Seu salárario com o desconto será: " + salarioLiquido );
//		}else if( salario <= 4500 )
//		{
//			descontoIRatual = (int)(salario*0.2);
////			salarioLiquido = (int)(salario*0.8) ;
//			salarioLiquido = (int)(salario - descontoIRatual);
//			System.out.println( "Terá que pagar na faixa de 20% IR: " + descontoIRatual );
//			System.out.println( "Seu salárario com o desconto será: " + salarioLiquido );
//		}else
//		{
//			descontoIRatual = (int)(salario*0.3);
////			salarioLiquido = (int)(salario*0.7) ;
//			salarioLiquido = (int)(salario - descontoIRatual);
//			System.out.println( "Terá que pagar na faixa de 30% IR: " + descontoIRatual );
//			System.out.println( "Seu salárario com o desconto será: " + salarioLiquido );
//		}
//		entrada.close();			
		
/*		
		// Determinar qual salário é mais vantjoso receber um aumento de salário
		
//		1500
//		100 
//		não é vantagem

//		1500
//		350
//		sim é vantagem
		
		int descontoIRatual = 0;
		int salarioLiquido = 0;
		int salarioComAumento = 0;
		System.out.println( "Qual seu salário: ");
		Scanner entradaSalario = new Scanner( System.in );
		float salario = entradaSalario.nextInt();
	
		System.out.println( "Qual seu aumento: ");
		Scanner entradaAumento = new Scanner( System.in );
		float aumento = entradaAumento.nextInt();

		salarioComAumento = (int)(salario + aumento);
		
		if( salarioComAumento <= 1500 )
		{
			System.out.println( "Faixa Isenta" );
		}else if( salarioComAumento <= 2500 )
		{
			descontoIRatual = (int)(salarioComAumento*0.1);
			System.out.println( "Faixa 10%: ");
		}else if( salarioComAumento <= 4500 )
		{
			descontoIRatual = (int)(salarioComAumento*0.2);
			System.out.println( "Faixa 20%: ");
		}else
		{
			descontoIRatual = (int)(salarioComAumento*0.3);
			System.out.println( "Faixa 30%: ");
		}
		
		
		if( salarioComAumento <= 1500 )
		{
			System.out.println( "Não terá que pagar IR :) !!!!" );
		}else if( salarioComAumento <= 2500 )
		{
			descontoIRatual = (int)(salarioComAumento*0.1);
			salarioLiquido = (int)(salario - descontoIRatual);
			System.out.println( "Terá que pagar na faixa de 10% IR: " + descontoIRatual );
			System.out.println( "Seu salárario liquido será: " + salarioLiquido );
		}else if( salarioComAumento <= 4500 )
		{
			descontoIRatual = (int)(salarioComAumento*0.2);
			salarioLiquido = (int)(salario - descontoIRatual);
			System.out.println( "Terá que pagar na faixa de 20% IR: " + descontoIRatual );
			System.out.println( "Seu salárario liquido será: " + salarioLiquido );
		}else
		{
			descontoIRatual = (int)(salarioComAumento*0.3);
			salarioLiquido = (int)(salario - descontoIRatual);
			System.out.println( "Terá que pagar na faixa de 30% IR: " + descontoIRatual );
			System.out.println( "Seu salárario liquido será: " + salarioLiquido );
		}
		entradaSalario.close();			
		entradaAumento.close();			
*/		
/*		int contador = 0;
		while( contador <= 10)
		{
			System.out.println( "Contador: " + contador);
			contador++;

//			// Conta de 2 em 2 para mostrar somente números pares
//			contador = ( contador + 2 );
//			System.out.println( "Contador: " + contador);
			
		}
		
*/
/*		int contador = 10;
		do
		{
			System.out.println( "Contador: " + contador);
//			contador =  (contador - 1);
			contador--;
			
//			}while (contador != 0);		// Não mostra o 0
//			}while (contador >= 0);		// Mostra o 0
		}while (contador > -1);		// Mostra o 0
//		}while (contador >= -1);	// Mostra o -1
*/
		
/*		for(int contador = 5; contador <= 10; contador++) 
		{
			contador++;
			System.out.println( "Contador Par: " + contador);
		}
*/
		
		// 4
/*		float media = 0;
		
		System.out.println( "Digite a primeira nota : ");
		Scanner entradaNota1 = new Scanner( System.in );
		float nota1 = entradaNota1.nextFloat();
	
		System.out.println( "Digite a segunda nota : ");
		Scanner entradaNota2 = new Scanner( System.in );
		float nota2 = entradaNota2.nextFloat();

		System.out.println( "Digite a terceira nota : ");
		Scanner entradaNota3 = new Scanner( System.in );
		float nota3 = entradaNota3.nextFloat();

		System.out.println( "Digite a quarta nota : ");
		Scanner entradaNota4 = new Scanner( System.in );
		float nota4 = entradaNota4.nextFloat();

		media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.println("A média aritimética das quatro notas é: " + media);
		
		entradaNota1.close();			
		entradaNota2.close();			
		entradaNota3.close();			
		entradaNota4.close();			
*/		
		// 5
/*		float valorFinalDivida = 0;
		
		System.out.println( "Digite o valor inicial da Dívida R$: ");
		Scanner entradaDivida = new Scanner( System.in );
		float valorInicialDivida = entradaDivida.nextFloat();
	
		System.out.println( "Quantidade de meses : ");
		Scanner entradaPeriodo = new Scanner( System.in );
		float periodo = entradaPeriodo.nextFloat();

		System.out.println( "Valor dos Juros mensais %: ");
		Scanner entradaJuros = new Scanner( System.in );
		float juros = entradaJuros.nextFloat();

		valorFinalDivida = ((valorInicialDivida * (juros / 100))*periodo);
		
		System.out.println("Sua Dívida será de R$: " + valorFinalDivida);
		
		entradaDivida.close();			
		entradaPeriodo.close();			
		entradaJuros.close();			
*/
		
/*		// 21
		float valorEmprestimoMax = 0;
		System.out.println( "Digiter seu salário : ");
		Scanner entradaSalario = new Scanner( System.in );
		float salario = entradaSalario.nextFloat();
		
		System.out.println( "Qual seu cargo: 1-Diretoria, 2-Gerencia, 3-Operacional, digite: ");
		Scanner entradaCargo = new Scanner( System.in );
		int valorCargo = entradaCargo.nextInt();
		
		if( valorCargo == 1 )
		{
			valorEmprestimoMax = (float)(salario * 0.30);
			System.out.println("Máximo valor de emprestimo disponivel :" + valorEmprestimoMax);
		}else if( valorCargo == 2 )
		{
			valorEmprestimoMax = (float)(salario * 0.25);
			System.out.println("Máximo valor de emprestimo disponivel :" + valorEmprestimoMax);
		}else if( valorCargo == 3 )
		{
			valorEmprestimoMax = (float)(salario * 0.20);
			System.out.println("Máximo valor de emprestimo disponivel :" + valorEmprestimoMax);
		}else
		{
			System.out.println("Opção Inválida");
		}
		
		entradaSalario.close();			
		entradaCargo.close();			
*/		
/*		// 10
		float maximoPossivelEmprestimo = 0;
		System.out.println( "Digiter seu salário bruto: ");
		Scanner entradaSalarioBruto = new Scanner( System.in );
		float salarioBruto = entradaSalarioBruto.nextFloat();

		System.out.println( "Digiter seus descontos : ");
		Scanner entradaDescontos = new Scanner( System.in );
		float descontos = entradaDescontos.nextFloat();
		
		System.out.println( "Digite o emprestimo que gostaria : ");
		Scanner entradaPossivelEmprestimo = new Scanner( System.in );
		float possivelEmprestimo = entradaPossivelEmprestimo.nextFloat();
		
		
		maximoPossivelEmprestimo = (float)((salarioBruto - descontos)*0.3);
		
		
		if( maximoPossivelEmprestimo > possivelEmprestimo )
		{
			System.out.println("Você poderá fazer um emprestimo");
		}else
		{
			System.out.println("Você não pode fazer um emprestimo");
		}
		
		entradaSalarioBruto.close();			
		entradaDescontos.close();			
		entradaPossivelEmprestimo.close();
*/		
		
		
		
//			String n = JOptionPane.showInputDialog("Digite um número inteiro: ");

		
		
/*		// 39
		int valorSona = 0;
		System.out.println( "Digite o valor para analizar se é numero perfeito: ");
		Scanner entradavalor = new Scanner( System.in );
		int valorDigitado = entradavalor.nextInt();
		
		for (int i = 1; i <= valorDigitado/2; i++)
		{
			if (valorDigitado % i == 0)
				valorSona = i + valorSona;
		}
		if(valorSona == valorDigitado)
			System.out.println("O numero " + valorDigitado + " é perfeito !!!");
		else
			System.out.println("O numero " + valorDigitado + " não é perfeito.");

		entradavalor.close();			


*/		
		
/*		
		// 63
		int valorSona = 0;
		int valorColuna = 0;
		System.out.println( "Digite o número de linhas: ");
		Scanner entradavalor = new Scanner( System.in );
		int quantidadeDeLinhas = entradavalor.nextInt();
		for(int i = 1; i <= quantidadeDeLinhas; i++)
		{
			if( i < 10 )
				System.out.print("0" + i + " ");
			else
				System.out.print( i + " ");
			
			for(int z = 1; z <= i; z++)
			{
				if( z < 10 )
					System.out.print("0" + z + " ");
				else
					System.out.print( z + " ");
			}
			System.out.println("");
		}
		entradavalor.close();			
*/
		
		
//		int matriz[][];
//		matriz = new int[2][4]; // Duas linhas e 4 colunas

		int matriz[][] = new int[2][3]; // Duas linhas e 4 colunas

		int contador = 0;

		int tamanhoX = matriz.length; // tamanho de 2 Colunas

		int tamanhoY = matriz[0].length; // tamanho de 3 linhas
		
		System.out.println("Tamanho da Matriz: "+ tamanhoX + " linhas" + " e " + tamanhoY + " colunas");

/*		// Fixando a Coluna como 0
		for( int i = 0; i < tamanhoX; i++ )
		{
			// Atrubuindo valores nas linhas
			matriz[i][0] = i;
			System.out.print(matriz[i][0] + " ");
		}
		System.out.println("\n");

		// Fixando a Coluna como 1
		for( int i = 0; i < tamanhoX; i++ )
		{
			// Atrubuindo valores nas linhas
			matriz[i][1] = i;
			System.out.print(matriz[i][1] + " ");
		}
		System.out.println("\n");

		// Fixando a Coluna como 2
		for( int i = 0; i < tamanhoX; i++ )
		{
			// Atrubuindo valores nas linhas
			matriz[i][2] = i;
			System.out.print(matriz[i][2] + " ");
		}
		System.out.println("\n");


		// Fixando a linha como 0
		for( int i = 0; i < tamanhoY; i++ )
		{
			// Atrubuindo valor na coluna
			matriz[0][i] = i;
			System.out.print(matriz[0][i] + " ");
		}
		
		System.out.println("\n");

		// Fixando a linha como 1
		for( int i = 0; i < tamanhoY; i++ )
		{
			// Atrubuindo valor na coluna
			matriz[1][i] = i;
			System.out.print(matriz[1][i] + " ");
		}
*/

		// Estruturas aninhadas "l = linhas" e "c = colunas"
		for( int l = 0; l < tamanhoX; l++ )
		{
			for( int c = 0; c < tamanhoY; c++ ) 
			{
				contador++;
				matriz[l][c] = contador;
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println("\n");
		}
		
		
		
		
		
		
//		entradavalor.close();			
		
		
		
		
		
		
		
		
		
		
		
	}

}
