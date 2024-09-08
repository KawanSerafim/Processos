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
					
					System.out.println(kill.listaProcesso());
					break;
					
				case 2:
					
					String PID = JOptionPane.showInputDialog("Digite o PID do processo.");
					kill.matarProcesso(opc, PID);
					break;
					
				case 3:
					
					String nome = JOptionPane.showInputDialog("Digite o nome do processo.");
					kill.matarProcesso(opc, nome);
					break;
					
				case 0:
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "Input inválido");
				
			}
			
		} while(opc != 0);
		
	}
	
}
