package com.edge1s.excercises.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import com.edge1s.excercises.utils.Position;

public interface ComputeSalaryInterface {
	
	default int computeMonthWorkHours(LocalDate date) throws ParseException {
		return 0;
	} 
	public double computeSalary (Employee employee, LocalDate month) throws ParseException;
	public boolean whetherWorked (LocalDate date, Map<LocalDate, Integer> workingDays);
	public boolean birthDayMonth (String birthDay, LocalDate date);
	public boolean lastMonthInYear (LocalDate date);
	
}
