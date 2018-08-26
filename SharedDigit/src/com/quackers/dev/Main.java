package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        System.out.println("Each number should be within the range of 10(inclusive) up to 99(inclusive)");
        System.out.println("**************************************************************************");

//        hasSharedDigit(22, 8);
        hasSharedDigit(101,5);
//        hasSharedDigit(55, 34);
//        hasSharedDigit(99, 10);
        hasSharedDigit(99, 11);
//        hasSharedDigit(234, 10);
//        hasSharedDigit(-55, -12);
        hasSharedDigit(91, 19);
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {

        if ((firstNum < 10 || (firstNum > 99) || (secondNum < 10) || (secondNum > 99))) {

            System.out.println(firstNum + " & " + secondNum + " - One or both of the values are invalid"); // validation of the range 10 to 99
            return false;
        }

        int firstNumDigit1 = firstNum % 10;
//        System.out.println(firstNumDigit1);
        int firstNumDigit2 = (firstNum / 10) % 10;
//        System.out.println(firstNumDigit2);
        int secondNumDigit1 = secondNum % 10;
//        System.out.println(secondNumDigit1);
        int secondNumDigit2 = (secondNum / 10) % 10;
//        System.out.println(secondNumDigit2);

        if ((firstNumDigit1 == secondNumDigit1) || (firstNumDigit1 == secondNumDigit2) || (firstNumDigit2 == secondNumDigit1) || (firstNumDigit2 == secondNumDigit2)) {

            System.out.println(firstNum + " & " + secondNum);
            System.out.println("One or both of the digits match");
            return true;
        }

        System.out.println(firstNum + " & " + secondNum);
        System.out.println("None of the digits are the same");
        return false;
    }
}