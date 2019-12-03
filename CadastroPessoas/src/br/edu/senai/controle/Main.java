package br.edu.senai.controle;
import br.edu.senai.modelo.Cliente;
import br.edu.senai.modelo.Funcionario;
import br.edu.senai.modelo.Pessoa;

public class Main 
{

	public static void main(String[] args) 
	{
		// Instanciar 2 funcionarios e 2 clientes (lembrar quem deve ser instanciado antes de quem)

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		
		func1.setNome("Paulo Ricardo");
		
		cli1.envelhecer();
		
		func1.envelhecer();

		
		
		
		
		
	}

}
