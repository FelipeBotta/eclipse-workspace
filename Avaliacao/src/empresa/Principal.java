package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Avaliacao luis = new Avaliacao(7,8,9);
		
		Avaliacao felipe = new Avaliacao();
			felipe.n1 = 7;
			felipe.n2 = 8;
			felipe.n3 = 7 ;
		
		
		System.out.println("Media Aritmetica do Luis: " + luis.mediaAritmetica());
		System.out.println("Media Ponderada do Luis: " + luis.mediaPonderada());
		
		System.out.println("Media Aritmetica do Felipe: " + felipe.mediaAritmetica());
		System.out.println("Media Ponderada do Felipe: " + felipe.mediaPonderada());
	}

}
