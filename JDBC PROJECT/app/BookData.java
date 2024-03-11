package com.pojo.app;

import java.util.Scanner;

import com.pojo.borrower.BorrowerOp;

public class BookData {
	public static void BookDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 for set Book\n press 2 for update book \n press 3 for delete book ");
		int ch =sc.nextInt();
		switch(ch)
		{
		case 1:
			Operation.setBook();
			break;
		case 2:
			Operation.updateName();
			break;
		case 3:
			Operation.DeleteData();
			break;
			
	}
	}
	
}
