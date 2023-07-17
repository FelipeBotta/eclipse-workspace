package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		
		Scanner sc = new Scanner(System.in);
		
		while (true){
		
		System.out.println("COFRINHO: \n"
				+ "1 - Adicionar Moeda \n"
				+ "2 - Remover Moeda \n"
				+ "3 - Listar Moedas \n"
				+ "4 - Calcular total convertido para Real \n"
				+ "0 - Encerrar \n");
		
		int indice = sc.nextInt();
		
		if (indice == 1){
			
			System.out.println("Digite a moeda: \n 1 - Euro \n 2 - Dolar \n 3 - Real");
			
		int sub  = sc.nextInt();
		switch (sub) {
		case 1:
			
			System.out.println("Digite o valor: ");
			
			double valor = sc.nextDouble();
			
			Euro euro = new Euro(valor);
			
			cofrinho.adicionar(euro);
			
			break;
		
		case 2:
			
			System.out.println("Digite o valor: ");
			
			double valor1 = sc.nextDouble();
			
			Dolar dolar = new Dolar(valor1);
			
			cofrinho.adicionar(dolar);
			
			break;
			
		case 3:
			
			System.out.println("Digite o valor: ");
			
			double valor2 = sc.nextDouble();
			
			Real real = new Real(valor2);
			
			cofrinho.adicionar(real);
			
			break;
		
		default:
			
			System.out.println("Digite uma opção valida");
			
			
		}
			
		
		if (indice == 2){
			
			System.out.println("Digite a moeda: \n 1 - Euro \n 2 - Dolar \n 3 - Real");
			
		int sub1 = sc.nextInt();
		
		switch(sub1) {
		
		case 1:
			
			System.out.println("Digite o valor: ");
			
			double valor = sc.nextDouble();
			
			Euro euro = new Euro(valor);
			
			cofrinho.remover(euro);
			
			break;
		
		case 2:
			
			System.out.println("Digite o valor: ");
			
			double valor1 = sc.nextDouble();
			
			Dolar dolar = new Dolar(valor1);
			
			cofrinho.remover(dolar);
			
			break;
			
		case 3:
			
			System.out.println("Digite o valor: ");
			
			double valor2 = sc.nextDouble();
			
			Real real = new Real(valor2);
			
			cofrinho.remover(real);
			
			break;
		
		default:
			
			System.out.println("Digite uma opção valida");
		
		}
		 
		 
		 
		 
		}
		
			
			
		}
		
		if (indice == 0){
			break;
		}
		}
		
		
	}

}
