package com.Demo;

import java.util.Scanner;

public class DemoJoin extends Thread {
static int sum,n;
public static void main(String[] args) throws InterruptedException {
	long startTime = System.currentTimeMillis();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	DemoJoin.n=sc.nextInt();
	DemoJoin ab = new DemoJoin();
	ab.start();
	ab.join();

	System.out.println(DemoJoin.sum);
	long endTime = System.currentTimeMillis();
	System.out.println((endTime-startTime));
}
public  void run()
{
	for(int i = 0;i<=DemoJoin.n;i++)
	{
		DemoJoin.sum+=i;
	}
}
}
