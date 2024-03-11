package com.pojo.borrower;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.pojo.Database.MyConnect;

public class BorrowerOp
{
	
	
	static Scanner sc = new Scanner(System.in);
	public static void checkBorrower()
	{
		System.out.println("enter borrower id");
		int borrowerId = sc.nextInt();
		System.out.println("enter borower name");
		String borrowerName = sc.next();
		Connection co = MyConnect.getConnectionWithDb();
	try {
		Statement st = co.createStatement();
		ResultSet rst = st.executeQuery("SELECT * FROM BORROWER");
		
		boolean b = false;
		while(rst.next())
		{
			int existingId=rst.getInt("borrowerId");
			if(borrowerId == existingId)
			{
				System.out.println("enter book id");
				int bookId = sc.nextInt();
			    PreparedStatement pst = co.prepareStatement("select * from books where BookId = ?")	;
			    pst.setInt(1, bookId);
				ResultSet resultset = pst.executeQuery();
				PreparedStatement Borrower = co.prepareStatement("Insert into borrower(borrowerId,borrowername,BookId,BookName,issuedate)values(?,?,?,?,?);");
				while(resultset.next()) {
					String bookName=resultset.getString("BookName");
					LocalDate date=LocalDate.now();
					Date date1=Date.valueOf(date);	
					Borrower.setInt(1, borrowerId);
					Borrower.setString(2,borrowerName);
					Borrower.setInt(3, bookId);
					Borrower.setString(4, bookName);
					Borrower.setDate(5, date1);	
					Borrower.executeUpdate();
				System.out.println("Book borrowed sussesfully");
				}
				
					
				
				

	b = true;
			break;
			}
		}

		
			 if(!b)
			{
				System.out.println("new user found ?\n for register please press 1");
				int a =sc.nextInt();
				if(a==1)
				{
					PreparedStatement pst = co.prepareStatement("insert into borrower(borrowerId,borrowerName)values(?,?)");
					pst.setInt(1, borrowerId);
					pst.setString(2, borrowerName);
					pst.executeUpdate();
					System.out.println("enter book id");
					int bookId = sc.nextInt();
					PreparedStatement bookInfo=co.prepareStatement("SELECT * FROM BOOKS WHERE BookId=?");
					bookInfo.setInt(1, bookId);
				    ResultSet bookInfo1 = bookInfo.executeQuery();
				   // PreparedStatement borrowerInfo = co.prepareStatement("update borrower set BookId =?,bookName=?,issuedate=? where borrowerId=?");
					PreparedStatement borrowerInfo = co.prepareStatement("Insert into borrower(borrowerId,borrowername,bookId,bookName,issuedate)values(?,?,?);");
					
				    while(bookInfo1.next())
				    {
				    	LocalDate ld= LocalDate.now();
				    	Date d = Date.valueOf(ld);
				    	int bookId1= bookInfo1.getInt("BookId");
				    	String bookName =bookInfo1.getString("bookName");
				    	borrowerInfo.setInt(1, borrowerId);
				    	borrowerInfo.setString(2, borrowerName);
				    	borrowerInfo.setInt(3,bookId1);
				    	borrowerInfo.setString(4, borrowerName);
				        borrowerInfo.setDate(5, d);
				       // borrowerInfo.setInt(4, borrowerId);
				        borrowerInfo.executeUpdate();
				        System.out.println("book issued");
				    }
				}
				
			}
		
	}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	public static void addBorrower()
	{
		System.out.println("enter borrower id");
		int borrowerId = sc.nextInt();
		System.out.println("enter borrower name");
		String borrowerName = sc.next();
		Connection co = MyConnect.getConnectionWithDb();
		try {
			PreparedStatement pst = co.prepareStatement("INSERT INTO BORROWER(BORROWERID,BORROWERNAME) values(?,?)");
		pst.setInt(1, borrowerId);
		pst.setString(2, borrowerName);
		pst.executeUpdate();
			
		} 

		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		public static void updateBorrower()
		{
			System.out.println("enter borrower id to update");
			int borrowerId = sc.nextInt();
			System.out.println("enter name to update ");
			String borrowerName = sc.next();
			Connection co = MyConnect.getConnectionWithDb();
			try {
				PreparedStatement pst1 = co.prepareStatement("UPDATE BORROWER SET borrowerName=? WHERE borrowerId=? ");
				pst1.setString(1, borrowerName);
				pst1.setInt(2, borrowerId);
				
				pst1.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			public static void  deleteBorrower()
			{
				System.out.println("enter borrower id to delete");
				int borrowerId = sc.nextInt();
				Connection co = MyConnect.getConnectionWithDb();
				try {
					PreparedStatement pst = co.prepareStatement("DELETE FROM BORROWER WHERE borrowerId =?");
					pst.setInt(1, borrowerId);
					pst.executeUpdate();
					System.out.println("data deleted successfully");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			public static void displayBorrower() {
				Connection co = MyConnect.getConnectionWithDb();

				try {
					Statement st = co.createStatement();
					ResultSet rst1 = st.executeQuery("SELECT * FROM BORROWER");
					System.out.println("borrowerId"+" "+"borrowerName"+" "+"issueDate"+" "+"submitdate");
					while(rst1.next())
					{
						System.out.println(rst1.getInt("borrowerId")+"  "+rst1.getString("borrowerName")+"  "+rst1.getDate("issueDate")+rst1.getDate("submitdate"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		}
		
		
	


