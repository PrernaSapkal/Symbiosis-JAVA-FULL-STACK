package com.Demo;

import java.util.Scanner;

public class D {
		public static Boolean CountOccuerence(int arr[])
		{

			Scanner sc = new Scanner(System.in);
			int count = 0;
			for(int i =0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				int num = 12;
			if(arr[i]==num)
			{
				return true;
			}
			else 
			{
				i+=1;
			}
			
			}
			return null;
			
		}
	public static void main(String[] args) {
		int count = 0;
		int num = 12;
		int arr[]=new int[4];
		D obj =new D();
		System.out.println(obj.CountOccuerence(arr));
		
	}

	}


