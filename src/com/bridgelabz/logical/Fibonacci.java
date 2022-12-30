package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci series upto: ");
        int n = sc.nextInt();
        int a = 0,b = 1;
        System.out.println(a +  "," + '\n' + b +",");
        int nextterm=0;
        for(int i = 2;i < n;i++){
            nextterm = a + b;
            a = b;
            b = nextterm;
            System.out.println(nextterm+ ",");
        }
    }
}
