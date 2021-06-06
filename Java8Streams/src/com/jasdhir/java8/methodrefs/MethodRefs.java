package com.jasdhir.java8.methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class MethodRefs {
public static void main(String[] args) {
	//Method reference to instance method from class type –
	List<String> strings = Arrays
	        .asList("A1", "A2", "B1", "C1", "A3", "C2", "B2");
	 
	List<String> sorted = strings
	        .stream()
	        .sorted((s1, s2) -> s1.compareTo(s2))
	        .collect(Collectors.toList());
	 
	System.out.println(sorted);
	 
	List<String> sortedAlt = strings
	        .stream()
	        .sorted(String::compareTo)
	        .collect(Collectors.toList());
	 
	System.out.println(sortedAlt);
	
}
}
