package javastart;

import java.util.Scanner;
public class Petle {

	public static void main(String[] args) {
		
		//FOR
		System.out.println("Podaj liczbê, od której zacznie siê odliczanie");
		Scanner pobranie = new Scanner(System.in);
		
		for(int liczba = pobranie.nextInt();liczba > 0 ; liczba--)
		{
			System.out.println("Bomba wybuchnie za: " + liczba);
		}
		System.out.println("BUUUUUUUUM!!!");
		
		
		//DO WHILE
		int licznik = 0;
		System.out.println("Podaj liczbê, od której zacznie siê odliczanie");
		Scanner pobranie2 = new Scanner(System.in);
		licznik = pobranie2.nextInt();
		do{
			System.out.println("Bomba wybuchnie za: " + licznik);
			licznik--;
		}while(licznik > 0);
		System.out.println("BUUM");
	
		
		//WHILE
		int licznik2 = 0;
		System.out.println("Podaj liczbê, od której zacznie siê odliczanie");
		Scanner pobranie3 = new Scanner(System.in);
		licznik2 = pobranie3.nextInt();
		
		while(licznik2 > 0){
			System.out.println("Bomba wybuchnie za: " + licznik2);
			licznik2--;
		}
			System.out.println("Bum!");
			
			
			
			
			
		pobranie.close();
		pobranie2.close();
		pobranie3.close();
		
	}

}
