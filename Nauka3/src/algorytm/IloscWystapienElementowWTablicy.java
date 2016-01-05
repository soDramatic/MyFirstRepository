package algorytm;

import java.util.Scanner;

public class IloscWystapienElementowWTablicy {

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
			element = odczyt.nextInt();
			tablica[i] = element;	
		}
		
		//Zliczenie wyst�pie� danej warto�ci w tablicy	
		System.out.println("Podaj liczb�, kt�r� chcesz zliczy�: ");
		Scanner odczyt2 = new Scanner(System.in);
		int zliczanyEl = odczyt2.nextInt();
		
		int iloscWyst = 0;
		//for (int i : tablica) { // zawsze wyrzuca w wyniku o 1 wi�cej, nie wiem dlaczego
		for(int i = 0; i < tablica.length ; i++){
			if(zliczanyEl == tablica[i]){
				iloscWyst++;		
			}
		} 
		if(iloscWyst == 0){
			System.out.println("Podana liczba nie wystepuje w tablicy");
		}
		else{
			System.out.println("Liczba " + zliczanyEl + " wystuje w tablicy " + iloscWyst + " razy.");
		}	
	}

}
