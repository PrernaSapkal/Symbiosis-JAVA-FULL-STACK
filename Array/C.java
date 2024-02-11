package com.Demo;

import java.util.Scanner;

public class C {
	public static int CountEven(int arr [])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		if(arr[i]%2==0)
		{
			count++;
		}
		}
		
		return count;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int c[]=new int[4];
	C obj =new C();
	System.out.println(obj.CountEven(c));
	
}

}

