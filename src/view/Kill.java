package view;

import java.io.IOException;
import javax.swing.JOptionPane;
import controller.KillController;

public class Kill {

	public void menu() throws IOException {
		
		int opc = 0;
		KillController kill = new KillController();
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Exercicio 2]\n\n"
					+ "1 - Listar processos.\n"
					+ "2 - Matar por PID.\n"
					+ "3 - Matar por nome.\n"
					+ "0 - Sair."));
			
			switch(opc) {
			
				case 1:
					
					kill.listaProcesso();
					break;
					
				case 2:
					
					break;
					
				case 0:
					
					break;
					
				default:
					
					System.out.println("\nInput invalido. Digite novamente.\n\n");
				
			}
			
		} while(opc != 0);
		
	}
	
}
