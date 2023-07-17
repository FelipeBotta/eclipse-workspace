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
			
		listaMoeda.remove(moeda);
		
	}
	
	public void listagemMoedas() {
		
		if(listaMoeda.isEmpty()) {
			System.out.println("Cofre Vazio ! \n");
		}
		
		listaMoeda.forEach((n)-> {System.out.println(n.info() + " - " + String.format("%.2f", n.valor));});
		
		
}
	public void totalConvertido(){
		
		
		
		listaMoeda.forEach((n) -> {
			
							
				
				total += n.converter();
			
		});
		
		System.out.println("O total convertido em reais eh de: " + String.format("%.2f", total));
		
		
	}
}
