package com.MyShop;

import java.util.Scanner;

public class Test implements MyShop{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("press 1 for mobiles\t press 2 for TV \t press 3 for AC");
		System.out.println("enter your choice ");
		Operations obj = new Operations();
		
		
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			obj.getMobiles();
		case 2:
			obj.getTV();
		case 3:
			obj.getAC();
			
		}

	}

	@Override
	public String getProductId() {
		return null;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPrice() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCateogory() {
		return null;
	
		
	}

}
