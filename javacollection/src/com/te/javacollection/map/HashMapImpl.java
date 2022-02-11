package com.te.javacollection.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "Roy");
		map.put(200, "Roy");
		map.put(300, "Sam");
		map.put(400, "Sam");
		System.out.println(map);
		
		System.out.println("=========get()=============");
		System.out.println(map.get(100));
		
		System.out.println("======keySet()=====================");
		Set<Integer> integers = map.keySet();
		System.out.println(integers);
		
		System.out.println("=============values()====================");
		Collection<String> collection = map.values();
		System.out.println(collection);
		
		System.out.println("==============entrySet()================");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		System.out.println(set);
		
		System.out.println("==========================");
		for(Map.Entry<Integer, String> entry : set) {
			
			if (entry.getKey()==100) {
				System.out.println(entry.setValue("Dom"));
			}
			System.out.println(entry);
		}
		
		
	}
}
