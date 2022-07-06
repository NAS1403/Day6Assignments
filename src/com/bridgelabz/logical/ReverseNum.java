package com.bridgelabz.logical;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = scr.nextInt();
        int rev=0;
        int n;
        System.out.println("Number before reversed is: " + num);

        while (num!=0){
            n = num%10;
            rev = rev * 10 + n;
            num = num / 10;
        }

        System.out.println("Number after reversed is: " + rev);
    }
}