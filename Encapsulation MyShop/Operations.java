package com.MyShop;

import java.time.LocalDateTime;
import java.util.Scanner;
import com.MyShop.home.app.customer.CustomersOp;
public class Operations {
	static Scanner sc = new Scanner(System.in);
	static Appliances ap = new Appliances();
	
	public void setData(){
		try
		{
	System.out.println("enter Id");
	int ID = sc.nextInt();
	ap.setProductId(ID);
	
	System.out.println("enter name");
	ap.setProductName(sc.next());
	
	System.out.println("enter product price ");
	double ProductPrice = sc.nextDouble();
	double GST = ProductPrice+(ProductPrice*18)/100;
	ap.setProductPrice(ProductPrice);
	ap.setGST(GST);
	
	CustomersOp.setOpToCustomer(ap);
	System.out.println("enter stock");
	int Stock = sc.nextInt();
	ap.setStock(ID);
	
	System.out.println("*******************Details added successfully**********************");
	}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            // Clear the input buffer
            sc.nextLine();
            // Allow the user to enter a valid number immediately
            setData();
	}
	}
	
	public void getData()
	{
		
		System.out.println("********************Product information********************************");
		System.out.println("ProductId is    =  " + ap.getProductId());
		System.out.println("ProductName is  =  " + ap.getProductName());
		System.out.println("ProductPrice is =  " + ap.getProductPrice());
		System.out.println("GST is          =  " + ap.getGST());
	}
	public void updateData()
	{
		System.out.println(" press 1 for update ID \n press 2 for update name \n press 3 for update price ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter new Id");
			int ID = sc.nextInt();
			ap.setProductId(ID);
			System.out.println("product Id updated at :"+LocalDateTime.now());
			CustomersOp.setOpToCustomer(ap);
			break;
		case 2:
			System.out.println("enter name");
			ap.setProductName(sc.next());
			System.out.println("product namew updated at :"+LocalDateTime.now());
			CustomersOp.setOpToCustomer(ap);
			break;
		case 3:
			System.out.println("enter product price ");
			ap.setProductPrice(sc.nextDouble());
			System.out.println("product price updated at :"+LocalDateTime.now());
			CustomersOp.setOpToCustomer(ap);
			break;
		}
	}
}

