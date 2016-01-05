
public abstract class Figure {

	String name;
	
	abstract double pole();
	abstract double obwod();

	@Override
	public String toString() {
		String info = new String(name + ", obwod: " + obwod() + ", pole: " + pole());
		return info;
	}
}
