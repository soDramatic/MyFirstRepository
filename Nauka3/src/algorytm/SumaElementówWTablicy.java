package algorytm;

import java.util.Scanner;

public class SumaElement�wWTablicy {

	public static void main(String[] args) {
		int iloscEl = 0;
		
		//deklaracja tablicy
		System.out.println("Podaj ilosc element�w tablicy");
		Scanner odczyt = new Scanner(System.in);
		iloscEl = odczyt.nextInt();
		int[] tablica = new int [iloscEl];
		
		//Wpisanie element�w do tablicy 
		int element = 0;
		System.out.println("Podaj elementy do tablicy");
		for(int i = 0 ; i < tablica.length ; i++ ){
			iloscEl--;
			element = odczyt.nextInt();
			tablica[i] = element;	
		}
		
		//Wy�wietlanie element�w tablicy
		System.out.println("Elementy tablicy: ");
		for (int i : tablica) {
			System.out.println(i);
		}
		
		//Zsumowanie wszystkich element�w w tablicy
		int suma = 0;
		for (int i = 0; i < tablica.length; i++){
			suma = suma + tablica[i]; 
		}
		System.out.println("Suma element�w w tablicy wynosi: " + suma);
				
		odczyt.close();
	}
}
