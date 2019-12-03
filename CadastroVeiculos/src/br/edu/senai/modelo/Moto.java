package br.edu.senai.modelo;

public class Moto extends VeiculoTerrestre 
{
	private int ano;
	private String modelo;
	
	public Moto() 
	{
		super();
	}

	/**
	 * @param cor
	 * @param materialPrincipal
	 * @param meioLocomocao
	 * @param qtPassageiros
	 * @param nRodas
	 * @param ano
	 * @param modelo
	 */
	public Moto(String cor, String materialPrincipal, String meioLocomocao, int qtPassageiros, int nRodas, int ano, String modelo) 
	{
		super(cor, materialPrincipal, meioLocomocao, qtPassageiros, nRodas);
		this.ano = ano;
		this.modelo = modelo;
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno(int ano) 
	{
		this.ano = ano;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public void deslocar(int metros)
	{
		this.deslocamento = metros;
	}	

	
	
}
