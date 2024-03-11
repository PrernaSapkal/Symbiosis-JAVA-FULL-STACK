package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepUserInsert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
		PreparedStatement co = con.prepareStatement("INSERT INTO STUDENT(ROLLNO,NAME,CITY) VALUES(?,?,?)");
		int ROLLNO = sc.nextInt();
		String Name = sc.next();
		String city= sc.next();
	co.setInt(1, ROLLNO);
	co.setString(2, Name);
	co.setString(3, city);
	int a = co.executeUpdate();
	System.out.println(a);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
