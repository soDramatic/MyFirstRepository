package algorytm;

public class SzukanieMinIMax {

	public static void main(String[] args) {
		
		int[] tablica = {2,5,1,6,2,7,9,10,21,13,15,22};
		int max = tablica[0];
		int min = tablica[0];
		
		//szukanie najmniejszej liczby w tablicy
		for (int i = 1; i < tablica.length; i++){
			if(tablica[i] > min){
				min = tablica[i];
			}
		}
		System.out.println("Najwiêkszy element w tablicy to " + min);
		
		for(int i = 1; i < tablica.length; i++) {
			if(tablica[i] < max){
				max = tablica[i];
			}
		}
		
		System.out.println("Najmniejszy element w tablicy to " + max);
	}

}
