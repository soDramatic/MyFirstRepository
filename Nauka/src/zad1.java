
public class zad1 {

	public static void main(String[] args) {
	
	//RZUTOWANIE
	float zmiennaFloat = 1.1234567f;
	double zmiennaDouble = (double) zmiennaFloat;
	int zmiennaInt = (int) zmiennaFloat;
	System.out.println(zmiennaDouble);
	System.out.println(zmiennaInt);
	
	float b = 11.0f;
	System.out.println(b);
	
	
	//PARSOWANIE
	String s3 = "1234";
	int parsedS = Integer.parseInt(s3);
	System.out.println(parsedS);
	
	String x = "13";
	float y = Float.parseFloat(x);
	System.out.println(y);
	
	String zmienna = "10";
	int zmienna2 = 1;
	int wynik = Integer.parseInt(zmienna) + zmienna2;
	System.out.println(wynik);
	
		
	//DZIA£ANIA NA STRINGACH
	String powitanie = "Czeœæ";
	String s = powitanie.substring(0,3);
	System.out.println(s);
	System.out.println(powitanie + s);
	System.out.println(powitanie = powitanie.substring(0,3)+"kaj");
	
	String r = "konkatenacja";
	System.out.println(r.substring(3,9));
	System.out.println(r.substring(6,12));
		
	int wiek = 20;
	String zdanie = "to moja szczêœliwa liczba";
	System.out.println(wiek+" "+zdanie);
	System.out.println(s.equals(powitanie));	
	System.out.println("Czeœæ".equalsIgnoreCase("cZEœÆ"));
	}
}
