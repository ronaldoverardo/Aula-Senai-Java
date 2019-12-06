package interfaces;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import modelos.User;

import java.io.FileReader;
import java.io.BufferedReader;


//espaco que manipula e fica responsavel de incerir as variaveis no arquivo txt .

public class FileTestUser {
    

    public static void escrever(User user) throws IOException {
        File dir = new File("C:\\Users\\Public\\tmp");
        File arq = new File(dir, "texte.txt");
//passando para o construtor qual arquivo vamos manipular.sem apagar o que j� existe.
        //Devemos passar no construtor do FileWriter qual arquivo
		// vamos manipular.
		// Esse construtor aceita dois tipos de par�metros,
		// File ou String.
		//O par�metro true indica que reescrevemos no arquivo
		// sem apagar o que j� existe.
		// O false apagaria o conte�do do arquivo e escreveria
		// o novo conte�do.
		// Se n�o usar o 2� par�metro, ele por padr�o ser� false.
		//O mais importante, essa linha abre o fluxo do arquivo 
 FileWriter fileWriter = new FileWriter(arq, true);// n�o vou utilizar pq j� tenho o aquivo criado 

		//Agora vamos usar a classe PrintWriter para escrever
		//fisicamente no arquivo.
		//Precisamos passar o objeto FileReader em seu construtor
		PrintWriter printWriter = new PrintWriter(fileWriter);

		
		// que nos permite escrever linha a linha no arquivo txt,cada vez que criar um novo item em user 
		//e main � nescessario colocar um printWriter.println("ghujhujtyutyu");
	
		
		printWriter.println(user.getId());
		printWriter.println(user.getNome());
		printWriter.println(user.getObservacao());
		printWriter.println(user.getPlaca());
		//o m�todo flush libera a escrita no arquivo
		printWriter.flush();

		//No final precisamos fechar o arquivo
		printWriter.close();

    }
    private static PrintWriter PrintWriter(java.io.FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}

	private static FileWriter FileWriter(File arq, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void ler() {
    	File dir = new File("C:\\Users\\Public\\tmp texte");
        File ard = new File(dir, "C:\\Users\\Public\\tmp texte");

        try {
            //Indicamos o arquivo que ser� lido
            FileReader fileReader = new FileReader(dir);

            //Criamos o objeto bufferReader que nos
            // oferece o m�todo de leitura readLine()
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //String que ir� receber cada linha do arquivo
            String linha = "";

            //Fazemos um loop linha a linha no arquivo,
            // enquanto ele seja diferente de null.
            //O m�todo readLine() devolve a linha na
            // posicao do loop para a variavel linha.
            while ( ( linha = bufferedReader.readLine() ) != null) {
            //Aqui imprimimos a linha
            System.out.println(linha);
        }
    		//liberamos o fluxo dos objetos ou fechamos o arquivo
            fileReader.close();
            bufferedReader.close();
    	} catch (IOException e) {
        	e.printStackTrace();
        }
    }
}
