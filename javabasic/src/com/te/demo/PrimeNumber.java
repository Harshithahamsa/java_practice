package com.te.demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number,count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not :- ");
		number = scanner.nextInt();
		if (number == 1) {
			System.out.println("Enter a valid number, '1' is a natural number");
		} else {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count ++;
				}
			}
			if (count == 2) {
				System.out.println("prime number");
			} else {
				System.out.println("not prime number");
			}
		}
	}
}
