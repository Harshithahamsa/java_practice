package com.te.collectiondemo;

public class MyArrayList {
	private Object[] array;
	private int position;

	public MyArrayList(int arraysize) {
		this.array = new Object[arraysize];
	}
	
	public void add(Object element) {
		if (position >= array.length) {
			grow();
		}
		this.array[position ++] = element;
	}
	
	public Object get(int index) {
		return this.array[index];
	}
	
	public int size() {
		return this.position;
	}
	
	public void grow() {
		Object[] temp = new Object[this.array.length + 3];
		System.arraycopy(array, 0, temp, 0, array.length);
		this.array = temp;
	}
	
	public String toString(){
		String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;
		
	}
}
