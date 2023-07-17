package trabalho;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public String info(){
		return "Dolar";
		
	}
	
	@Override
	public double converter(){
		
		double dolar = this.valor / 4.8;
		
		return dolar;
	}

}
