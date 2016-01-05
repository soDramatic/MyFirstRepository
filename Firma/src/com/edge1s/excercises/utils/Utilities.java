package com.edge1s.excercises.utils;

import java.util.Map;

import com.edge1s.excercises.company.Employee;

public class Utilities {

	public static void displayingMaps(Map<Integer, Employee> mapForDisplaying) {

		for (Map.Entry<Integer, Employee> entry : mapForDisplaying.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue().getSurname());
		}
	}

	public static void checkingEmployees(Map<Integer, Employee> mapOfEmployees) {
		for (Map.Entry<Integer, Employee> entry : mapOfEmployees.entrySet()) {
			if (entry.getValue().getSalaryPerHour() == 55.1f) {
			Utilities.displaying(entry.getValue());
			}
		}
	}

	public static void displaying(Employee employee){
	
		System.out.println("Employee: \n" + employee.getName() + " " + employee.getSurname()
			+ "\nSalary per hour: " + employee.getSalaryPerHour() + "\nDepartment: " + employee.getDepartment()
			+ "\nPosition: " + employee.getPosition() + "\nCity: " + employee.getAddress().getCity() 
			+ "\n" + employee.getAddress().getCityCode() + "\n" + employee.getAddress().getStreet()
			+ "\n" + employee.getAddress().getApartamentNumber() + "//" + employee.getAddress().getHomeNumber());
		
	}

}
