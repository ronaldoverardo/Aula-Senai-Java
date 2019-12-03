package br.edu.senai.modelo;

public class Funcionario extends Pessoa  
{

	private double salario;
	private String setor;
	private String matricula;
	
	// Metodo construtor vazio
	public Funcionario() 
	{
		super();
	}

	// Metodo construtor com os campos do pai e do filho
	/**
	 * @param nome digite o nome da pessoa
	 * @param idade digite a idade da pessoa
	 * @param cPF
	 * @param salario
	 * @param setor
	 * @param matricula
	 */
	public Funcionario(String nome, int idade, String cPF, double salario, String setor, String matricula) 
	{
		super(nome, idade, cPF);
		this.salario = salario;
		this.setor = setor;
		this.matricula = matricula;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	public String getSetor() 
	{
		return setor;
	}

	public void setSetor(String setor) 
	{
		this.setor = setor;
	}

	public String getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}
	
	// Sobreposição de Métodos
	// Com a palavra Override é para ser usada quando preciso fazer sobreposição de métodos
	@Override
	public void envelhecer()
	{
		this.idade++;
		System.out.println("Você ficou mais velho, (Sábio) !!");
	}
	
	
	
	
}
