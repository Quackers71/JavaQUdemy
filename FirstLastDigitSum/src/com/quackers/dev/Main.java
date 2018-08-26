package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

//        sumFirstAndLastDigit(-13);
//        sumFirstAndLastDigit(-20);
//        sumFirstAndLastDigit(20);
//        sumFirstAndLastDigit(19);
//        sumFirstAndLastDigit(0);
//        sumFirstAndLastDigit(2);
        sumFirstAndLastDigit(2394238);
//        sumFirstAndLastDigit(252);

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            System.out.println(number + " is an Invalid value");
            return -1;
        }

        int lastDigit = number % 10;
        System.out.println("The last digit is " + lastDigit);
        int firstDigit = 0;
        System.out.println("The firstDigit is set to " + firstDigit);

        int count = 0;

        while(number != 0){
            count++;
            firstDigit = number;
            System.out.println("In the whileloop the firstDigit = number, which is " + firstDigit);
            number/= 10;
            System.out.println("This is loop count " + count);
            System.out.println("The number = number / 10 which is the number now " + number);
        }
        System.out.println("The first digit is " + firstDigit + " and the last digit is " + lastDigit + " which has the Sum of " + (firstDigit + lastDigit));
        System.out.println("Which is correct");
        return lastDigit + firstDigit;

    }

}
