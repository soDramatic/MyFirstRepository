package algorytm;

import java.util.Scanner;
public class WartoscBezwzgledna {

	public static void main(String[] args) {
		System.out.println("Podaj liczb� do obliczenia warto�ci bezwzgl�dnej");
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		int wynik = 0;
		if (liczba >= 0){
			wynik = liczba;
		}
		else{
			wynik = -liczba;
		}
		
		System.out.println("Warto�� bezwzgl�dna z liczby " + liczba + " wynosi: " + wynik);
		odczyt.close();
	}

}
