package com.te.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListImpl {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(2, 60);
//		arrayList.remove(3);
		System.out.println(arrayList);
		
		System.out.println("=======1st way of iterating using forloop==========");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("=======2nd way of iterting using foreachloop===============");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		System.out.println("======3rd way of iterting using iterator()===========");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("========4th way of iterting using listiterator==============");
	 	ListIterator iterator2 = arrayList.listIterator();
	 	while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
	 	System.out.println("========5th way of iterting using listiterator backward================");
	 	ListIterator iterator3 = arrayList.listIterator(arrayList.size());
	 	while (iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());
			
		}
	}
	
}
