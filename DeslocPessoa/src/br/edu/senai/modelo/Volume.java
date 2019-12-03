package br.edu.senai.modelo;

public abstract class Volume extends Quadrilatero
{
	private static Ambiente amb1;

	/**
	 * 
	 */
	public Volume() 
	{
		super();
	}


	/**
	 * @param tamanhoX
	 * @param tamanhoY
	 */
	public Volume(int tamanhoX, int tamanhoY) 
	{
		super(tamanhoX, tamanhoY);
	}


	public static Ambiente getAmb1() 
	{
		return amb1;
	}

	public static void setAmb1(Ambiente amb1) 
	{
		Volume.amb1 = amb1;
	}
	
	
	
}
