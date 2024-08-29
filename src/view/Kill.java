package view;

import java.io.IOException;
import java.util.Scanner;

public class Kill {

	public void menu() throws IOException {
		
		int opc = 0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			
			System.out.print("\n\n[Processos - Aula 3: Exercicio 2]\n\n"
					+ "1 - .\n"
					+ "2 - .\n"
					+ "0 - Sair.\n\n"
					+ "Input: ");
			opc = scan.nextInt();
			
			switch(opc) {
			
				case 1:
					
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
