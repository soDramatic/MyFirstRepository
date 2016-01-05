import java.util.Random;

class Wyjatek1 extends Exception {
};

class Wyjatek2 extends Exception {
};

class Wyjatek3 extends Exception {
};

public class Zadanie2 {

	public static void main(String[] args) throws Wyjatek1, Wyjatek2, Wyjatek3 {
		Zadanie2 zadanie2 = new Zadanie2();

		try {
			zadanie2.losowanieWyjatku();
		} catch (Wyjatek1 e) {
			System.out.println(e.getClass());
		} catch (Wyjatek2 e) {
			System.out.println(e.getClass());
		} catch (Wyjatek3 e) {
			System.out.println(e.getClass());
		}

	}

	void losowanieWyjatku() throws Wyjatek1, Wyjatek2, Wyjatek3 {
		Random random = new Random();
		switch (random.nextInt(3)) {
		case 0:
			throw new Wyjatek1();
		case 1:
			throw new Wyjatek2();
		case 2:
			throw new Wyjatek3();
		}
	}

}
