package com.edge1s.excercises.company;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;

import javax.print.attribute.HashAttributeSet;

import com.edge1s.excercises.utils.Position;

public class ComputeSalaryImpl implements ComputeSalaryInterface {

	public final static String DATE_FORMAT = "yyyy-MM";

	public int computeMonthWorkHours(LocalDate date) throws ParseException {

		int allDaysInMonth = date.lengthOfMonth();
		int freeDaysInMonth = 0;
		LocalDate dateToCheck;

		for (int firstDay = 1; firstDay <= allDaysInMonth; firstDay++) {
			dateToCheck = LocalDate.of(date.getYear(), date.getMonthValue(), firstDay);

			if (dateToCheck.getDayOfWeek() == DayOfWeek.SATURDAY || dateToCheck.getDayOfWeek() == DayOfWeek.SUNDAY) {
				freeDaysInMonth++;
			}
		}
		return (allDaysInMonth - freeDaysInMonth);
	}
	
	// String dateBeforeFormat = year + "-" + month;
	// SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
	// Date date = format.parse(dateBeforeFormat);
	// Calendar calendar = Calendar.getInstance();
	//
	// int countDays = calendar.getActualMaximum(DAY_OF_MONTH);
	// calendar.set(Calendar.DAY_OF_MONTH,
	// calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
	// for (int i = 1; i <= calendar.getActualMaximum(DAY_OF_MONTH); i++) {
	// calendar.set(DAY_OF_MONTH, i);
	// if (calendar.get(DAY_OF_WEEK) == SATURDAY ||
	// calendar.get(DAY_OF_WEEK) == SUNDAY)
	// countDays--;
	// }
	// return countDays * 8;

	@Override
	public double computeSalary(Employee employee, LocalDate month) throws ParseException {

		Map<LocalDate, Integer> workingDays = employee.getWorkingDays();

		double salaryPerHour = employee.getSalaryPerHour();
		int workedHours = computeMonthWorkHours(month);
		double salary = salaryPerHour * workedHours;

		if (whetherWorked(month, workingDays)) {
			if (birthDayMonth(employee.getBirthDate(), month)) {
				salary += (salary * 0.5);
			}
			if (lastMonthInYear(month)) {
				salary += (salary * 2);
			}
		}
		return salary;
	}

	@Override
	public boolean whetherWorked(LocalDate date, Map<LocalDate, Integer> workingDays) {

		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("MM-yyyy");
		String month = date.format(dataFormatter);

		for (Map.Entry<LocalDate, Integer> checkMonth : workingDays.entrySet()) {
			LocalDate key = checkMonth.getKey();
			String keyMonth = key.format(dataFormatter);

			if (month.equals(keyMonth)) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public boolean birthDayMonth(String birthDay, LocalDate date) {
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM");
		String dateCheck = date.format(formatDate);

		// String dateOfBirthDay = birthDay.format(formatDate);
		if (dateCheck.equals(birthDay)) {
			return true;
		} else
			return false;
	}

	public boolean lastMonthInYear(LocalDate date) {

		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM");
		String dateCheck = date.format(formatDate);

		if (dateCheck.equals(Calendar.DECEMBER)) {
			return true;
		} else {
			return false;
		}
	}
}