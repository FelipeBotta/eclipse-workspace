package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	double total ;
	
	public Cofrinho() {
	}
	
	private ArrayList <Moeda> listaMoeda = new ArrayList <Moeda>();
	
	public void adicionar(Moeda moeda) {
		
		listaMoeda.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		
		//listaMoeda.forEach((n) -> {if (moeda.valor == n.valor && moeda.info() == n.info())
		//{listaMoeda.remove(n);}});
		
		listaMoeda.remove(moeda);
		
	}
	
	public void listagemMoedas() {
		
		listaMoeda.forEach((n)-> {System.out.println(n.info() + " - " + String.format("%.2f", n.valor));});
	
}
	public void totalConvertido(){
		
		
		
		listaMoeda.forEach((n) -> {
			
			if (n.info() == "Real"){
					total =+ n.valor;
				
			} else if (n.info() == "Dolar") { 
				 	
				total =+ n.converter();
				
			}else if (n.info() == "Euro"){				
				
				total =+ n.converter();
				
			}
			
		});
		
		System.out.println("O total convertido em reais eh de: " + String.format("%.2f", total));
		
		
	}
}
