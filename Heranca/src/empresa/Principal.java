package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Sherlock Holmes", "Sir Arthur Conan Doyle");
		
		LivroDigital l2 = new LivroDigital("Sherlock Holmes", "Sir Arthur Conan Doyle","asfasfafadfdfsdfsdf");
		
		System.out.println(l1.autor);
	}
		
		
}
