package com.Demo;

import java.util.Scanner;

public class K {
	public static String Demo(String a[],int petalCount)
	{
		for(int i =0;i<a.length;i++)
		{
						i=petalCount%(a.length)+1;
						return a[i];
						}
		return null;

	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a[]=new String[3];
	a[0]="akke";
	a[1]="shubhi";
	a[2]="peru";
	K obj = new K();
	int petalCount = sc.nextInt();
	System.out.println(K.Demo(a, petalCount));
	
}
}
