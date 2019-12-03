package br.edu.senai.modelo;

public class Pessoa extends Volume implements PessoaInterface 
{
	private String nome;
	private int posX, posY;
	
	
	/**
	 * 
	 */
	public Pessoa() 
	{
		super();
	}


	/**
	 * @param tamanhoX
	 * @param tamanhoY
	 * @param nome
	 * @param posX
	 * @param posY
	 */
	public Pessoa(int tamanhoX, int tamanhoY, String nome, int posX, int posY) 
	{
		super(tamanhoX, tamanhoY);
		this.nome = nome;
		this.posX = posX;
		this.posY = posY;
	}


	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public int getPosX() 
	{
		return posX;
	}


	public void setPosX(int posX) 
	{
		this.posX = posX;
	}


	public int getPosY() 
	{
		return posY;
	}


	public void setPosY(int posY) 
	{
		this.posY = posY;
	}

	// Métodos criados manualmente:

	public void deslocar(int deslocX, int deslocY)
	{
//		this.posX = this.posX + deslocX;
//		this.posY = this.posY + deslocY;
		
		if(this.verificarMovValido(deslocX, deslocY))
		{
			this.posX = this.posX + deslocX;
			this.posY = this.posY + deslocY;
		}else
		{
			System.out.println("Posição X,Y fora da faixa");
		}
		
	}

	
	private boolean verificarMovValido(int testeX, int testeY)
	{
		if( (0 <= testeX) && (testeX <= Volume.getAmb1().getTamanhoX()) )
		{
			if( (0 <= testeY) && (testeY <= Volume.getAmb1().getTamanhoY()) )
			{
				return true;
			}
		}
		return false;
	}
	
	

}
