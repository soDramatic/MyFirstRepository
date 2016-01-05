package javastart;

import java.util.Scanner;
public class OperatoryLogiczne {

	public static void main(String[] args) {
		/*
		 == sprawdza równoœæ
		!= ró¿ny
		>= wiêkszy równy
		<= mniejszy równy
		> , < wiêkszy, mniejszy
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
		System.out.println("Podaj pierwsz¹ liczbê");
		Scanner odczyt = new Scanner(System.in); //Stworzenie obiektu do pobierania danych
		liczba1 = odczyt.nextDouble();
		
		
		System.out.println("Podaj drug¹ liczbê");
		liczba2 = odczyt.nextDouble(); 
		
		System.out.println("Podaj trzeci¹ liczbê");
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
