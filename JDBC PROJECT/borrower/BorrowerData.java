package com.pojo.borrower;

import java.util.Scanner;

public class BorrowerData {

	public static void startBorrower() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 for add borrower\n press 2 for update borrower data \n press 3 for delete borrower \n press 4 for display");
		int ch =sc.nextInt();
		switch(ch)
		{
		case 1:
			BorrowerOp.addBorrower();
			break;
			
		case 2:
			BorrowerOp.updateBorrower();
			break;
			
		case 3:
			BorrowerOp.deleteBorrower();
			break;
			
		case 4:
			BorrowerOp.displayBorrower();
			break;
			
		}
		
		
	}

}
