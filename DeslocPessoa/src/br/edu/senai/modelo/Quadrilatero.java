package br.edu.senai.modelo;

public abstract class Quadrilatero 
{
	private int tamanhoX;
	private int tamanhoY;

	public Quadrilatero() 
	{
		super();
	}

	/**
	 * @param tamanhoX
	 * @param tamanhoY
	 */
	public Quadrilatero(int tamanhoX, int tamanhoY) 
	{
		super();		// Chama o construtor da classe pai
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
	}

	public int getTamanhoX() 
	{
		return tamanhoX;
	}

	public void setTamanhoX(int tamanhoX) 
	{
		this.tamanhoX = tamanhoX;
	}

	public int getTamanhoY() 
	{
		return tamanhoY;
	}

	public void setTamanhoY(int tamanhoY) 
	{
		this.tamanhoY = tamanhoY;
	}

	
	
	

}