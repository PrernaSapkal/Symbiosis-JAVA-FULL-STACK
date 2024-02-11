package com.MyShop.home.app.customer;

import java.util.Scanner;

import com.MyShop.Appliances;

public class CustomersOp {
	static Scanner sc = new Scanner(System.in);
	static Customers cm = new Customers();
	public static void getBilling()
	{	
		try
		{
    System.out.println("enter ID of customer");
    int CustId = sc.nextInt();
    System.out.println("enter customer name");
    String CustName = sc.next();
    System.out.println("enter quantity");
    
    double quantity = sc.nextDouble();
    System.out.println("enter amount by customer");
    double amountByCustomer = sc.nextDouble();    
    System.out.println("enter total amount");
    double totalAmount = sc.nextDouble();    
	cm.setCustId(CustId);
	cm.setCustName(CustName);
	cm.setQuantity(quantity);
	cm.setAmoungtByCustomers(amountByCustomer);
	Appliances appliances =cm.getAp();
	int Stock = appliances.getStock();
	System.out.println(CustomersOp.getStockStatus(quantity,Stock));
	System.out.println(CustomersOp.giveChange(amountByCustomer,totalAmount));
	System.out.println(cm.getCustId());
	System.out.println(cm.getCustName());
	}
		catch (java.util.InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid number.");
		}
	}
	
	public static String getStockStatus(double quantity, int Stock) {
	    System.out.println("billing details");
	    if (Stock >= quantity) {
	        System.out.println(Stock - quantity);
	        return "Sufficient Stock";
	    } else {
	        System.out.println(quantity - Stock);
	        return "Insufficient Stock";
	    }
	}

	public static double giveChange(double amountByCustomer , double totalAmount) {
		System.out.println(totalAmount-amountByCustomer+"needs to return");
		return 0;
	}	 
	 public static Appliances setOpToCustomer(Appliances ap)
	 {
		 cm.setAp(ap);
		 return ap;
	 }
	
}
	
	
	
	
	
	
	
	

