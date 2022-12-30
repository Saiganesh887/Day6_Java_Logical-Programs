package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int fact=0;
        if (n > 0){
            System.out.println("Factors: ");
            for(int i = 1;i < n;i++){
                if(n%i == 0){
                    System.out.println(i);
                    fact += i;
                }
            }
            System.out.println("Sum of factors: "+fact);
            if(fact == n)
                System.out.println(n+" is a perfect number.");
        }
    }
}
