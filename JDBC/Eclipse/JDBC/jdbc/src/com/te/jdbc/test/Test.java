package com.te.jdbc.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DeleteData deleteData = new DeleteData();
		InsertData insertData = new InsertData();
		UpdateData updateData = new UpdateData();
		ReadData readData = new ReadData();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to insert the data");
		System.out.println("press 2 to read the data");
		System.out.println("press 3 to update the data");
		System.out.println("press 4 to delete the data");
		int input = scanner.nextInt();
		switch (input) {
		case 1: 
			insertData.insertData();
			break;
			
		case 2: 
			readData.readData();
			break;
		
		case 3: 
			updateData.updateData();
			break;
			
		case 4: 
			deleteData.deleteData();
			break;
		default:
			break;
		}
	}
}
