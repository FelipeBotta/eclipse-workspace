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
	public void converter(){
		
		valor = this.valor / 5.8;
		System.out.println(valor);
		
	}

}
