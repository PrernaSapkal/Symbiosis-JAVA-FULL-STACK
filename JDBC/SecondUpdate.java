package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
			Statement st = co.createStatement();
			int i = st.executeUpdate("UPDATE STUDENT SET NAME='PERU' WHERE NAME ='PRERNA';");
			System.out.println(i+" rows affected ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
