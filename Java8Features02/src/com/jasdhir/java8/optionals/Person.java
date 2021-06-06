package com.jasdhir.java8.optionals;

import java.util.Optional;

class Person {
	private String name;
	private Optional<Address> address;
	private int phone;

	public Person(String name, Optional<Address> address, int phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public Optional<Address> address() {
		return address;
	}

	public int phone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
	}
}
