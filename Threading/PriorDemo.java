package com.Demo;

public class PriorDemo extends Thread{
	public static void main(String[] args) {
		PriorDemo obj = new PriorDemo();
		obj.setName("obj");
		obj.setPriority(MIN_PRIORITY);
		obj.start();
		
		PriorDemo obj1  = new PriorDemo();
		obj1.setName("obj1");
		obj1.setPriority(MAX_PRIORITY);
		obj1.start();
		
		PriorDemo obj2  = new PriorDemo();
		obj2.setName("obj2");
		obj2.setPriority(NORM_PRIORITY);
		obj2.start();
		
		
	}
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
}
