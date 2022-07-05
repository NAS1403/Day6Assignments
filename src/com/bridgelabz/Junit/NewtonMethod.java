package com.bridgelabz.Junit;

import java.util.Scanner;

public class NewtonMethod {
    static void sqrt(int c){
        double epsilon = 1E-15;
        double t=c;
        while(Math.abs(t-c/t) > epsilon*t)
            t=(c/t+t)/2;
        System.out.println(t);

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to compute sqrt");
        int num = scr.nextInt();
        sqrt(num);
    }
}