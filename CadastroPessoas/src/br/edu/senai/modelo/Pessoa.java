package br.edu.senai.modelo;

public class Pessoa 
{
	private String nome;
	protected int idade;
	private String CPF;
	
	public Pessoa() 
	{
		super();
	}

	public Pessoa(String nome, int idade, String cPF) 
	{
		super();
		
		this.nome = nome;
		this.idade = idade;
		CPF = cPF;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public String getCPF() 
	{
		return CPF;
	}

	public void setCPF(String cPF) 
	{
		CPF = cPF;
	}

	
	public void envelhecer()
	{
		this.idade++;
	}
	
	
	
}
