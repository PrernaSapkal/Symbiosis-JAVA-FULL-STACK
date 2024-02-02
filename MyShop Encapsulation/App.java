package com.MyShop;

import java.util.Scanner;

public class App {
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
while(true) {
	Operations op=new Operations();
	System.out.println(" press 1 for enter details \n press 2 for see details\n press 3 for update details");
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1:
		op.setData();
		break;
	case 2:
		op.getData();
		break;
	case 3:
		op.updateData();
		break;
		
	}
}
	}
}