package br.edu.senai.controle;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
        JFileChooser escolhedor = new JFileChooser();

        escolhedor.setFileFilter(new FileNameExtensionFilter("Microsoft Excel Files", "xls", "xlsx")); 
        escolhedor.setAcceptAllFileFilterUsed(false);
        
        int opcaoEscolhida = escolhedor.showOpenDialog(null); //Janela para abrir um arquivo
        
        if(opcaoEscolhida == JFileChooser.APPROVE_OPTION) 
        {
            //Código pra caso o usuário tenha escolhido abrir um arquivo
        	// Mosta o nome do arquivo Excel lido
        	System.out.println(escolhedor.getSelectedFile().getName());
        	
        	
        	

		
        }		
		
		
	}

}
