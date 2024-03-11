package com.pojo.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pojo.Book;

public class Database
{
	public static void save(ArrayList<Book> List)
{
	Connection co = MyConnect.getConnectionWithDb();
	
	try {
		PreparedStatement pst = co.prepareStatement("INSERT INTO BOOKS(BOOKID,BOOKNAME,AUTHOR)VALUES(?,?,?)");
		for(Book bk : List)
		{
		int BookId = bk.getBookId();
		String bookName = bk.getBookName();
		String author = bk.getAuthor();
		pst.setInt(1, BookId);
		pst.setString(2, bookName);
		pst.setString(3, author);
		pst.executeUpdate();
		
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
