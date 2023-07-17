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
	public double converter(){
		
		valor = this.valor / 5.4;
		
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	
	
}
