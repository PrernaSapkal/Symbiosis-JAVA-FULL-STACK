package LibMgmt;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operations op = new Operations();
    while (true) {	
		System.out.println("press 1 for add details \t press 2 for display details \t press 3 for update");
		int ch = sc.nextInt();
		switch (ch) {
	    case 1:
	        op.setData();
	        break;
	    case 2:
	        op.getData();
	        break;
	    case 3:
	        op.updateData();
	        break;
	    default:
	        System.out.println("Invalid choice. Please enter a valid option.");
	}

		
	}
}
}
