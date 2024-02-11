package com.String;

public class A {
public static void main(String[] args) {
	String a="prerna";
	String b = "prerna";
	String c = new String("prerna");
	String d ="Prerna";
	System.out.println(a.equals(c));
	System.out.println(a.equals(b));
	System.out.println(a.charAt(0));
	System.out.println(a.compareToIgnoreCase(b));
	System.out.println(a.codePointAt(0));
	System.out.println(a.compareTo(b));
	char ch [] ={112,100};
	String ce = new String(ch);
		System.out.println(ce);
		System.out.println(a.contains("a"));
		System.out.println(a.concat(c));
		System.out.println(a.compareTo(d));
		System.out.println(a.length());
		System.out.println(a.codePointCount(0, 5));
		System.out.println(a.contains("pr"));
		System.out.println(a);
		
		
}
}
