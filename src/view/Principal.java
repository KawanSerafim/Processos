package view;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		try {
			
			int opc = 0;
			
			do {
				
				opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Sistemas Operacionais 1]\n\n"
						+ "1 - Exercicio 1.\n"
						+ "2 - Exercicio 2.\n"
						+ "3 - Exercicio 3.\n"
						+ "4 - Desafio.\n"
						+ "0 - Sair."));
				
				switch(opc) {
				
					case 1:
						
						Redes redes = new Redes();
						redes.menu();
						break;
						
					case 2:
						
						Kill kill = new Kill();
						kill.menu();
						break;
						
					case 3:
						
						Distro distro = new Distro();
						distro.menu();
						break;
						
					case 4:
						
						
						break;
						
					case 0:
						
						break;
						
					default:
						
						JOptionPane.showMessageDialog(null, "Input inválido");
					
				}
				
				
			} while(opc != 0);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}