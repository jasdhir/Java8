package com.jasdhir.java8.optionals;

class Address {
	public static final Address EMPTY_ADDRESS = new Address("", "", "", 0);
	private final String line1;
	private final String city;
	private final String country;
	private final int zipcode;

	public Address(String line1, String city, String country, int zipcode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String line1() {
		return line1;
	}

	public String city() {
		return city;
	}

	public String country() {
		return country;
	}

	public int zipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}';
	}
}
