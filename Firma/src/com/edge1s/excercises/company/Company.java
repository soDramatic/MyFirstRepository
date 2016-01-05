package com.edge1s.excercises.company;

import java.awt.RenderingHints.Key;
import java.lang.management.ManagementPermission;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

import javax.net.ssl.ManagerFactoryParameters;

import com.edge1s.excercises.utils.Address;
import com.edge1s.excercises.utils.Department;
import com.edge1s.excercises.utils.Position;
import com.edge1s.excercises.utils.Utilities;

public class Company {

	private static Map<Integer, Employee> mapForManagment;
	private static Map<Integer, Employee> mapForAdministration;
	private static Map<Integer, Employee> mapForIt;

	public static void main(String args[]) throws Exception {

		try {
			Map<Integer, Employee> mapOfEmployees = new HashMap<>();
			ComputeSalaryImpl salary = new ComputeSalaryImpl();

			Address address1 = new Address("Krasiñskiego", "Lublin", "21-709", 12, 31);
			Employee employee1 = new Employee(1, "01/11/2015", Position.QA, Department.IT, (float) 15.5, "Marcin",
					"Zió³kowski", "19/05/1992", address1);

			Address address2 = new Address("G³êboka", "Lublin", "24-123", 5, 123);
			Employee employee2 = new Employee(2, "01/01/2013", Position.DEVELOPER, Department.IT, (float) 10.1,
					"Micha³", "Developer", "12/04/1987", address2);

			Address address3 = new Address("Szeligowskiego", "Lublin", "34-321", 11, 321);
			Employee employee3 = new Employee(3, "05/08/2010", Position.ACCOUNTANT, Department.ADMINISTRATION,
					(float) 20.2, "Ahmed", "Buuuum", "12/04/1987", address3);

			Address address4 = new Address("Szeligowskiego", "Lublin", "34-321", 11, 321);
			Employee employee4 = new Employee(4, "12/09/2005", Position.IT_MANAGER, Department.MANAGMENT, (float) 20.2,
					"Imiê", "Nazwisko", "10/06/1969", address4);

			Address address5 = new Address("Domaniewska", "Warszawa", "02-460", 21, 111);
			Employee employee5 = new Employee(5, "30/03/2002", Position.VICE_PRESIDENT, Department.ADMINISTRATION,
					(float) 43.0, "Yoga", "Lenovo", "25/09/1980", address5);

			Address address6 = new Address("Lipna", "Sosnowiec", "09-090", 15, 12);
			Employee employee6 = new Employee(6, "12/12/2015", Position.SECRETARY, Department.ADMINISTRATION, 12.4f,
					"Agnieszka", "D¹b", "12/12/1990", address6);

			Address address7 = new Address("Chytra", "Radom", "11-191", 2, 30);
			Employee employee7 = new Employee(7, "01/14/2015", Position.QA, Department.IT, 9.2f, "Wojtek", "Kiu³ej",
					"25/05/1982", address7);

			mapOfEmployees.put(1, employee1);
			mapOfEmployees.put(2, employee2);
			mapOfEmployees.put(3, employee3);
			mapOfEmployees.put(4, employee4);
			mapOfEmployees.put(5, employee5);
			mapOfEmployees.put(6, employee6);
			mapOfEmployees.put(7, employee7);

			Company company = new Company();

			list.add(employee1);
			list.add(employee2);
			list.add(employee3);
			list.add(employee4);
			list.add(employee5);
			list.add(employee6);
			list.add(employee7);

			company.divisionEmployees(list);

			// Utilities.displayingMaps(mapForManagment);
			// Utilities.displayingMaps(mapForAdministration);
			// Utilities.displayingMaps(mapForIt);
//			Utilities.checkingEmployees(mapOfEmployees);
			Utilities.displaying(employee1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static List<Employee> list = new ArrayList<>();
	private ComputeSalaryImpl computeSalary;
	private Map<Integer, Integer> map = new HashMap<>();

	public void divisionEmployees(List<Employee> list) throws IllegalAccessException {

		mapForManagment = new HashMap<>();
		mapForAdministration = new HashMap<>();
		mapForIt = new HashMap<>();

		for (Employee employee : list) {

			if (employee.getDepartment() == null) {
				throw new IllegalArgumentException("Department is null");
			} else {
				if (employee.getDepartment().equals(Department.MANAGMENT)) {
					employee.incrementSalary(mapForManagment);
					mapForManagment.put(employee.getId(), employee);
				}
				if (employee.getDepartment().equals(Department.ADMINISTRATION)) {
					employee.incrementSalary(mapForAdministration);
					mapForAdministration.put(employee.getId(), employee);
				}
				if (employee.getDepartment().equals(Department.IT)) {
					employee.incrementSalary(mapForIt);
					mapForIt.put(employee.getId(), employee);
				}
			}
		}
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public ComputeSalaryImpl getComputeSalary() {
		return computeSalary;
	}

	public void setComputeSalary(ComputeSalaryImpl computeSalary) {
		this.computeSalary = computeSalary;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}
}
