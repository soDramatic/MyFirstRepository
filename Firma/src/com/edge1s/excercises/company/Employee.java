package com.edge1s.excercises.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.edge1s.excercises.utils.Address;
import com.edge1s.excercises.utils.Department;
import com.edge1s.excercises.utils.Position;

public class Employee extends Person {

	private int id;
	private Date dateOfEmployment;
	protected Position position;
	protected Department department;
	private float salaryPerHour;
	private float incrementSalaryPerHour;
	private Date dateOfLastIncrementSalary;
	private Map<LocalDate, Integer> workingDays = new HashMap<>();
	static Scanner in = new Scanner(System.in);

	public Employee() {
	}

	public Employee(String birthDate) throws ParseException {
		super(birthDate);
	}

	public Employee(int id, String dateOfEmployment, Position position, Department department, float salaryPerHour,
			String name, String surname, String birthDate, Address address) throws ParseException {

		super(name, surname, birthDate, address);
		this.id = id;
		this.position = position;
		this.department = department;
		this.salaryPerHour = salaryPerHour;
		this.incrementSalaryPerHour = 0;

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		this.dateOfEmployment = format.parse(dateOfEmployment);
		this.dateOfLastIncrementSalary = null;
	}

	public Map<Integer, Employee> incrementSalary(Map<Integer, Employee> mapOfEmployees) {

		Employee employee = null;

		for (Map.Entry<Integer, Employee> entry : mapOfEmployees.entrySet()) {
			employee = entry.getValue();
			if (employee.getDepartment() == null) {
				throw new IllegalArgumentException("Department is null");
			} else {
				if (employee.equals(Department.ADMINISTRATION)) {
					employee.setSalaryPerHour(20.2f);
				}
				if (employee.equals(Department.MANAGMENT)) {
					employee.setSalaryPerHour(55.1f);
				}
				if (employee.equals(Department.IT)) {
					employee.setSalaryPerHour(13.1f);
				}
			}
		}
		return mapOfEmployees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public float getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(float salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public Map<LocalDate, Integer> getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(Map<LocalDate, Integer> workingDays) {
		this.workingDays = workingDays;
	}

	public float getIncrementSalaryPerHour() {
		return incrementSalaryPerHour;
	}

	public void setIncrementSalaryPerHour(float incrementSalaryPerHour) {
		this.incrementSalaryPerHour = incrementSalaryPerHour;
	}

	public Date getDateOfLastIncrementSalary() {
		return dateOfLastIncrementSalary;
	}

	public void setDateOfLastIncrementSalary(Date dateOfLastIncrementSalary) {
		this.dateOfLastIncrementSalary = dateOfLastIncrementSalary;
	}
}
