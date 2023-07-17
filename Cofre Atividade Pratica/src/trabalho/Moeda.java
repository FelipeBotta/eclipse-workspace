package trabalho;

import java.util.Objects;

public abstract class Moeda {
	
	public double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}

	public String info(){
		return null;
	

	}
	
	public double converter(){
		return 0;
		
	}

	@Override
    public boolean equals(Object o) { //aqui converti o valor para objeto para que ele possa ser removido atraves do remove.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return valor == moeda.valor && Objects.equals(valor, moeda.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
	
	
	
	
}
