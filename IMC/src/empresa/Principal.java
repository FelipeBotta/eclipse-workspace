package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int peso;
		double altura;
		
		System.out.println("Digite seu Peso e sua Altura: ");
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O seu IMC: %.2f ", imc);
	}
	
}
