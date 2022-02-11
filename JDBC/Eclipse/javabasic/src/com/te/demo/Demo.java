package com.te.demo;

import java.util.ArrayList;
import java.util.LinkedList;


public class Demo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("hello");
		linkedList.add("hi");
		linkedList.add("world");
		linkedList.add("hell");
		linkedList.add("earth");
		
		System.out.println(linkedList.get(3));
		
		ArrayList<String> arrayList =new ArrayList<String>(linkedList);
		
		System.out.println(arrayList);
	}
}
