package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("This number " + i + " is divisible by 3 or 5");
            }
            if (count == 5) {
                System.out.println("Exiting loop");
                break;
            }
        }
            System.out.println("The Sum is " + sum);
    }
}
