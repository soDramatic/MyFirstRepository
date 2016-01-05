package com.edge1s.excercises.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.edge1s.excercises.utils.Address;

public class Person {

	private String name;
	private String surname;
	private Date birthDate;
	private Address address;

	public Person() {

	}

	public Person(String birthDate) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.birthDate = format.parse(birthDate);
	}

	public Person(String name, String surname, String birthDate, Address address) throws ParseException {

		if (name == null) {
			throw new IllegalArgumentException("Pole name nie moze byc null");
		}
		if (surname == null) {
			throw new IllegalArgumentException("Pole surname nie moze byc null");
		}
		if (birthDate == null) {
			throw new IllegalArgumentException("Pole birthDate nie moze byc null");
		}
		if (address == null) {
			throw new IllegalArgumentException("Pole address nie moze byc null");
		}
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(birthDate);
	}

	// public void setBirthDate(Date birthDate) {
	// this.birthDate = birthDate;
	// }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
