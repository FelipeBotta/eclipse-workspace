package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	double total ;
	
	private ArrayList <Moeda> listaMoeda = new ArrayList <Moeda>();
	
	public void adicionar(Moeda moeda) {
		
		listaMoeda.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		
		listaMoeda.remove(moeda);
	}
	
	public void listagemMoedas() {
		
		listaMoeda.forEach((n)-> {n.info(); System.out.println(n.valor);});
	
}
	public void totalConvertido(){
		
		
		
		listaMoeda.forEach((n) -> {
			
			if (n.info() == "Real"){
					total =+ n.valor;
				
			} else if (n.info() == "Dolar") { 
				 	
				total =+ n.valor;
				
			}else if (n.info() == "Euro"){				
				
				total =+ n.valor;
				
			}
			
		});
		
	}
}
