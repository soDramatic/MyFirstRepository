
public class Exchange {

	public double dollarToFrancRatio() {

		return 0.5;
	}

	public double francToDollarRatio() {

		return 2;
	}

	public double dollarToFranc(double amount) {
		double wynik = 0;
		wynik = amount * dollarToFrancRatio();
		return wynik;

	}

	public double francToDollar(double franc) {
		double wynik = 0;
		wynik = franc * francToDollarRatio();
		return wynik;
	}

}
