package com.company;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
        b=b+a;
            a=b-a;
            b=b-a;
        System.out.println("after swapping a is "+ a +" "+"b is "+b);

    }
}
