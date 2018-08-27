package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        getGreatestCommonDivisor(25, 15);
//        getGreatestCommonDivisor(12, 30);
//        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        System.out.println("Starting numbers are " + first + " & " + second);

        if (first < 10 || second < 10) {
//            System.out.println("Invalid range " + first + " or " + second);
            return -1;
        }

        while (true){
            int result = first % second;
            System.out.println("first % second is " + result);
            if (result == 0) {
                return second;
            }
            first = second;
            second = result;

            System.out.println(first + " & " + second);
            System.out.println("Result = " + result);
        }

    }

}
