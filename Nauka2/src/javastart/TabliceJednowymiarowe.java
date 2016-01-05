package javastart;

import java.util.Scanner;
public class TabliceJednowymiarowe {

	public static void main(String[] args) {
		
		//typ[] nazwa_tablicy = new typ[liczba_elementów];
		//lub
		//typ nazwa_tablicy[] = new typ[liczba_elementów];
		
		//typ[] tablica = {wartosc1, wartosc2, wartosc3, ...};
		
		//Odwo³anie do danego elementu tablicy
		//int jakas_zmienna = nazwa_tablicy[numer_indexu];
		//int liczba = tab[3];
		
		//ZADANIE 1
		/*Napisz program, w którym zadeklarujesz i utworzysz piêcioelementow¹ tablicê 
		 * odpowiedniego typu. W pêtli pobierzesz od u¿ytkownika 5 imion i je w niej zapiszesz. 
		 * Nastêpnie wyœwietl na ekranie powiadomienia "Witaj imie_z_tablicy" dla ka¿dego z 
		 * podanych parametrów.
		 */
		//deklaracja tablicy
		String[] tab = new String[5];
		String imie;
		
		//pobranie danych
		for(int i=0; i<=4; i++){
			System.out.println("Podaj imiê");
			Scanner odczyt = new Scanner(System.in);
			imie = odczyt.nextLine();
			tab[i] = imie;
		}
		
		//wyœwietlanie danych
		for(int i=0; i<=4; i++){
			System.out.println(tab[i]);
		}
		
		
		
		
		//ZADANIE 2
		/*Utwórz tablicê typu int przechowuj¹c¹ n elementów - gdzie n jest parametrem 
		 * pobieranym od u¿ytkownika. Nastêpnie wype³nij j¹ liczbami od 1 do n i wyœwietl 
		 * zawartoœæ na ekranie przy pomocy pêtli while.
		 */
		
		
		int n=0;
		System.out.println("Podaj wielkoœæ tablicy");
		Scanner odczyt2 = new Scanner(System.in);
		n = odczyt2.nextInt();
		int[] tablica = new int[n];
		
		for(int i = 0; i < n; i++){
			tablica[i] = i + 1;
		}
		
		int i=0;
		while(i < tablica.length){
			System.out.println(tablica[i]);
			i++;
		}
		
	}

}
