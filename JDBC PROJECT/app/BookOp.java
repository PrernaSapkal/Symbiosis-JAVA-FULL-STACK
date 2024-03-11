package com.pojo.app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.pojo.Database.MyConnect;
import com.pojo.borrower.BorrowerOp;

public class BookOp {
	static BorrowerOp bo = new BorrowerOp();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void issueBook()
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
		boolean checkData = false;
		boolean checkData1 = false;	 
		
		while (rst.next()) {
		    int existingId = rst.getInt("borrowerId");
		    if (borrowerId == existingId) {
		    	PreparedStatement pts=co.prepareStatement("SELECT COUNT(BOOKID) FROM BORROWER WHERE BORROWERID=?");
				pts.setInt(1, borrowerId);
				ResultSet rtr=pts.executeQuery();
		    	 while (rtr.next()) {
					 int counts = rtr.getInt(1);
					 if(counts<3) {
			            checkData1 = true;
			          
					 }
					 				 
			        }
		    	 
			        if (checkData1 == true) 
			        	 {
			        	 
			            System.out.println("enter book id");
				        int bookId = sc.nextInt();
				        
				        
				           PreparedStatement cnt=co.prepareStatement("SELECT COUNT(BOOKID) FROM BORROWER WHERE BOOKID = ? AND BORROWERID = ?");
	                       cnt.setInt(1, bookId);
	                       cnt.setInt(2, borrowerId);
	                       ResultSet rt1 =cnt.executeQuery();
	             

		        PreparedStatement pst = co.prepareStatement("select * from books where BookId = ?");
		        pst.setInt(1, bookId);
		        ResultSet resultset = pst.executeQuery();

		        PreparedStatement verify = co.prepareStatement("SELECT * FROM BORROWER WHERE BORROWERID =? AND BOOKID IS NULL");
		        verify.setInt(1, borrowerId);
		        ResultSet rt = verify.executeQuery();

		        while (rt.next()) {
		            checkData = true;
		        }

		        if (checkData == false) 
		        	 {
		        	
		            PreparedStatement BorrowerInsert = co.prepareStatement("Insert into borrower(borrowerid,borrowername,BookId,BookName,issuedate,duedate)values(?,?,?,?,?,?)");
		          BorrowerInsert.setInt(1, borrowerId);
		            BorrowerInsert.setString(2, borrowerName);
		            while (resultset.next()) {
		                String bookName = resultset.getString("BookName");
		                LocalDate date = LocalDate.now();
		                Date date1 = Date.valueOf(date);
		                LocalDate duedate = date.plusDays(15);
		                Date d1 = Date.valueOf(duedate);
		                BorrowerInsert.setInt(3, bookId);
		                BorrowerInsert.setString(4, bookName);
		                BorrowerInsert.setDate(5, date1);
		                BorrowerInsert.setDate(6,d1);
		                BorrowerInsert.executeUpdate();
		            }
		               
		            

		            PreparedStatement verifyBook = co.prepareStatement("SELECT * FROM BORROWER WHERE BORROWERID = ? AND BOOKID = ?");
		            verifyBook.setInt(1, borrowerId);
		            verifyBook.setInt(2, bookId);
		            ResultSet rtBook = verifyBook.executeQuery();

		            boolean duplicateBook = false;

		            while (rtBook.next()) {
		            	duplicateBook = true;
		            }

		            if (duplicateBook) {
		                System.out.println("The book is already issued to the borrower. You cannot issue the same book again.");
		            } else {
		                if (checkData1 == false) {
		                    System.out.println("You already borrowed 3 books!");
		                }
		                b = true;
		                break;
		            }
		        	 }
					else
					{
		
						PreparedStatement BorrowerUpdate = co.prepareStatement("UPDATE BORROWER SET BookId=?,bookName=?,issuedate=?,duedate=? WHERE BorrowerId=?");
						while (resultset.next()) {
						    String bookName=resultset.getString("bookName");
							LocalDate date=LocalDate.now();
							Date date1=Date.valueOf(date);	
							BorrowerUpdate.setInt(1, bookId);
							BorrowerUpdate.setString(2, bookName);
							BorrowerUpdate.setDate(3, date1);	
							
							LocalDate DueDate = date.plusDays(15);
							Date dates = Date.valueOf(DueDate);
							BorrowerUpdate.setDate(4, dates);
							BorrowerUpdate.setInt(5, borrowerId);
						    BorrowerUpdate.executeUpdate();
						}
						}	
			        	 }
			        if(checkData1==false) {
			        	System.out.println("You already borrow 3 books!");
			        }
				b=true;
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
						PreparedStatement borrowerInfo = co.prepareStatement("Insert into borrower(borrowerId,borrowername,bookId,bookName,issuedate)values(?,?,?,?,?);");
						
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

	
public static void submitBook()
{
	System.out.println("enter borrower id");
	int borrowerId = sc.nextInt();
	System.out.println("enter book id");
	int bookId = sc.nextInt();
	Connection co = MyConnect.getConnectionWithDb();
	try {
		PreparedStatement pst = co.prepareStatement("UPDATE BORROWER SET submitDate=? where bookId=? AND BorrowerId=?");
		LocalDate date = LocalDate.now();
		Date date1 = Date.valueOf(date);
		pst.setDate(1, date1);
		pst.setInt(2, bookId);
		pst.setInt(3, borrowerId);
	    pst.executeUpdate();
	    System.out.println("submiited");
PreparedStatement pt1 = co.prepareStatement("SELECT ISSUEDATE,SUBMITDATE FROM BORROWER WHERE BOOKID=? AND BORROWERID =?");
	   pt1.setInt(1, bookId);
	   pt1.setInt(2, borrowerId);
	   ResultSet rt = pt1.executeQuery();
	   while(rt.next()) {
	   Date issuedate = rt.getDate("issuedate");
	   LocalDate dates = issuedate.toLocalDate();
	   
	   Date submitdate = rt.getDate("submitdate");
	   LocalDate dates2 = submitdate.toLocalDate();
	   
	   long days = ChronoUnit.DAYS.between(dates,dates2);
	   if(days>15)
	   {
		   int fineday = (int) (days-15);
		   int fine = fineday*100;
		   PreparedStatement ptt=co.prepareStatement("UPDATE BORROWER SET FINE =? WHERE BOOKID=? AND BORROWERID=?");
		   ptt.setInt(1, fine);
		   ptt.setInt(2, bookId);
		   ptt.setInt(3, borrowerId);
		   ptt.executeUpdate();
		   BorrowerOp.displayBorrower();
	   }
	   else
	   {
		   PreparedStatement ptt=co.prepareStatement("UPDATE BORROWER SET FINE =? WHERE BOOKID=? AND BORROWERID=?");
		   ptt.setInt(1, 0);
		   ptt.setInt(2, bookId);
		   ptt.setInt(3, borrowerId);
		   ptt.executeUpdate();
		   BorrowerOp.displayBorrower();
	   }
	   
	} 
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
			
}
	
}

	
	





