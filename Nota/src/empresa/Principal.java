package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Nota luis = new Nota();
		
		Nota felipe = new Nota(9,7,10);
		
		System.out.println("Media Felipe");
		felipe.resultado();
		System.out.println();
		
		
		System.out.println("Media Luis");
		luis.setNota1(9);
		luis.setNota2(10);
		luis.setFaltas(5);
		luis.resultado();
		
	}

}
