package algorytm;

import java.util.Scanner;
public class WartoscBezwzgledna {

	public static void main(String[] args) {
		System.out.println("Podaj liczbê do obliczenia wartoœci bezwzglêdnej");
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		int wynik = 0;
		if (liczba >= 0){
			wynik = liczba;
		}
		else{
			wynik = -liczba;
		}
		
		System.out.println("Wartoœæ bezwzglêdna z liczby " + liczba + " wynosi: " + wynik);
		odczyt.close();
	}

}
