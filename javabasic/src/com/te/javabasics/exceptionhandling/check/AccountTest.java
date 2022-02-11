package com.te.javabasics.exceptionhandling.check;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(20000);
		try {
			account.withdraw();

		} catch (AccountCheckedExcepton e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
