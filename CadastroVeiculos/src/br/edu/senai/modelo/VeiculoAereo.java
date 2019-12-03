package br.edu.senai.modelo;

public class VeiculoAereo extends Veiculo 
{
	private boolean possuiAsa;
	private String tipoPropulsao;
	
	public VeiculoAereo() 
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
	 * @param qt
	 */
	public VeiculoAereo(String cor, String materialPrincipal, String meioLocomocao, int qtPassageiros, boolean possuiAsa, String tipoPropulsao) 
	{
		super(cor, materialPrincipal, meioLocomocao, qtPassageiros, qtPassageiros);
		this.possuiAsa = possuiAsa;
		this.tipoPropulsao = tipoPropulsao;
	}

	public boolean isPossuiAsa() 
	{
		return possuiAsa;
	}

	public void setPossuiAsa(boolean possuiAsa) 
	{
		this.possuiAsa = possuiAsa;
	}

	public String getTipoPropulsao() 
	{
		return tipoPropulsao;
	}

	public void setTipoPropulsao(String tipoPropulsao) 
	{
		this.tipoPropulsao = tipoPropulsao;
	}

	
	
	
}
