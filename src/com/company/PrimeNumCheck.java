package com.company;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {

//        System.out.println(IsPrime(45));
//    }
//    public static boolean IsPrime(int n){
//        if(n==0 || n==1){
//            return false;
//        }if(n==2){
//            return true;
//        }for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
          Scanner in = new Scanner(System.in);
          System.out.println("enter a number");
          int n=in.nextInt();
          if(n<=1){
              System.out.println("neither prime nor composite");
              return;
          }int a=2;
          while(a*a<=n){
              if(n%a==0){
                  System.out.println("not a prime");
                  return ;
              }
              a=a+1;
          }if(a*a>n){
            System.out.println("prime");
        }

    }
}
