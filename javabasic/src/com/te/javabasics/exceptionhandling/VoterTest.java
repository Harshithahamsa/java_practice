package com.te.javabasics.exceptionhandling;

public class VoterTest {
	public static void main(String[] args) {
		VoterApplication voterApplication = new VoterApplication();
		try {
			voterApplication.vote();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
