package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int palpite;
		int valorCorreto = 10000;
		String msg;
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		
		while (palpite != valorCorreto) {
			
			//Operador tenário utilizado para encutar um If Else
			
			msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais...";
			
			System.out.println(msg);
			
			//If else que seria necessario ao inves do operador tenário
			
			
			/*if(palpite > valorCorreto) {
				System.out.println("Um pouco menos... ");
			}else {
				System.out.println("Um pouco mais... ");
			} */
				System.out.println("Digite outro palpite: ");
				palpite = teclado.nextInt();
		}
		
			System.out.println("Parabens, Acertou !");
		
	}

}
