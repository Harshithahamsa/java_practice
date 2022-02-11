package com.te.collectiondemo;

import java.util.Iterator;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList(3);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(30);arrayList.add(30);
		arrayList.add(30);
		arrayList.add(30);
		
		System.out.println(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
	}
}
