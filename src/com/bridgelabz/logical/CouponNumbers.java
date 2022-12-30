package com.bridgelabz.logical;

import java.util.Scanner;

public class CouponNumbers {
    public static int getCoupon(int n){
        int random = (int)(Math.random() * n);
        return random;
    }
    public static int collect(int n){
        boolean[] isCollected = new boolean[n];
        int count = 0,distinct = 0;
        while(distinct < n){
            int value = getCoupon(n);
            count++;
            if(!isCollected[value]){
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count = collect(n);
        System.out.println(count);
    }
}
