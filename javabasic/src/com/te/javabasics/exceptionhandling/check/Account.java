package com.te.javabasics.exceptionhandling.check;

import java.util.Scanner;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void withdraw() throws AccountCheckedExcepton {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Amount you want to withdraw");
		int amount = scanner.nextInt();
		if (balance >= amount) {
			this.balance -= amount;
			System.out.println(amount + " Is withdrawn sucessfully");
			System.out.println("Remaining Balance" + this.balance);
		} else {
//			System.out.println("Insuficient Balance");
			throw new AccountCheckedExcepton("insuficient Balance.");
		}
	}
}
