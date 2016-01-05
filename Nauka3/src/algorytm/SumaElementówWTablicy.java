package algorytm;

import java.util.Scanner;

public class SumaElementówWTablicy {

	public static void main(String[] args) {
		int iloscEl = 0;
		
		//deklaracja tablicy
		System.out.println("Podaj ilosc elementów tablicy");
		Scanner odczyt = new Scanner(System.in);
		iloscEl = odczyt.nextInt();
		int[] tablica = new int [iloscEl];
		
		//Wpisanie elementów do tablicy 
		int element = 0;
		System.out.println("Podaj elementy do tablicy");
		for(int i = 0 ; i < tablica.length ; i++ ){
			iloscEl--;
			element = odczyt.nextInt();
			tablica[i] = element;	
		}
		
		//Wyœwietlanie elementów tablicy
		System.out.println("Elementy tablicy: ");
		for (int i : tablica) {
			System.out.println(i);
		}
		
		//Zsumowanie wszystkich elementów w tablicy
		int suma = 0;
		for (int i = 0; i < tablica.length; i++){
			suma = suma + tablica[i]; 
		}
		System.out.println("Suma elementów w tablicy wynosi: " + suma);
				
		odczyt.close();
	}
}
