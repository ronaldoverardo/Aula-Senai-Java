public class Pessoa 
{
	// Atributos do objeto
	private String nome;
	private int idade;
	private float altura;
	private String cpf;

	// Locaslização no plano carteziano
	int localX;
	int localY;

	// Método construtor vazio
	public Pessoa()
	{
		this.nome = "Ronaldo Verardo";
		this.idade = 43;
		this.altura = (float)1.79;
		this.cpf = "88417700072";
		this.localX = 0;
		this.localY = 0;
	}
	
	// Metodos para criar
	public Pessoa(String nome, int idade, float altura, String cpf, int localX, int localY)
	{
		this.nome = nome;
		// Evita idade qualquer numero fora da faixa etária de qq pessoa
		if(idade < 0)
		{
			this.idade = 0;
		}else
		{
			if(idade > 150)
				this.idade = 0;
			else
			this.idade = idade;
		}
//		this.idade = idade;
		this.altura = (float)altura;
		this.cpf = this.validaCPF(cpf);
		this.localX = 0;
		this.localY = 0;
		
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = this.validaCPF(cpf);
	}

	public int getLocalX() 
	{
		return localX;
	}

	public void setLocalX(int localX) 
	{
		this.localX = localX;
	}

	public int getLocalY() 
	{
		return localY;
	}

	public void setLocalY(int localY) 
	{
		this.localY = localY;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
//		this.nome = nome;
		// Altera o nome de modo a primeira letra fique maiscula
		this.nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public float getAltura() 
	{
		return altura;
	}

	public void setAltura(float altura) 
	{
		this.altura = altura;
	}

	// método privado para validar quantidade de caracteres no cpf
	private String validaCPF(String cpf2)
	{
		if(cpf2.toCharArray().length == 11)
			return cpf2;
		else
		{
			System.out.println("CPF inválido");
			return null;
		}
	}
	
	// Envelhecer
	// Método para incrementar a idade do objrto pessoa
	public void envelhecer()
	{
		this.idade++;
	}

	// Obter nome
	public String obterNome()
	{
		return(this.nome);
	}

	// Trrocar nome
	public void trocaNome(String nomeParaTroca)
	{
		this.nome = nomeParaTroca;

		
/*		char vetorNomePessoa[];
		
		for(int i = 0; i < nomeParaTroca.length() ; i++)
		{
			vetorNomePessoa = nomeParaTroca.toCharArray();; 

		}
*/		
		
	}

	// Trocar CPF
	public String trocaCPF(String cpfParaTroca)
	{
		return(this.cpf = cpfParaTroca);
	}

	
}
