package com.String;

public class H {
    public static String spaceCap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch) ) {
                result += Character.toString(str.charAt(i + 1)).toUpperCase();
                
                
               
            } else {
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        H obj = new H();
        String str = "i am prerna";
        System.out.println(obj.spaceCap(str));
    }
}
