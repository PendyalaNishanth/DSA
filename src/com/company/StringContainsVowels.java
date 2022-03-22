package com.company;

import java.util.Scanner;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(StringContainsVowels("hello"));
    }
    public static boolean StringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");

    }
}
