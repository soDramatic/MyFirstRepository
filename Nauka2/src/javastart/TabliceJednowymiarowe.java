package javastart;

import java.util.Scanner;
public class TabliceJednowymiarowe {

	public static void main(String[] args) {
		
		//typ[] nazwa_tablicy = new typ[liczba_element�w];
		//lub
		//typ nazwa_tablicy[] = new typ[liczba_element�w];
		
		//typ[] tablica = {wartosc1, wartosc2, wartosc3, ...};
		
		//Odwo�anie do danego elementu tablicy
		//int jakas_zmienna = nazwa_tablicy[numer_indexu];
		//int liczba = tab[3];
		
		//ZADANIE 1
		/*Napisz program, w kt�rym zadeklarujesz i utworzysz pi�cioelementow� tablic� 
		 * odpowiedniego typu. W p�tli pobierzesz od u�ytkownika 5 imion i je w niej zapiszesz. 
		 * Nast�pnie wy�wietl na ekranie powiadomienia "Witaj imie_z_tablicy" dla ka�dego z 
		 * podanych parametr�w.
		 */
		//deklaracja tablicy
		String[] tab = new String[5];
		String imie;
		
		//pobranie danych
		for(int i=0; i<=4; i++){
			System.out.println("Podaj imi�");
			Scanner odczyt = new Scanner(System.in);
			imie = odczyt.nextLine();
			tab[i] = imie;
		}
		
		//wy�wietlanie danych
		for(int i=0; i<=4; i++){
			System.out.println(tab[i]);
		}
		
		
		
		
		//ZADANIE 2
		/*Utw�rz tablic� typu int przechowuj�c� n element�w - gdzie n jest parametrem 
		 * pobieranym od u�ytkownika. Nast�pnie wype�nij j� liczbami od 1 do n i wy�wietl 
		 * zawarto�� na ekranie przy pomocy p�tli while.
		 */
		
		
		int n=0;
		System.out.println("Podaj wielko�� tablicy");
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
