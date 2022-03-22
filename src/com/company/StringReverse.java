package com.company;


import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1 =sc.nextLine();
        String rev = new StringBuffer(String.valueOf(str1)).reverse().toString();
        System.out.println("String before reversal "+str1);
        System.out.println("String after reversal "+rev);

    }
}
