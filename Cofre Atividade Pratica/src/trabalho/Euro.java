package trabalho;

public class Euro extends Moeda {
	
	
	public Euro(double valor) {
		super(valor);
	}

	@Override
	public String info(){
		return "Euro";
		
	}
	
	@Override
	public void converter(){
		
		valor = this.valor / 5.8;
		System.out.println(valor);
	}
	
}
