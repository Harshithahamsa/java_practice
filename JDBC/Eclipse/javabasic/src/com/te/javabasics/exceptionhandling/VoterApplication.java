package com.te.javabasics.exceptionhandling;

import java.util.Scanner;

public class VoterApplication {
	public void vote() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
//			System.out.println("Not eligible to vote");
			throw new AgeValidationException("Not eligible for voting");
		}
	}
}
