package br.edu.senai.modelo;

public class Veiculo 
{
	private String cor;
	private String materialPrincipal;
	private String meioLocomocao;
	private int qtPassageiros;
	protected int deslocamento;

	public Veiculo() 
	{
		super();
	}

	/**
	 * @param cor
	 * @param materialPrincipal
	 * @param meioLocomocao
	 * @param qtPassageiros
	 * @param deslocamento
	 */
	public Veiculo(String cor, String materialPrincipal, String meioLocomocao, int qtPassageiros, int deslocamento) 
	{
		super();
		this.cor = cor;
		this.materialPrincipal = materialPrincipal;
		this.meioLocomocao = meioLocomocao;
		this.qtPassageiros = qtPassageiros;
		this.deslocamento = deslocamento;
	}

	public String getCor() 
	{
		return cor;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}

	public String getMaterialPrincipal() 
	{
		return materialPrincipal;
	}

	public void setMaterialPrincipal(String materialPrincipal) 
	{
		this.materialPrincipal = materialPrincipal;
	}

	public String getMeioLocomocao() 
	{
		return meioLocomocao;
	}

	public void setMeioLocomocao(String meioLocomocao) 
	{
		this.meioLocomocao = meioLocomocao;
	}

	public int getQtPassageiros() 
	{
		return qtPassageiros;
	}

	public void setQtPassageiros(int qtPassageiros) 
	{
		this.qtPassageiros = qtPassageiros;
	}
	
	
	public void deslocar()
	{
		this.deslocamento++;
	}

	public int getDeslocamento() 
	{
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) 
	{
		this.deslocamento = deslocamento;
	}


	
}
