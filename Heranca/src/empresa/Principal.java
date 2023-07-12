package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Sherlock Holmes", "Sir Arthur Conan Doyle");
		
		LivroDigital l2 = new LivroDigital("Sherlock Holmes", "Sir Arthur Conan Doyle","asfasfafadfdfsdfsdf");
		System.out.println(l1 instanceof Livro);
		System.out.println(l2 instanceof Livro);
		System.out.println(l1 instanceof LivroDigital);
		System.out.println(l2 instanceof LivroDigital);
		
	}
		
		
}
