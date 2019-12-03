
public class Calculadora 
{
	private double numeralUm;
	private double numeralDois;
	private String operacao;
	private double resultado;
	
	// Método construtor vazio
	public Calculadora()
	{
		
	}
	// Método para conseguir atribuir todos os valores para a calculadora
	public Calculadora(double numeralUm, double numeralDois, String operacao, double resultado) 
	{
		super();
		this.numeralUm = numeralUm;
		this.numeralDois = numeralDois;
		this.operacao = operacao;
		this.resultado = resultado;
	}
	// Método para escrever o primeiro numero
	public void setNumeralUm(double numeralUm) 
	{
		this.numeralUm = numeralUm;
	}
	// Método para escrever o segundo numero
	public void setNumeralDois(double numeralDois) 
	{
		this.numeralDois = numeralDois;
	}
	// Método para ler a operação
	public String getOperacao() 
	{
		return operacao;
	}
	// Método para escrever a operação
	public void setOperacao(String operacao) 
	{
		this.operacao = operacao;
	}
	// Método para somar dois numeros
	private void somar()
	{
		this.resultado = (double)(this.numeralUm + this.numeralDois);
	}
	// Método para subtrair dois numeros
	private void subtrair()
	{
		this.resultado = (double)(this.numeralUm - this.numeralDois);
	}
	// Método para multiplicar dois numeros
	private void multiplicar()
	{
		this.resultado = (double)(this.numeralUm * this.numeralDois);
	}
	// Método para dividir dois numeros
	private void dividir()
	{
		this.resultado = (double)(this.numeralUm / this.numeralDois);
	}

	// Método para ler o resultado da conta
	public double getResultado()
	{
		if( this.operacao.equals("+") )
		{
			this.somar();
		}else if( this.operacao.equals("-") )
		{
			this.subtrair();
		}else if( this.operacao.equals("*") )
		{
			this.multiplicar();
		}else if( this.operacao.equals("/") )
		{
			this.dividir();
		}
		return this.resultado;
	}
	
	
}
