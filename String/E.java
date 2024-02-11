package com.String;

import java.util.Scanner;

public class E {
    public static Boolean Palindrome(String str,String s1) {
   for(int i=str.length()-1;i>=0;i--)
   {
	 s1=s1+str.charAt(i);
   }
   
	 if(str.equals(s1))
		    return true ;
		   else 
			   return false;
   }

   


    
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 String str = sc.next();
	 String s1="";
	E obj = new E();
	System.out.println(obj.Palindrome(str,s1));
	
	 
 }
 
 }
   