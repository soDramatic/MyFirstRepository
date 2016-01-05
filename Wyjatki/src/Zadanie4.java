import java.util.Random;

public class Zadanie4 {

	static int ktoryWystapil = 1;

	void mozeZglosicWyjatek() throws Exception {
		if (new Random().nextInt(5) == 0)
			throw new Exception();
	}

	public static void main(String[] args) {
		Zadanie4 z = new Zadanie4();

		try {
			z.mozeZglosicWyjatek();
			ktoryWystapil++;
			z.mozeZglosicWyjatek();
			ktoryWystapil++;
			z.mozeZglosicWyjatek();
			ktoryWystapil++;
			z.mozeZglosicWyjatek();
			ktoryWystapil++;
			z.mozeZglosicWyjatek();
			ktoryWystapil++;
		} catch (Exception e) {
			System.out.println("Wystapil w instrukcji: " + ktoryWystapil);
		}
		if (ktoryWystapil >= 6) {
			System.out.println("Nie wystapil.");
		}
	}
}
