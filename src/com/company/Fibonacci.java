package com.company;

import java.util.Scanner;

public class Fibonacci {
    //by this we can get the given input number's position fibonacci number.
//    public static void main(String[] args) {
//        Scanner in =  new Scanner(System.in);
//        int n=in.nextInt();
//        int a=0;
//        int b=1;
//        int count=2;
//        while(count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
//    }

    //by this we can get the fibonacci series upto the provided input number.
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int maxNumber = in.nextInt();
        int previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }
}
