package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStatementInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
		PreparedStatement co = con.prepareStatement("INSERT INTO STUDENT(ROLLNO,NAME,CITY) VALUES(?,?,?)");
		co.setInt(1, 198);
		co.setString(2, "pranali");
		co.setString(3, "satara");
		int a = co.executeUpdate();
		System.out.println(a);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
