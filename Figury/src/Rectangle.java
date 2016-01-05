
public class Rectangle extends Figure {

	private double bokA;
	private double bokB;
	
	public Rectangle (double bokA, double bokB){
		this.bokA = bokA;
		this.bokB = bokB;
	}
	
	@Override
	double pole() {
		double wynik = 0;
		wynik = bokA * bokB;
		return wynik;
	}

	@Override
	double obwod() {
		double wynik = 0;
		wynik = ((2*bokA) + (2*bokB)); 
		return wynik;
	}

	@Override
	public String toString() {
		String info = new String(name + ", obwod: " + obwod() + ", pole: " + pole());
		return info;
	}
}
