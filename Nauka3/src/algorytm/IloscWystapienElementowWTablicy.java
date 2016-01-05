package algorytm;

import java.util.Scanner;

public class IloscWystapienElementowWTablicy {

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
			element = odczyt.nextInt();
			tablica[i] = element;	
		}
		
		//Zliczenie wyst¹pieñ danej wartoœci w tablicy	
		System.out.println("Podaj liczbê, któr¹ chcesz zliczyæ: ");
		Scanner odczyt2 = new Scanner(System.in);
		int zliczanyEl = odczyt2.nextInt();
		
		int iloscWyst = 0;
		//for (int i : tablica) { // zawsze wyrzuca w wyniku o 1 wiêcej, nie wiem dlaczego
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
