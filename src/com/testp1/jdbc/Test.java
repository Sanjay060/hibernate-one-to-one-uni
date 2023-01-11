package com.testp1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		String jdbc="jdbc:mysql://localhost:3306/one-to-one-uni";
		String user="root";
		String pass="root";
		try {
			System.out.println("connecting the database: " + jdbc);
			Connection mycon=DriverManager.getConnection(jdbc,user,pass);
			System.out.println("connected..");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
