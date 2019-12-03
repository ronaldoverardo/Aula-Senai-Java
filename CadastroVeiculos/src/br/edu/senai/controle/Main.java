package br.edu.senai.controle;
import java.util.Scanner;
import br.edu.senai.modelo.Aviao;
import br.edu.senai.modelo.Carro;
import br.edu.senai.modelo.Helicoptero;
import br.edu.senai.modelo.Moto;
import br.edu.senai.modelo.Veiculo;
import br.edu.senai.modelo.VeiculoAereo;
import br.edu.senai.modelo.VeiculoTerrestre;

public class Main 
{

	public static void main(String[] args) 
	{
		int quantidadeDeslocamento = 0;
		
		Veiculo veic1 = new Veiculo();
		VeiculoTerrestre veicT1 = new VeiculoTerrestre();
		VeiculoAereo veicA1 = new VeiculoAereo();
		Carro car1 = new Carro();
		Moto mot1 = new Moto();
		Aviao air1 = new Aviao();
		Helicoptero heli1 = new Helicoptero();

		Scanner entrada = new Scanner( System.in );

		for(;;)
		{
			System.out.print("Digite o numero de Iterações: ");
			quantidadeDeslocamento = entrada.nextInt();
			for(int i = 0; i <= quantidadeDeslocamento; i++)
			{
				veic1.deslocar();
				car1.deslocar(quantidadeDeslocamento);;
				mot1.deslocar(quantidadeDeslocamento);
			}
			System.out.println("Deslocamento do Veiculo foi: " + veic1.getDeslocamento());
			System.out.println("Deslocamento do Carro foi: " + car1.getDeslocamento());
			System.out.println("Deslocamento do Moto foi: " + mot1.getDeslocamento());
		
		}
		

	}

}
