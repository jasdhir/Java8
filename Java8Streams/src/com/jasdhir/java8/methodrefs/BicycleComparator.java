package com.jasdhir.java8.methodrefs;

import java.util.Comparator;

public class BicycleComparator implements Comparator<Bicycle>{

	@Override
	public int compare(Bicycle a, Bicycle b) {
		// TODO Auto-generated method stub
		return a.getFrameSize().compareTo(b.getFrameSize());
	}

}
