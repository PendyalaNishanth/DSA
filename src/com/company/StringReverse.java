package com.company;


public class StringReverse {
    public static void main(String[] args) {
        String str1 ="hello world";
        String rev = new StringBuffer(String.valueOf(str1)).reverse().toString();
        System.out.println("String before reversal "+str1);
        System.out.println("String after reversal "+rev);

    }
}
