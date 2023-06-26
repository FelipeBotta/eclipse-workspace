package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a.cpf="111.222.333-4";
		a.nome="Luis";
		a.matricula=1001;
		
		a.info();
		Aluno b = new Aluno(1002,"Felipe","222.333.444-5");
		b.info();
		
		ArrayList <Aluno> alunos = new ArrayList();
		
		Aluno c = new Aluno (1003);
		
		alunos.add(c);
		alunos.add(new Aluno (10004, "Botta", "333.444.555-6"));
	}
	
	

}
