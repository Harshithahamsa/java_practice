package com.te.demo;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String input = scanner.nextLine();
		System.out.println(input.length());
		char character[] = input.toCharArray();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			int k = i;
			while (i < input.length() && character[i]!= ' ') {
				i++;
			}
			int spaceprevious = i-1;
			System.out.println(i);
//			hellSystem.out.println("This"+character[i]+"is");
			
			while (k <= spaceprevious) {
				result = result + character[spaceprevious];
				spaceprevious--;
			}
//			System.out.println(character[i]);
			System.out.println(i);
			if (i < input.length()) {
				result = result + character[i];
			}
		}
		System.out.println(result);
		
	}
}
