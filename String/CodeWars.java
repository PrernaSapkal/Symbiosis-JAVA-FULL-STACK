package com.String;

public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CodeWars obj = new CodeWars();
        int result = obj.strCount("prerna", 'a');
        System.out.println(result);
    }
}
