package com.te.javabasic.task;

import java.util.Arrays;

public class ArrayCreate {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
//		int[] arr1 = new int[3];
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i]+",");
			
		}
		System.out.println();
		System.out.print("The Arrays is : ");
		System.out.println(Arrays.toString(arr1));
		
//		long a = 45;
//		int b = (int) a;
		
	}
}
