package view;

import controller.RedesController;

import java.io.IOException;
import java.util.Scanner;

public class Redes {

	public void menu() throws IOException {
		
		int opc = 0;
		Scanner scan = new Scanner(System.in);
		RedesController redes = new RedesController();
		
		do {
			
			System.out.print("\n\n[Processos - Aula 3: Exercicio 1]\n\n"
					+ "1 - IP.\n"
					+ "2 - Ping.\n"
					+ "0 - Sair.\n\n"
					+ "Input: ");
			opc = scan.nextInt();
			
			switch(opc) {
			
				case 1:
					
					System.out.println(redes.ip());
					break;
					
				case 2:
					
					System.out.println("");
					break;
					
				case 0:
					
					break;
					
				default:
					
					System.out.println("\nInput invalido. Digite novamente.\n\n");
				
			}
			
		} while(opc != 0);
		
	}
	
}