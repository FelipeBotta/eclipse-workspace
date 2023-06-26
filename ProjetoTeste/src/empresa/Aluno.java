package empresa;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	
	Aluno(){
		System.out.println("Aluno criado sem parametros");
	}
	
	
	Aluno(int Matricula, String Nome, String Cpf){
		this.matricula = Matricula;
		this.nome = Nome;
		this.cpf = Cpf;
	}
	
	public Aluno(int matricula) {
		this.matricula = matricula;
		this.nome = "Vazio";
		this.cpf = "000.000.000-0";
	}


	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}
