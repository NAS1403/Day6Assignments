package com.bridgelabz.logical;
import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = scr.nextInt();
        int sum=0;
        for (int i=1;i<=N/2;i++){
            if (N%i==0){
                //System.out.println(i);
                sum=sum+i;
            }
        }
        //System.out.println(sum);
        if (sum == N){
            System.out.println(N +" is a Perfect Number");
        }
        else{
            System.out.println(N + " is not a perfect number");
        }
    }
}