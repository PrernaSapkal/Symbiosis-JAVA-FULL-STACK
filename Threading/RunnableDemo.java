package com.Demo;
public class RunnableDemo implements Runnable{
	public void run()
	{
		System.out.println("oj");
	}
	public static void main(String[] args) {
		RunnableDemo obj = new RunnableDemo();
		Thread th = new Thread(obj);
	  th.start();
	}
}
