package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            System.out.println("Invalid value");
            return -1;
        }
            int sum = 0;

        while (number > 0) {
            // extract the least-significant digit
            int lastDigit = number % 10;
            number /= 10; // same as number = number / 10;
            if (lastDigit % 2 != 0) { // while loop with condition if the digit is an even number -> continue
                continue;
            }
            sum += lastDigit; // sum = sum + lastDigit
        }

        System.out.println("the Sum is " + sum);
        return sum;
    }
}
