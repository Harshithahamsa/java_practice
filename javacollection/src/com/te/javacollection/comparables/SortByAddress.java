package com.te.javacollection.comparables;

import java.util.Comparator;

public class SortByAddress implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.address.compareTo(o2.address);
	}
	
}
