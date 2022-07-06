package com.bridgelabz.logical;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = scn.nextInt();
        int result;
        int a = 0;
        int b = 1;
        if ( n == 0){
            System.out.println(a);
            System.exit(0);
        }
        System.out.println(a);
        System.out.println(b);


        for (int i=0;i<n;i++){
            result = a + b;
            a = b;
            b = result;

            System.out.println(result);
        }
    }
}