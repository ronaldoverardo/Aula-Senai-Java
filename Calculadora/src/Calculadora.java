
public class Calculadora 
{
	private double numeralUm;
	private double numeralDois;
	private String operacao;
	private double resultado;
	
	// M�todo construtor vazio
	public Calculadora()
	{
		
	}
	// M�todo para conseguir atribuir todos os valores para a calculadora
	public Calculadora(double numeralUm, double numeralDois, String operacao, double resultado) 
	{
		super();
		this.numeralUm = numeralUm;
		this.numeralDois = numeralDois;
		this.operacao = operacao;
		this.resultado = resultado;
	}
	// M�todo para escrever o primeiro numero
	public void setNumeralUm(double numeralUm) 
	{
		this.numeralUm = numeralUm;
	}
	// M�todo para escrever o segundo numero
	public void setNumeralDois(double numeralDois) 
	{
		this.numeralDois = numeralDois;
	}
	// M�todo para ler a opera��o
	public String getOperacao() 
	{
		return operacao;
	}
	// M�todo para escrever a opera��o
	public void setOperacao(String operacao) 
	{
		this.operacao = operacao;
	}
	// M�todo para somar dois numeros
	private void somar()
	{
		this.resultado = (double)(this.numeralUm + this.numeralDois);
	}
	// M�todo para subtrair dois numeros
	private void subtrair()
	{
		this.resultado = (double)(this.numeralUm - this.numeralDois);
	}
	// M�todo para multiplicar dois numeros
	private void multiplicar()
	{
		this.resultado = (double)(this.numeralUm * this.numeralDois);
	}
	// M�todo para dividir dois numeros
	private void dividir()
	{
		this.resultado = (double)(this.numeralUm / this.numeralDois);
	}

	// M�todo para ler o resultado da conta
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
