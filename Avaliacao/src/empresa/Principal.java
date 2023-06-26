package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Luis","Eletricista",new Avaliacao(9,10,3));
		Aluno a2 = new Aluno("Felipe","Mecanico",new Avaliacao(7,8,4));
		
		a1.info();
		a2.info();

	}

}
