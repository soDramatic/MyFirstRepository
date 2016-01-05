package javastart;

public class PetlaForeach {

	public static void main(String[] args) {
//	for(Typ_Obiektu nazwa_obiektu : nazwa_tablicy){ ... }
//	lub
//	for(Typ_Obiektu nazwa_obiektu : kolekcja_implementuj¹ca_Iterable){ ... }
		
		int [] tablica = new int [10]; //deklaracja tablicy
		
		for (int i = 0; i < 10; i++){ //wype³nienie tablicy 
			tablica[i] = i + 1;
		}
		
		for(int x : tablica){
			System.out.println(x);
		}
		
	}

}
