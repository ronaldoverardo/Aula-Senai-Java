package br.edu.senai.modelo;

public class Cliente extends Pessoa 
{
	private double cadastro;
	private String categoria;
	private int ncompras;
	private boolean ativo;
	private Funcionario funcFav;
	
	public Cliente() 
	{
		super();
	}

	/**
	 * @param nome
	 * @param idade
	 * @param cPF
	 * @param cadastro
	 * @param categoria
	 * @param ncompras
	 * @param ativo
	 * @param funcFav
	 */
	public Cliente(String nome, int idade, String cPF, double cadastro, String categoria, int ncompras, boolean ativo, Funcionario funcFav) 
	{
		super(nome, idade, cPF);
		this.cadastro = cadastro;
		this.categoria = categoria;
		this.ncompras = ncompras;
		this.ativo = ativo;
		this.funcFav = funcFav;
	}

	public double getCadastro() 
	{
		return cadastro;
	}

	public void setCadastro(double cadastro) 
	{
		this.cadastro = cadastro;
	}

	public String getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}

	public int getNcompras() 
	{
		return ncompras;
	}

	public void setNcompras(int ncompras) 
	{
		this.ncompras = ncompras;
	}

	public boolean isAtivo() 
	{
		return ativo;
	}

	public void setAtivo(boolean ativo) 
	{
		this.ativo = ativo;
	}

	public Funcionario getFuncFav() 
	{
		return funcFav;
	}

	public void setFuncFav(Funcionario funcFav) 
	{
		this.funcFav = funcFav;
	}


	
	
	
}
