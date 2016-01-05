package algorytm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Listy {

	public static void main(String[] args) {
		
		//ArrayList<X> obiekt = new ArrayList<>(); - 
		//obiekt.add(new X("ABC"));	- dodanie nowego elementu listy
		//obiekt.ensureCapacity(100); - zarezerwuje miejsce dla wewn�trznej tablicy mog�cej 
										//przechowywa� 100 element�w
		//ArrayList<X> obiekt = new ArrayList<>(100) - Przekazanie pocz�tkowej pojemno�ci listy 
													// do konstruktora klasy
		// obiekt.size() = sprawdzenie liczby element�w w li�cie - odpowiednik a.length 
		
		//tworzenie listy
		ArrayList<String> lista = new ArrayList<String>();
		
		//dodanie element�w 
		lista.add("Marcin");
		lista.add("Krzysiek");
		lista.add("Karol");
		lista.add("Micha�");
		
		//sprawdzenie rozmiaru listy
		System.out.println("Rozmiar listy jest r�wny " + lista.size());
		
		// usuni�cie obiektu i sprawdzenie rozmiaru
		lista.remove("Micha�");
		System.out.println("Rozmiar listy jest r�wny " + lista.size());
		
		//usuni�cie obiektu zajmuj�cego 2 miejsce, czyli o indeksie 1
		lista.remove(1);
		System.out.println("Rozmiar listy jest r�wny " + lista.size());
		
		//przypisanie pierwszego elementu do zmiennej i wyswietlenie go
		String imie = (String) lista.get(0);
		System.out.println("Pierwszy element to: " + imie);
	}

}
