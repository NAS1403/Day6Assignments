package com.bridgelabz.Junit;

import java.util.Scanner;

public class PrincipleLoan {

    static void monthlyPayment(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter principle amount");
        double principle = scr.nextDouble();
        System.out.println("Enter term of loan in years");
        double noofyears = scr.nextDouble();
        System.out.println("Enter interest rate");
        double rate = scr.nextDouble();
        double n = 12 * noofyears;
        double r = rate/(12*100);
        double payment = (principle*r)/(1-Math.pow((1+r),(-n)));
        System.out.println("Payment is: "+ payment);
    }

    public static void main(String[] args) {
        monthlyPayment();
    }
}
