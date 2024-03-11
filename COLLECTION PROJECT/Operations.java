package com.myproject;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Product pd = new Product("prerna", 1000);
		Product pd1 = new Product("om",98888);
		Cart cart = new Cart();
		cart.addItems(pd);
		cart.displayItems(pd);
		cart.addItems(pd1);
		cart.displayItems(pd1);
		cart.deleteItems("om");
		cart.displayItems(pd1);
		
		
		
	}
}