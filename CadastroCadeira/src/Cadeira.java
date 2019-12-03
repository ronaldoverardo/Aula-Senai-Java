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

	// Método Construtor vazio
	public Cadeira()
	{
		this.ativo = true;
		this.peso = (float)5.0;
		this.cor = "azul";
		this.tipoAcento = "plástico";
		this.fabricante = "NewPlastic";
		this.dataFabric = new Date();
	}

	public Cadeira(boolean b)
	{
		this.ativo = b;
	}

	// Método Construtor 2 com parametros criado pela IDE do Eclipse depois de eu digitar no Main assim "Cadeira cad2 = new Cadeira( "Vermelho", "Acolchoado","Recaro", new Date(),true, 5 );"
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

	
	// método que 'desativa' o objeto em questão (void pois não tem retorno de algo)
	public void quebrar()
	{
		this.ativo = false;
	}

	// método que retorna a data de fabricação do objeto (Date pois tem retorno de algo)
	public Date emitirDataFabric()
	{
		return(this.dataFabric);
	}

	// método que retorna o fabricante do objeto
	public String retornaFabricante()
	{
		return(this.fabricante);
	}
	
}
