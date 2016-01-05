package algorytm;

import java.util.Scanner;

public class Potegowanie {

	public static void main(String[] args) {
		
		
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		System.out.println("Podaj liczbê, która ma byæ potêgowana " + liczba);
		
		
		Scanner odczyt1 = new Scanner(System.in); 
		int potega = odczyt1.nextInt();
		System.out.println("Do której potegi podnieœæ liczbê " + potega);
		
		int wynik = 0;
		for(int i = 0; i >= potega; i++){
			wynik = liczba + liczba;
		}
		
	System.out.println("Potêga liczby " + liczba + "wynosi: " + wynik);
	odczyt.close();
	odczyt1.close();
	}

}
