package view;

import java.io.IOException;
import javax.swing.JOptionPane;
import controller.DistroController;

public class Distro {

public void menu() throws IOException {
		
		int opc = 0;
		DistroController distro = new DistroController();
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Exercicio 3]\n\n"
					+ "1 - Exibir Distribuição.\n"
					+ "0 - Sair."));
			
			switch(opc) {
			
				case 1:
					
					JOptionPane.showMessageDialog(null, distro.exibeDistro());
					break;
					
				case 0:
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "Input inválido");
				
			}
			
		} while(opc != 0);
		
	}
	
}
