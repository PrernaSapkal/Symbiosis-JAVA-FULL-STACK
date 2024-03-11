package com.myproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {
		private ArrayList<Product> list;
        public Cart()
        {
        	this.list=new ArrayList<>();
        }
        
		public void addItems(Product pd)
		{
			list.add(pd);
		}

		public void deleteItems(String name)
		{
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
			Product pd = (Product)itr.next();
			if(pd.getProductName()==name) {
			itr.remove();
			}
			}
			
		}
		public void displayItems(Product pd)
		{
			for (Product list1 : list)
			{
				System.out.println(list1.getProductName()+list1.getProductPrice());
			}
		
		}
}

