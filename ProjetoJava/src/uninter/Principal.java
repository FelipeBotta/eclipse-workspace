package uninter;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		int hora;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Alo pessoal");
		
		System.out.println("Que horas são ? ");
		
		hora = teclado.nextInt();
		
		if(hora < 12) {
			System.out.println("Entao, Bom dia !");
		}else if (hora > 12 && hora < 18){
			System.out.println("Entao, Boa tarde !");
			
		}else{
			System.out.println("Entao, Boa noite !");
		}
	}
		
	}
	
