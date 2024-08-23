package view;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		try {
		
			int opc = 0;
			Scanner scan = new Scanner(System.in);
			
			do {
				
				System.out.print("\n\n[Processos - Aula 3: Sistemas Operacionais 1]\n\n"
						+ "1 - Exercicio 1.\n"
						+ "2 - Exercicio 2.\n"
						+ "3 - Exercicio 3.\n"
						+ "4 - Desafio.\n"
						+ "0 - Sair.\n\n"
						+ "Input: ");
				opc = scan.nextInt();
				
				switch(opc) {
				
					case 1:
						
						Redes redes = new Redes();
						redes.menu();
						
					case 2:
						
						System.out.print("");
						break;
						
					case 3:
						
						System.out.print("");
						break;
						
					case 4:
						
						System.out.print("");
						break;
						
					case 0:
						
						break;
						
					default:
						
						System.out.println("\nInput invalido. Digite novamente.\n\n");
					
				}
				
				
			} while(opc != 0);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}