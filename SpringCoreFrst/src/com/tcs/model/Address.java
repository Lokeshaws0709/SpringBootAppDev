package com.tcs.model;

public class Address {

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	private String city;

	private String hno;

	@Override
	public String toString() {
		return "Address [city=" + city + ", hno=" + hno + "]";
	}

}
