package com.pojo.app;

import java.util.Scanner;

import com.pojo.borrower.BorrowerData;
import com.pojo.borrower.BorrowerOp;


public class App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 for book \n press 2 for add borrower name \n press 3 for borrower \n press 4 for issue book \n press 5 for submit book");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			BookData.BookDetails();
			break;
		case 2:
			BorrowerOp.checkBorrower();
			break;
		case 3:
			BorrowerData.startBorrower();
		case 4:
			BookOp.issueBook();
			break;
		case 5:
			BookOp.submitBook();
			break;
			

		}
		
		
	}

}
