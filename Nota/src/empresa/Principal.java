package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Nota luis = new Nota();
		
		luis.setNota1(9);
		luis.setNota2(10);
		
		luis.resultado();
		
		luis.setNota1(2);
		
		luis.resultado();
	}

}
