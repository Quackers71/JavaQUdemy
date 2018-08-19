package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

/*        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% = " + calculateInterest(10000.0, 5.0));*/

        for (int i = 2; i < 9; i++) {
            //System.out.println("Loop " + (i+2.0d) + " hello!");
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            //System.out.println("Loop " + (i+2.0d) + " hello!");
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }
}
