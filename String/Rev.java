
package com.String;

public class Rev {
    public static String stringRev(String str,String s1) {
   for(int i=str.length()-1;i>=0;i--)
   {
	 s1=s1+str.charAt(i);
   }
return s1;
    }
    
 public static void main(String args[])
 {
	 String str = "prerna";
	 String s1 ="";
	 Rev obj = new Rev();
	System.out.println(Rev.stringRev(str,s1));
	
	 
 }
 
 }
   