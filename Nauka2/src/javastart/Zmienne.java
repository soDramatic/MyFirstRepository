package javastart;

public class Zmienne {

	public static void main(String[] args) {
		int liczba; //Deklaracja
		liczba = 5; //Inicjalizacja
		
		int liczba1 = 5;
		int liczba2 = liczba1;
		System.out.println(liczba1 + liczba2);
		
		double liczba3, liczba4;
		liczba3 = 5.0;
		liczba4 = 3.3;
		System.out.println(liczba3);
		System.out.println(liczba4);
		
		final double LICZBA_PI = 3.14; //sta³a - s³owo kluczowe final, nazwa drukowanymi literami
		System.out.println(LICZBA_PI);
		
		String a = "Siema";
		String b = "Czeœæ";
		String c = "Hej";
		String d = a + " " + b + " " + c;
		System.out.println(d);
		System.out.println(d.substring(0,11)); 

	}

}
