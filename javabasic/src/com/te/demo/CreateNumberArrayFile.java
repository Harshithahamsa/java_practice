package com.te.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class CreateNumberArrayFile {
	public static void main(String[] args) throws IOException {
		int number = 10000;
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myarray.txt",false));
		Number[] arr = new  Number[number];
		for (int i = 1; i <= number; i++) {
			
			arr[i-1] = new Number(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].num);
			
			bufferedWriter.write(arr[i].num);
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
	      System.out.println("Data Entered in to the file successfully");
		
	}
}

class Number {
	public int num;

	public Number(int num) {
		
		this.num = num;
	}
	
}