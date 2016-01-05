package algorytm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Listy {

	public static void main(String[] args) {
		
		//ArrayList<X> obiekt = new ArrayList<>(); - 
		//obiekt.add(new X("ABC"));	- dodanie nowego elementu listy
		//obiekt.ensureCapacity(100); - zarezerwuje miejsce dla wewnêtrznej tablicy mog¹cej 
										//przechowywaæ 100 elementów
		//ArrayList<X> obiekt = new ArrayList<>(100) - Przekazanie pocz¹tkowej pojemnoœci listy 
													// do konstruktora klasy
		// obiekt.size() = sprawdzenie liczby elementów w liœcie - odpowiednik a.length 
		
		//tworzenie listy
		ArrayList<String> lista = new ArrayList<String>();
		
		//dodanie elementów 
		lista.add("Marcin");
		lista.add("Krzysiek");
		lista.add("Karol");
		lista.add("Micha³");
		
		//sprawdzenie rozmiaru listy
		System.out.println("Rozmiar listy jest równy " + lista.size());
		
		// usuniêcie obiektu i sprawdzenie rozmiaru
		lista.remove("Micha³");
		System.out.println("Rozmiar listy jest równy " + lista.size());
		
		//usuniêcie obiektu zajmuj¹cego 2 miejsce, czyli o indeksie 1
		lista.remove(1);
		System.out.println("Rozmiar listy jest równy " + lista.size());
		
		//przypisanie pierwszego elementu do zmiennej i wyswietlenie go
		String imie = (String) lista.get(0);
		System.out.println("Pierwszy element to: " + imie);
	}

}
