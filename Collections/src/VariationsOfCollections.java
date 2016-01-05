
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VariationsOfCollections {
	static Scanner odczyt;

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		LinkedList<Integer> lista1 = new LinkedList<>();
		Set<Integer> setLista = new HashSet<>();
		Map<List<Integer>, Set<Integer>> mapa = new HashMap<>();  
		

		System.out.println("Ile elementów chcesz umieœciæ w liœcie?");
		odczyt = new Scanner(System.in);
		try {
			int iloscElementow = odczyt.nextInt();

			DodanieElementowDoListy(iloscElementow, lista);
			WyswietlanieListy(lista);
			lista1.addAll(lista); // dodanie elementów listy do linked listy
			WyswietlanieLinkedList(lista1);

			DodanieElementuNaPierwszejPozycji(lista1);
			DodanieElementuNaOstatniejPozycji(lista1);
			System.out.println("Lista po dodaniu elementów na pocz¹tku i koñcu: ");
			WyswietlanieLinkedList(lista1);
			
			setLista.addAll(lista1);
			WyswietlanieSet(setLista);
		
			System.out.println("");
			System.out.println("Mapa: ");
			mapa.put(lista, setLista);
			for(Map.Entry<List<Integer>, Set<Integer>> entry : mapa.entrySet()){
				System.out.println(entry);
			}	
			} 
			finally {
			odczyt.close();
		}
	}

	public static void DodanieElementowDoListy(int iloscElementow, List<Integer> lista) {

		System.out.println("Podaj liczby do listy: ");

		for (int i = 0; i < iloscElementow; i++) {
			int elementy = odczyt.nextInt();
			lista.add(elementy);		
		}
	}
	
	public static void WyswietlanieListy(List<Integer> lista) {
		
		System.out.println("List: ");
		for (Integer element : lista) {
			System.out.print(element + " ");
		}
	}

	public static void WyswietlanieLinkedList(LinkedList<Integer> lista1) {
		
		System.out.println("");
		System.out.println("LinkedList: ");
		for (Integer element : lista1) {
			System.out.print(element + " ");
		}
	}
	
	public static void WyswietlanieSet(Set<Integer> setLista){
		System.out.println("");
		System.out.println("SetList: ");
		for (Integer element : setLista) {
			System.out.print(element + " ");
		}
	}
	
	public static void DodanieElementuNaPierwszejPozycji(LinkedList<Integer> lista1) {
		
		System.out.println("");
		System.out.println("Podaj element na pierwsze miejsce listy: ");
		int pierwszyElement = odczyt.nextInt();
		lista1.addFirst(pierwszyElement);
	}

	public static void DodanieElementuNaOstatniejPozycji(LinkedList<Integer> lista1) {
		
		System.out.println("Podaj element na ostatnie miejsce listy: ");
		int ostatniElement = odczyt.nextInt();
		lista1.addLast(ostatniElement);
	}
}
