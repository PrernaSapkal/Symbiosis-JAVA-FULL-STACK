package com.String;

import java.util.Scanner;

public class MyDish {


    public static boolean feast(String beast, String dish) {
        char d = beast.charAt(0);
        char w = dish.charAt(0);
        int c = dish.length() - 1;
        char t = dish.charAt(c);

        if (d == w && d==t)
            return true;
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
System.out.println("enter beast name");
String beast = sc.next();
System.out.println("enter dish name");
String dish = sc.next();
        MyDish obj = new MyDish();
        boolean result = obj.feast(beast,dish);
        System.out.println( result);
    }

}
