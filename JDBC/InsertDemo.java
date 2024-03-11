package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
					e.printStackTrace();
		}
		try {
			Scanner sc = new Scanner(System.in);
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
			Statement st = co.createStatement();
			
			int ROLLNO = sc.nextInt();
			String name = sc.next();
			String city = sc.next();
			int ra = st.executeUpdate("INSERT INTO STUDENT(ROLLNO,NAME,CITY) VALUES ("+ROLLNO+",'"+name+"','"+city+"');");
			System.out.println(ra+" rows inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
