package com.Collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("prerna");
		list.add(99);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		System.out.println(list);
		
		ListIterator ltr = list.listIterator();
		while(ltr.hasPrevious())
		{
			System.out.println(list);
		}

	}

}

