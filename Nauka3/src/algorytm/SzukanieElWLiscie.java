package algorytm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SzukanieElWLiscie {

	public static void main(String[] args) {
	
		List<Integer> lista = new ArrayList<>();
		System.out.println("Ile elementów chcesz podaæ do listy?");
		Scanner odczyt = new Scanner(System.in);
		int iloscEl = odczyt.nextInt();
		
		int element = 0;
		System.out.println("Podaj elementy do listy.");
		for(int i = 0; i < iloscEl; i++) {
			element = odczyt.nextInt();
			lista.add(element);
		}
		
		
		// najmniejsza i najwiêksza wartoœæ
		int max = 0;
		int mini = 0;
		for (int elementy1 : lista) {
			
			if(elementy1 > max){
				max = elementy1;
			}
		}
			System.out.println("Najwiêkszy element w tablicy to " + max);	
			
		for (int elementy2 : lista){
			if (elementy2 < mini){
				mini = elementy2;
			}
		}
		System.out.println("Najmniejszy element w tablicy to " + mini);
		
		//ilosc liczb parzystych i nieparzystych
		int parzyste = 0;
		int nieparzyste = 0;
		for(int elementy3 : lista){
			if(elementy3 % 2 == 0){
				 parzyste++;
			}
			else{
				nieparzyste++;
			}
		}
		System.out.println("Ilosc liczb nieparzystych w liscie wynosi: " + nieparzyste);
		System.out.println("Ilosc liczb parzystych w liscie wynosi: " + parzyste);
		
		
			//œrednia
		int srednia = 0;
		int suma = 0;
		for (int elementy3 : lista) {
			suma += elementy3;
		}
		srednia = suma / iloscEl;
		System.out.println("Œrednia elementów listy wynosi: " + srednia);	
		
		odczyt.close();
	}
	
}
