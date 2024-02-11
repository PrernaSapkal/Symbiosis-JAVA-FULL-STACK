package com.String;

public class D {
	public String getCount(String str)
	{
		int count = 0; 
		int countConsonants = 0;
        for (int i = 0; i < str.length();i++) {
            char s = str.charAt(i);
            if(Character.isAlphabetic(s))
            {
                  if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
                    {
            		count++;
                    }
                   else 
                   {
                   countConsonants++;
                   } 
            }
            else if (Character.isDigit(s)) {
            
            }
            else 
            {
            	
            }

        }		
        return "consonants:"+countConsonants+"Vowels:"+count;
       
}
       public static void main(String args[])
       {
    	  D obj = new D();
    	  String str = "pihg1";
    	 System.out.println(obj.getCount(str));
    	 
       }
       }

	