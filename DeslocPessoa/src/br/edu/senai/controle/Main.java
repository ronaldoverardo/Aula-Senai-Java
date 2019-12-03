package br.edu.senai.controle;

import br.edu.senai.modelo.Ambiente;
import br.edu.senai.modelo.Objeto;
import br.edu.senai.modelo.Pessoa;
import br.edu.senai.modelo.Quadrilatero;
import br.edu.senai.modelo.Volume;

public class Main 
{

	public static void main(String[] args) 
	{
		Ambiente amb = new Ambiente(15, 20);

		Volume.setAmb1(amb);
		
		Pessoa pess1 = new Pessoa(1, 1, "Ronaldo", 0, 0) ;
		
		pess1.deslocar(-10, 0);
		
		System.out.println("O personagem está na posição x: " + pess1.getPosX() + " posição y:" + pess1.getPosY());

		

	}

}
