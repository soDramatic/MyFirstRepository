package algorytm;

import java.util.Scanner;

public class Parzystosc {

	public static void main(String[] args) {
		
		System.out.println("Podaj liczbê do sprawdzenia parzystosci ");
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		
		if(liczba % 2 == 0){
			System.out.println("Liczba " + liczba + " jest parzysta");
		}
		else{
			System.out.println("Liczba " + liczba + " jest nieparzysta");
		}
		
		odczyt.close();
	}

}
