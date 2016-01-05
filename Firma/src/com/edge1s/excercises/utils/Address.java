package com.edge1s.excercises.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {

	final static String FIRST = "[0-9]{2}-[0-9]{3}";
	final static String SECOND = "\\d{5}";

	private String street;
	private String city;
	private String cityCode;
	private int homeNumber;
	private int apartamentNumber;

	public Address(String street, String city, String cityCode, int homeNumber, int apartmentNumber) throws Exception {
		if (street == null)
			throw new IllegalArgumentException("Pole street nie moze byc null");
		if (city == null)
			throw new IllegalArgumentException("Pole city nie moze byc null");
		if (cityCode == null)
			throw new IllegalArgumentException("Pole cityCode nie moze byc null");

		this.street = street;
		this.city = city;
		this.cityCode = cityCodeFormatting(cityCode);
		this.homeNumber = homeNumber;
		this.apartamentNumber = apartmentNumber;

	}

	private String cityCodeFormatting(String cityCode) throws Exception {
		Pattern pattern = Pattern.compile("\\d{5}|[0-9]{2}-[0-9]{3}");
		Matcher matcher = pattern.matcher(cityCode);

		if (matcher.matches()) {
			if (cityCode.matches(FIRST)) {
				return cityCode;
			} else if (cityCode.matches(SECOND)) {
				return cityCode.substring(0, 1) + "-" + cityCode.substring(2, 4);
			}
		} else
			throw new Exception("B³êdny kod pocztowy");
		return cityCode;

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getApartamentNumber() {
		return apartamentNumber;
	}

	public void setApartamentNumber(int apartamentNumber) {
		this.apartamentNumber = apartamentNumber;
	}
}
