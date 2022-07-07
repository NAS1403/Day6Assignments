package com.bridgelabz.Junit;
import java.util.Scanner;

public class Util {
    static void dayOfWeek(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter month");
        int m = scr.nextInt();
        System.out.println("Enter day");
        int d = scr.nextInt();
        System.out.println("Enter year");
        int y = scr.nextInt();
        System.out.println();

        int y0 = y -(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;

        if (d0 == 0) {
            System.out.println("Sunday");
        } else if (d0 == 1) {
            System.out.println("Monday");
        } else if (d0 == 2) {
            System.out.println("Tuesday");
        } else if (d0 == 3) {
            System.out.println("Wednesday");
        } else if (d0 == 4) {
            System.out.println("Thursday");
        } else if (d0 == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }

    }

    static void temperatureConversion(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Press (F or f) to covert from fahrenheit to Celsius or Press (C or c) to convert from Celsius to fahrenheit :");
        char ch = scr.next().charAt(0);

        if (ch =='f'|| ch=='F'){
            System.out.println("Enter the temperature to convert from fahrenheit to Celsius");
            double f = scr.nextDouble();
            double c = (f-32)*5/9;
            System.out.println(f + " degree fahrenheit is " +c+ " degree Celsius" );
        }
        else if (ch =='c'|| ch=='C') {
            System.out.println("Enter the temperature to convert from Celsius to fahrenheit");
            double c = scr.nextDouble();
            double f = (c*9/5)+32;
            System.out.println(c + " degree  Celsius  is " +f+ " degree fahrenheit" );
        }
    }

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

    static void sqrt(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to compute sqrt");
        int num = scr.nextInt();
        double epsilon = 1E-15;
        double t=num;
        while(Math.abs(t-num/t) > epsilon*t)
            t=(num/t+t)/2;
        System.out.println(t);

    }

    static void toBinary(){
        int[] a = new int[10];
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to find its binary form");
        int n = scr.nextInt();
        int b=0;
        while(n!=0){
            a[b] = n%2;
            n=n/2;
            b++;
        }
        for (int i=b-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }

}
