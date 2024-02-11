package com.String;

	public class F {
	    public static void main(String[] args) {
	        String input = "prerna";
	        String output = reverseString(input);
	        System.out.println(output);
	    }

	    private static String reverseString(String str) {
	        String[] parts = str.split("");
	        String reversed = "";

	        for (int i = parts.length - 1; i >= 0; i--) {
	            reversed += parts[i];
	        }

	        return reversed;
	    }
	}


