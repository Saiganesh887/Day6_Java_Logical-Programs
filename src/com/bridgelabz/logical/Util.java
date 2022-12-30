package com.bridgelabz.logical;

import java.util.Scanner;

public class Util {
    public static int dayOfWeek(int d,int m,int y){
        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static double temperatureConversion(double tem, char type){
        double convert;
        if (type == 'c' || type == 'C') {
            convert = (tem * 9 / 5) + 32;
        } else if (type == 'f' || type == 'F') {
            convert = (tem - 32) * 5 / 9;
        } else {
            System.out.println("Enter correct input");
            return 0;
        }
        return convert;
    }
    public static double monthlyPayment(double principal,double year,double rate){
        double n = 12 * year;
        double r = rate / (12 * 100);
        double payment = (principal * r) / (1 - Math.pow((1 + r),-n));
        return payment;
    }
    public static double sqrt(double c) {
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        return t;
    }
    public static String toBinary(int d){
        String bin = "";
        while(d != 0){
            bin = (d % 2)  + bin;
            d = d/2;
        }
        while(bin.length() % 4 != 0){
            bin = 0 + bin;
        }
        return bin;
    }

    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Scanner sc = new Scanner(System.in);
        int day = dayOfWeek(d,m,y);
        System.out.println(day);
        String[] str = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int i=0;i<7;i++){
            if(day == i)
            System.out.println(str[i]);
        }


        System.out.println("Enter Temperature Type : C (Celsius) or F (Fahrenheit) :");
        char typeOfTemp = sc.next().charAt(0);
        System.out.println("Enter Temperature: ");
        double temperature = sc.nextInt();
        double tempCovert = temperatureConversion(temperature,typeOfTemp);
        System.out.println("Temperature Converted: "+tempCovert);

        int P = Integer.parseInt(args[3]);
        int Y = Integer.parseInt(args[4]);
        int R = Integer.parseInt(args[5]);
        double Payment = monthlyPayment(P,Y,R);
        System.out.println("Monthly Payment: "+Payment);

        System.out.println("Enter number to get the square root of it: ");
        double c = sc.nextInt();
        double sqrroot = sqrt(c);
        System.out.println("Square of "+c+" is: "+sqrroot);

        System.out.println("Enter a decimal number to convert it into binary: ");
        int decimal = sc.nextInt();
        String binary = toBinary(decimal);
        System.out.println(binary);
    }
}
