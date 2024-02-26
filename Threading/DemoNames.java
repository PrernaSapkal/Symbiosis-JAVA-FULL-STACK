package com.Demo;
public class DemoNames extends Thread {
	public static void main(String[] args) {
		DemoNames ab = new DemoNames();
		ab.start();
		Thread ct1 = Thread.currentThread();
		ct1.setName("Demo");
		System.out.println(ct1.getName());
	}
public void run()
{
	Thread ct = Thread.currentThread();
	ct.setName("luck");
	System.out.println(ct.getName());
}
}
