package javastart;

import java.util.Scanner;
public class OperatoryLogiczne {

	public static void main(String[] args) {
		/*
		 == sprawdza r�wno��
		!= r�ny
		>= wi�kszy r�wny
		<= mniejszy r�wny
		> , < wi�kszy, mniejszy
		*/
		// koniunkcja && 
		// alternatywa || 
		
		
		int a = 5;
		int b = 3;
		boolean prawda = a > b; // prawda = true;
		System.out.println(prawda);
		
		boolean falsz = a < b; //falsz = false;
		System.out.println(falsz);
		
		boolean porownanie = a == b; //porownanie = false;
		System.out.println(porownanie);
		
		boolean koniunkcja = (a > b) && (a!=b); //true prawda i prawda = prawda
		System.out.println(koniunkcja);
		
		
		OperatoryLogiczne calc = new OperatoryLogiczne();
		calc.kalkulator();
		
	}

	public double kalkulator(){
		double liczba1, liczba2, liczba3;
		System.out.println("Podaj pierwsz� liczb�");
		Scanner odczyt = new Scanner(System.in); //Stworzenie obiektu do pobierania danych
		liczba1 = odczyt.nextDouble();
		
		
		System.out.println("Podaj drug� liczb�");
		liczba2 = odczyt.nextDouble(); 
		
		System.out.println("Podaj trzeci� liczb�");
		liczba3 = odczyt.nextDouble(); 
		odczyt.close();
		
		
		System.out.println((liczba1 + liczba2)*liczba3);
		System.out.println(liczba1 - liczba2 / liczba3);
		liczba1++;
		System.out.println(liczba1);
		System.out.println(++liczba2);
		
		System.out.println((liczba1 + liczba2) > liczba3);
		System.out.println(liczba1 == liczba2);
		
		return 0;
			
	}
}
