package com.String;

public class G {
public static String UpperCaseConversion(String str,String l,String l2)
{
	for (int i =0;i<str.length();i++)
	if(i%2==0){
			char ch=str.charAt(i);
			l= l+ Character.toString(ch).toUpperCase();
		}
	else
	{
		char ch1=str.charAt(i);
		l2= l2+ Character.toString(ch1).toUpperCase();
	}
	return l+l2;
    
	
	}

public static void main(String[] args) {
	G obj = new G();
	String str ="prerna";
	String l="";
	String l2 ="";
	System.out.println(G.UpperCaseConversion(str,l,l2));
	
}
}
