package empresa;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList();
		//LinkedList<String> pessoas = new LinkedList();
		
		pessoas.add("Luis");
		pessoas.add("Felipe");
		pessoas.add("Cristiane");
		pessoas.add("Gabriela");
		
		System.out.println(pessoas.get(0));
		//pessoas.remove(1);
		
		System.out.println("Ordem original: ");
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		System.out.println("Ordem alfabetica: ");
		System.out.println(pessoas);
		
		Collections.reverse(pessoas);
		System.out.println("Ordem reversa: ");
		System.out.println(pessoas);
		
		Collections.shuffle(pessoas);
		System.out.println("Apos Shuffle: ");
		System.out.println(pessoas);
		
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));

	}

}
