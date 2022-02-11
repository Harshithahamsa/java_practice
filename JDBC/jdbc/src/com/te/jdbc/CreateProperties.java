package com.te.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {
	public static void main(String[] args) {
		Properties properties =new Properties();
		properties.setProperty("url", "jdbc:mysql://localhost:3306/student");
		properties.setProperty("username", "root");
		properties.setProperty("password", "root");
		properties.setProperty("helo", "bcajgcbiuavhoch");
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("dbadasdad.properties");
			try {
				properties.store(fileOutputStream, "This is my credential");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
