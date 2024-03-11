package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
			Statement st = co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM MYDEMO");
			while(rst.next())
			{
				int ROLLNO = rst.getInt("ROLLNO");
				String NAME = rst.getString("NAME");
				String CITY = rst.getString("CITY");
				System.out.println(ROLLNO+NAME+CITY);
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
	