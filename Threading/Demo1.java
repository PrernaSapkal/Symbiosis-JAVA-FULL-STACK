package com.Demo;
//SingleThreading in java 
public class Demo1 {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.m1();
		for(int j = 0;j<=10;j++)
		{
			System.out.println(" j "+j);
		}
		
	}
public void m1()
{
	for(int i = 0;i<=10;i++)
	{
		System.out.println(" i "+i);
	}
}
}
