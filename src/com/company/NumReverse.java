package com.company;

import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        int number,remainder,reverse=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        number=sc.nextInt();
        while(number>0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;

        }
        System.out.println("reversed number is "+reverse);
    }
}
