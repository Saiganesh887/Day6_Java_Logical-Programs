package com.bridgelabz.logical;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you need: ");
        int amount = sc.nextInt();
        int[] notes = new int[]{1000,500,100,50,10,5,2,1};
        int[] noteCount = new int[8];
        int count = 0,temp = amount;
        for(int i=0;i<8;i++){
            if(amount >= notes[i]){
                noteCount[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        System.out.println("Change given for amount: ");
        for (int i = 0; i < 8; i++) {
            if (noteCount[i] != 0) {
                System.out.println(notes[i] + " : " + noteCount[i]);
                count += noteCount[i];
            }
        }
        System.out.println("Minimum number of notes that can be given for " + temp + " is: "+ count);
    }
}
