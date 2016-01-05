
public class Money implements IMoney {

	protected static double amount;

	public Money(double amount) {
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public boolean equals() {

		if (new Money(amount).equals(new Money(amount))) {
			return true;
		} else if (new Dollar(amount).equals(new Franc(amount))) {
			return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
	
		Dollar dollar = new Dollar(3);
		Franc franc = new Franc(3);
	}
}
