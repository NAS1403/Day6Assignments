package com.bridgelabz.logical;
import java.util.Scanner;

public class StopWatch {
    static long startTimer=0;
    static long stopTimer=0;
    static long elapsed;

    static void start()
    {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    static void stop()
    {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    static long getElapsedTime()
    {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Press '1' to Start Time: ");
        scr.nextInt();
        start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");

        scr.nextInt();
        stop();

        long l=getElapsedTime();
        System.out.println("Total Time Elapsed(in millisec) is:" + l);
        System.out.println("Converting millisec to seconds: "+ (l/1000) + " sec");

    }
}