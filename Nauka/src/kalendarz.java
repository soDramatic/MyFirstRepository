import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static java.util.Calendar.*;

public class kalendarz {

	public static void main(String args[]) throws ParseException {

		computeMonthWorkHours(2015, 10);

	}

	public static int computeMonthWorkHours(int year, int month) throws ParseException {

		String dateBeforeFormat = year + "-" + month;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
		Date date = format.parse(dateBeforeFormat);
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTime().toString());

//		calendar.setTime(date);
		int maxDaysOfMonth = calendar.getActualMaximum(DAY_OF_MONTH);
		System.out.println(maxDaysOfMonth);

		int countDays = maxDaysOfMonth;
		
		int minDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		
		calendar.set(Calendar.DAY_OF_MONTH, minDay);
		for (int i = 1; i <= calendar.getActualMaximum(DAY_OF_MONTH); i++) {
			calendar.set(DAY_OF_MONTH, i);
			if (calendar.get(DAY_OF_WEEK) == SATURDAY || calendar.get(DAY_OF_WEEK) == SUNDAY)
				countDays--;
			
		}
		System.out.println(countDays);
		return 0;
	}
}
