package com.pojo.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
public static Connection getConnectionWithDb()
{
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection co = null;
	try {
		co = DriverManager.getConnection("jdbc:mysql://localhost:3306/kbplibrary","root","root");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return co;
	
}
}
