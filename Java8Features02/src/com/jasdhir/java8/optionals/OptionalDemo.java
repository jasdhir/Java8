package com.jasdhir.java8.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String args[]) {
		Address johnaddress = new Address("52/A, 22nd Street", "Mumbai", "India", 400001);
		Person john = new Person("John", Optional.of(johnaddress), 874731232);
		Person mac = new Person("Mac", Optional.empty(), 333299911);
		Person gautam = new Person("Gautam", Optional.empty(), 533299911);
		List<Person> people = new ArrayList<>();
		people.add(john);
		people.add(mac);
		people.add(gautam);
		people.stream().forEach((p) -> {
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS));
		});
	}

}
