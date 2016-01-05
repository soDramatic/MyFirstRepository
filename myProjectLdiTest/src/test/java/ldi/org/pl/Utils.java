package ldi.org.pl;

public class Utils {

	public static void wait(int timeInMs) {

		try {
			Thread.sleep(timeInMs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
