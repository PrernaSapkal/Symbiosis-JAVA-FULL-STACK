package com.Demo;

public class SquareInt {
    public static void Square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int arr2 = 0;
            arr2 += (arr[i] * arr[i]);
            System.out.println(arr2);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        SquareInt obj = new SquareInt();
        obj.Square(arr);
    }
}
