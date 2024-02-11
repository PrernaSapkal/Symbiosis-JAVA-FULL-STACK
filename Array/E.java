package com.Demo;

public class E {
    public static int ReturnMethod(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
            	arr[i]=11;
            } 
        }
        for(int arr1 :arr) {
        	System.out.println(arr1);
        }
		return 0;
        
    }

    public static void main(String[] args) {
        E obj = new E();
        int arr[] = {11, 12, 13, 4};
        E.ReturnMethod(arr);
    }
}
