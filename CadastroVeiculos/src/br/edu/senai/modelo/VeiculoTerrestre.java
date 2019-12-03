package br.edu.senai.modelo;

public class VeiculoTerrestre extends Veiculo 
{
	private int nRodas;
	private String tipo; // se é um carro ou moto

	public VeiculoTerrestre() 
	{
		super();
	}

	/**
	 * @param cor
	 * @param materialPrincipal
	 * @param meioLocomocao
	 * @param qtPassageiros
	 * @param nRodas
	 */
	public VeiculoTerrestre(String cor, String materialPrincipal, String meioLocomocao, int qtPassageiros, int nRodas)
	{
		super(cor, materialPrincipal, meioLocomocao, qtPassageiros, nRodas);
		this.nRodas = nRodas;
	}

	public int getnRodas() 
	{
		return nRodas;
	}

	public void setnRodas(int nRodas) 
	{
		this.nRodas = nRodas;
	}




	
	

}
