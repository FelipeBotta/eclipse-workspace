package trabalho;

import java.util.Scanner; //importando a classe scanner para ser utilizada a entrada de informações no sistema.

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho(); //aqui estamos criando um novo cofrinho, visto que já foi criado a classe anteriormente.
		
		Scanner sc = new Scanner(System.in); //instanciando o objeto scanner.
		
		while (true){ //foi criado um laço de repetição para que o programe rode em looping até ser digitado o 0.
		
		System.out.println("COFRINHO: \n"
				+ "1 - Adicionar Moeda \n"
				+ "2 - Remover Moeda \n"
				+ "3 - Listar Moedas \n"
				+ "4 - Calcular total convertido para Real \n"
				+ "0 - Encerrar \n"); //output do menu principal do cofrinho.
		
		int indice = sc.nextInt(); //recebendo qual operação o usuario deseja realizar.
		
		if (indice == 1){//quando selecionado o 1, o programa irá entrar na condicional para verificar qual tipo de moeda e qtd a ser depositada.
			
			System.out.println("Digite a moeda: \n 1 - Euro \n 2 - Dolar \n 3 - Real");
			
		int sub  = sc.nextInt();
		switch (sub) { //utilizei o switch case como uma boa pratica e não ficar repetindo if/else.
		case 1:
			
			System.out.println("Digite o valor: ");
			
			double valor = sc.nextDouble();
			
			Euro euro = new Euro(valor);
			
			cofrinho.adicionar(euro);//funcao criada para adicionar os dados na arraylist.
			
			break;
		
		case 2:
			
			System.out.println("Digite o valor: ");
			
			double valor1 = sc.nextDouble();
			
			Dolar dolar = new Dolar(valor1);
			
			cofrinho.adicionar(dolar);//funcao criada para adicionar os dados na arraylist.
			break;
			
		case 3:
			
			System.out.println("Digite o valor: ");
			
			double valor2 = sc.nextDouble();
			
			Real real = new Real(valor2);
			
			cofrinho.adicionar(real);//funcao criada para adicionar os dados na arraylist.
			
			break;
		
		default:
			//como default indicamos que o usuario digitou uma opção inválida
			System.out.println("Digite uma opção valida");
			
			
		}
			
		}
		
		if (indice == 2){//aqui ocorre o mesmo caso do 1 porém ao inves do deposito é feito a retirada.
			
			System.out.println("Digite a moeda: \n 1 - Euro \n 2 - Dolar \n 3 - Real");
			
		int sub1 = sc.nextInt();
		
		switch(sub1) {//switch case utilizado pelo mesmo motivo do 1 item do menu.
		
		case 1:
			
			System.out.println("Digite o valor: ");
			
			double valor = sc.nextDouble();
			
			Euro euro = new Euro(valor);
			
			cofrinho.remover(euro); //funcao criada para remover os dados na arraylist.
			
			break;
		
		case 2:
			
			System.out.println("Digite o valor: ");
			
			double valor1 = sc.nextDouble();
			
			Dolar dolar = new Dolar(valor1);
			
			cofrinho.remover(dolar);//funcao criada para remover os dados na arraylist.
			
			break;
			
		case 3:
			
			System.out.println("Digite o valor: ");
			
			double valor2 = sc.nextDouble();
			
			Real real = new Real(valor2);
			
			cofrinho.remover(real);//funcao criada para remover os dados na arraylist.
			
			break;
		
		default:
			
			System.out.println("Digite uma opção valida");
		
		}
		}
		
		if (indice == 3) {
			cofrinho.listagemMoedas();//funcao criada para listar a arraylist
		}
		
		if (indice == 4) {
			cofrinho.totalConvertido();//funcao criada para converter as moedas para real
		}
		
		if (indice == 0){//condicional para encerrar o laço de repetição criado no while no inicio do código.
			break;
		}
		}
		
		
	}
}
