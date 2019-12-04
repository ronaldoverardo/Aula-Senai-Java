import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class Main 
{

	public static void main(String[] args) 
	{
        JFileChooser escolhedor = new JFileChooser();

        escolhedor.setFileFilter(new FileFilter() 
        {
            @Override
            public String getDescription() 
            {
//              return "Somente arquivos Excel .XLSX ou .XLS"; //Exibe essa mensagem
              return "*.xlsx"; //Exibe essa mensagem
            }
            
            @Override
            public boolean accept(File arq) 
            {
//              return (arq.getName().endsWith(".txt") || arq.isDirectory());
//              return (arq.getName().endsWith(".XLSX ou .XLS") || arq.isDirectory());
              return (arq.getName().endsWith("*.XLSX") || arq.isDirectory());
            }
        });

        int opcaoEscolhida = escolhedor.showOpenDialog(null); //Janela para abrir um arquivo

        if(opcaoEscolhida == JFileChooser.APPROVE_OPTION) 
        {
            //C�digo pra caso o usu�rio tenha escolhido abrir um arquivo
        }
		
		
	}

}
