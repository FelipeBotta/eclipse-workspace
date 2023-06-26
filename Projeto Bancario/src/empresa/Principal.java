package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta (111,"Luis",2000,500);
		
		Conta c2 = new Conta(222,"Felipe",1000,250);
		
		c1.info();
		
		c2.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Saque Indisponivel, verifique o saldo da sua conta !");
		}
		if(!c1.depositar(500)) {
			System.out.println("Problema no Deposito, Verifique os Dados!");
		}
		
		
		if(!c1.transferenciaSaida(10)) {
			System.out.println("Problema na Transferencia");
		}
		
		if(!c2.transferenciaEntrada(10)) {
			System.out.println("Problema na Transferencia");
		}
		
		System.out.println();
		c1.info();
		c2.info();
	}

}
