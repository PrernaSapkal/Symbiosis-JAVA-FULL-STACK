package com.String;

public class C {
    public int getCountOfVowels(String str) {
        int count = 0; 
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
                count++;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        String str = "AeioU";
        C obj = new C();
        System.out.println(obj.getCountOfVowels(str));
    }
}
