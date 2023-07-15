package trabalho;

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}

	@Override
	public String info(){
		return "Real";
		
	}
	
	@Override
	public void converter(){
		
		System.out.println(valor);
		
	}

}
