import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadanie5 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		SortingList(list);
		potega(5, 5);

	}

	public static int SortingList(List<Integer> list) {

		list.add(2);
		list.add(5);
		list.add(1);
		list.add(9);
		list.add(12);
		list.add(6);
		list.add(0);
		System.out.println("Nie posortowana lista: " + list);
		Collections.sort(list);
		System.out.println("Posortowana lista: " + list);
		int suma = 0;
		float srednia = 0;
		int ilosc = 0;
		for (Integer element : list) {
			suma += element;
			ilosc++;
		}
		srednia = suma / ilosc;

		System.out.println("Ilosc elementow w liscie: " + ilosc + "\nSuma elementow w liscie: " + suma
				+ "\nŒrednia elementów w liœcie: " + srednia + "\n");

		return 0;
	}

	public static int potega(int liczba, int potega){
		int wynik = 0;
		try{
			if(liczba == 5){
			throw new Exception("Liczba = 5");	
			}
			wynik = (int) Math.pow(liczba, potega);
			System.out.println("Potêga: " + wynik);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return wynik;	
}
}