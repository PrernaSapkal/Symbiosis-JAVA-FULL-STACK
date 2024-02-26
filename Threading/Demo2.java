package com.Demo;

public class Demo2 extends Thread{
	public void run() {
	try
	{
		for(int i =0;i<=0;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
			
		}
	}
	catch(InterruptedException e) {
		System.out.println("handled");
	}
		
	}

}
