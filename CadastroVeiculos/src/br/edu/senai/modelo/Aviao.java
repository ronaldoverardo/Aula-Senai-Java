package br.edu.senai.modelo;

public class Aviao extends VeiculoAereo 
{
	private int ano;
	private String modelo;
	/**
	 * 
	 */
	public Aviao() 
	{
		super();
	}
	/**
	 * @param cor
	 * @param materialPrincipal
	 * @param meioLocomocao
	 * @param qtPassageiros
	 * @param possuiAsa
	 * @param tipoPropulsao
	 * @param ano
	 * @param modelo
	 */
	public Aviao(String cor, String materialPrincipal, String meioLocomocao, int qtPassageiros, boolean possuiAsa, String tipoPropulsao, int ano, String modelo) 
	{
		super(cor, materialPrincipal, meioLocomocao, qtPassageiros, possuiAsa, tipoPropulsao);
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
