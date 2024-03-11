package com.Vector;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(100);
		vector.addElement(200);
		vector.addElement(300);
		vector.addElement(400);
		System.out.println(vector);
		//teger elementAt()=vector.elementAt(0);
		System.out.println(vector.elementAt(0));
		System.out.println(vector.removeElement(200));
		System.out.println(vector.isEmpty());
		System.out.println(vector.size());
		for(int i=0;i<8;i++)
		{
			vector.addElement(i);	
		}
		System.out.println(vector);
	}

}
