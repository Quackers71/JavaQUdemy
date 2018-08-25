package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(7071);
        isPalindrome(12321);
        isPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int newNumber = number;
        while (newNumber != 0) {
            System.out.println("newNumber is " + newNumber);
            lastDigit = newNumber % 10;
            System.out.println("lastDigit is " + lastDigit);
            System.out.println();
            reverse = (reverse * 10) + lastDigit;
            System.out.println("The reverse is " + reverse);
            if (reverse == number) {
                System.out.println(number + " is a Palindrome");
                return true;
            } else newNumber = newNumber / 10;


        }
        System.out.println(number + " is not a Palindrome");
        return false;
    }

}
