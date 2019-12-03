import java.util.Date;

public class Cadeira 
{
	// Atributos do objeto
	String cor;
	String tipoAcento;
	String fabricante;
	Date dataFabric;
	boolean ativo;
	float peso;

	// M�todo Construtor vazio
	public Cadeira()
	{
		this.ativo = true;
		this.peso = (float)5.0;
		this.cor = "azul";
		this.tipoAcento = "pl�stico";
		this.fabricante = "NewPlastic";
		this.dataFabric = new Date();
	}

	public Cadeira(boolean b)
	{
		this.ativo = b;
	}

	// M�todo Construtor 2 com parametros criado pela IDE do Eclipse depois de eu digitar no Main assim "Cadeira cad2 = new Cadeira( "Vermelho", "Acolchoado","Recaro", new Date(),true, 5 );"
//	Cadeira cad3 = new Cadeira( "Vermelho", "Acolchoado","Recaro", new Date(),true, 5 );
	public Cadeira(String strCor, String strTipo, String strFab, Date date, boolean b, int i)
	{
		this.ativo = b;
		this.peso = i;
		this.cor = strCor;
		this.tipoAcento = strTipo;
		this.fabricante = strFab;
		this.dataFabric = date;
	}

	
	// m�todo que 'desativa' o objeto em quest�o (void pois n�o tem retorno de algo)
	public void quebrar()
	{
		this.ativo = false;
	}

	// m�todo que retorna a data de fabrica��o do objeto (Date pois tem retorno de algo)
	public Date emitirDataFabric()
	{
		return(this.dataFabric);
	}

	// m�todo que retorna o fabricante do objeto
	public String retornaFabricante()
	{
		return(this.fabricante);
	}
	
}
