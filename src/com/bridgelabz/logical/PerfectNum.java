package com.bridgelabz.logical;
import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scr.nextInt();
        int sum=0;
        for (int i=1;i<=n/2;i++){
            if (n%i==0){
                //System.out.println(i);
                sum=sum+i;
            }
        }
        //System.out.println(sum);
        if (sum == n){
            System.out.println(n +" is a Perfect Number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }
    }
}