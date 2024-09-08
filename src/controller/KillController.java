package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class KillController {
	
	public KillController() {
		
		super();
		
	}
	
	private String os() {
		
		return System.getProperty("os.name");
		
	}
	
	private void procExec(String comando, int tipo) throws IOException {
		
		Process p = Runtime.getRuntime().exec(comando);
		
		if(tipo == 0) {
			
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
				
			while(linha != null) {
					
				System.out.println(linha);
				linha = buffer.readLine();
					
			}
				
			fluxo.close();
			leitor.close();
			buffer.close();
			
		}
		
	}
	
	public void listaProcesso() throws IOException {
		
		if(os().contains("Windows")) {
			
			procExec("TASKLIST /FO TABLE", 0);
			
		} else if(os().contains("Linux")) {
			
			procExec("ps -ef", 0);
			
		}
		
	}
	
}
