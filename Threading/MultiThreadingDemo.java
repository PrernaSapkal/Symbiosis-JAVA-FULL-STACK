package com.Demo;

public class MultiThreadingDemo extends Thread {
	public static void main(String[] args) throws InterruptedException {
		MultiThreadingDemo A1 = new MultiThreadingDemo();
		A1.start();
		for(int j = 0 ;j<9;j++)
		{
			System.out.print(" j "+j);
			Thread.sleep(1000);
		}
	}
	public void run() {
		for(int i = 0 ;i<9;i++)
		{
			System.out.print(" i "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrruption");
			}
		}
	}

}
