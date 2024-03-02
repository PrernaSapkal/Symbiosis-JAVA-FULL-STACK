package com.Demo;

import java.util.Scanner;

public class TaxDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total income");
	    double income = sc.nextInt();
	    System.out.println(TaxDemo.taxRegime(income));
	}
	public static double taxRegime(double income)
	{
		if(income > 1500001)
		{
			return 187500+((1500000)-(0.3*income)-(1500000));
		}
		else if(income > 1250001)
		{
			return 125000+((1250000)-(0.25*income));	
		}
		else if(income > 1000001)
		{
			return 75000+((1000000)-(0.2*income));	
		}
		else if(income > 750001)
		{
			return 37500+((750000)-(6.67*income));
		}
		else if(income>500001)
		{
			return 12500+((500000)-(0.1*income));
		}else 
			
		return income;
	}	
}
