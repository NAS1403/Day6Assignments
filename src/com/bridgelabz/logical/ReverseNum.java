package com.bridgelabz.logical;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int Num = scr.nextInt();
        int Rev=0;
        int n;
        System.out.println("Number before reversed is: " + Num);

        while (Num!=0){
            n = Num%10;
            Rev = Rev * 10 + n;
            Num = Num / 10;
        }

        System.out.println("Number after reversed is: " + Rev);

    }
}