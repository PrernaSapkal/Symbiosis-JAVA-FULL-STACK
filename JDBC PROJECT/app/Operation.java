package com.pojo.app;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.pojo.Book;
import com.pojo.MultipleBooks;
import com.pojo.Database.MyConnect;

public class Operation {
static Scanner sc = new Scanner(System.in);
static MultipleBooks obj = new MultipleBooks();
public static void setBook()
{
	int ch =1;
	while(ch==1)
	{

	
	Book bk = new Book();
	System.out.println("enter book id");
	int bookId = sc.nextInt();
	bk.setBookId(bookId);
	System.out.println("enter book name");
	String bookName=sc.next();
	bk.setBookName(bookName);
	System.out.println("enter author name ");
	String author=sc.next();
	bk.setAuthor(author);
	
	obj.setToList(bk);
	System.out.println("Press 1 for add more books \n Press 2 for save book");
    ch = sc.nextInt();
	 if(ch==2)
	 {
		obj.SaveData(); 
	 }
	}
}
	public static void updateName()
	{
		System.out.println("press 1 for update book name \n press 2 for author name");
		int ch = sc.nextInt();
		System.out.println("enter book id");
		int bookId = sc.nextInt();
		Connection co = MyConnect.getConnectionWithDb();
	switch(ch) {
		case 1:
			System.out.println("enter name to update ");
			String BookName = sc.next();
		try {
			PreparedStatement pt = co.prepareStatement("update books set bookname =? where bookid=?");
			pt.setString(1, BookName);
			pt.setInt(2, bookId);
			pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			break;
		case 2:
			System.out.println("enter author name to be updated");
			String author = sc.next();
		try {
			PreparedStatement pt1=co.prepareStatement("update books set author =? where bookid=?");
			pt1.setString(1, author);
			pt1.setInt(2, bookId);
			pt1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	public static void DeleteData()
	{
		Connection co = MyConnect.getConnectionWithDb();
		System.out.println("enter bookid to delete");
		int bookId = sc.nextInt();
		try {
			PreparedStatement pst = co.prepareStatement("delete from books where bookId =?");
			pst.setInt(1, bookId);
			System.out.println("deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}



