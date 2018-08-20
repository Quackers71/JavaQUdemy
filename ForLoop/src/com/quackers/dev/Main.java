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

        System.out.println("************************");

        for (int i = 8; i > 1; i--) {
            //System.out.println("Loop " + (i+2.0d) + " hello!");
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("************************");

        int count = 0;
        for (int i = 10; i <= 50; i++ ) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i  + " is a Prime number");
                if (count == 10) {
                    System.out.println("Exiting, for loop");
                    break;
                }
            }
        }

    }



    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n)/*n/2*/; i++) { // replacing n/2 which cuts down the amount of looping to check for the Prime number
            //System.out.println("Looping " + i);   // to show the amount of loops
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}