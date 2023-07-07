package empresa;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luis",111,0.1,new Curso("Analise e Desenvolvimento de Sistemas",1000));
		
		
		a1.info();
	}

}
