package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(12.1234, 12.1236);
        areEqualByThreeDecimalPlaces(14.5443, 14.5411);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNo, double secondNo) {

        boolean answer = false;

        firstNo = (int)(firstNo * 1000);
        secondNo = (int)(secondNo * 1000);

        if (firstNo == secondNo) {
            answer = true;

            firstNo = (double)(firstNo / 1000);
            secondNo = (double)(secondNo / 1000);
            System.out.println(firstNo + " and " + secondNo + " are equal to 3 decimal places");
        }
        else {
            answer = false;

            firstNo = (double)(firstNo / 1000);
            secondNo = (double)(secondNo / 1000);
            System.out.println(firstNo + " and " + secondNo + " are not equal to 3 decimal places");
        }
        return answer;
    }
}
