package algorytm;

import java.util.ArrayList;
import java.util.List;

public class SumaElWLiscie {

	public static void main(String[] args) {
		int wynik = 0;
		List<Integer> lista = new ArrayList<>();
		
		lista.add(5);
		lista.add(2);
		lista.add(5);
		lista.add(2);
		
		for (int element : lista) {
			wynik += element;
		}
		System.out.println("Suma elementów w liœcie wynosi: " + wynik);
		
		
		
		
	}

}
