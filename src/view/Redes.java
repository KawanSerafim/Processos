package view;

import controller.RedesController;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Redes {

	public void menu() throws IOException {
		
		int opc = 0;
		RedesController redes = new RedesController();
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Exercicio 1]\n\n"
					+ "1 - IP.\n"
					+ "2 - Ping.\n"
					+ "0 - Sair."));
			
			switch(opc) {
			
				case 1:
					
					JOptionPane.showMessageDialog(null, "O resultado encontrado foi:\n" + redes.ip());
					break;
					
				case 2:
					
					System.out.println("Aguarde...");
					JOptionPane.showMessageDialog(null, "O resultado encontrado foi:\n" + redes.ping());
					break;
					
				case 0:
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "Input invalido. Digite novamente.");
				
			}
			
		} while(opc != 0);
		
	}
	
}