package com.te.javacollection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetImpl {
	public static void main(String[] args) {
		HashSet<Integer> hashSet =new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		System.out.println(hashSet);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(20);
		System.out.println(linkedHashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(70);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(50);
		System.out.println(treeSet);
		
	}
}
