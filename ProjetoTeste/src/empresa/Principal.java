package empresa;


public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.matricula=1001;
		a.nome="Luis";
		a.cpf ="12123124124";
		
		
		Aluno b = new Aluno();
		b.matricula=1002;
		b.nome="Felipe";
		b.cpf ="10924830948";
		
		
		a.info();
				
		b.info();

		
		
	}

}
