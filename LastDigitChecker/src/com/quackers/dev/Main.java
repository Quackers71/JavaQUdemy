package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

    hasSameLastDigit(41, 22, 71);
    hasSameLastDigit(23, 32, 42);
//    hasSameLastDigit(9, 99, 999);
    hasSameLastDigit(101,102,103);
//    hasSameLastDigit(1000, 11, 11);

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if ((num1 < 10 || (num1 > 1000) || (num2 < 10) || (num2 > 1000) || (num3 < 10 ||( num3 > 1000)))) {
            System.out.println("Invalid range");
            return false;
        }

         int rightMostDigit1 = num1 % 10;
//         System.out.println(rightMostDigit1);
         int rightMostDigit2 = num2 % 10;
//         System.out.println(rightMostDigit2);
         int rightMostDigit3 = num3 % 10;
//         System.out.println(rightMostDigit3);

        if ((rightMostDigit1 == rightMostDigit2) || (rightMostDigit1 == rightMostDigit3) || (rightMostDigit2 == rightMostDigit3)) {

            System.out.println("One of the right most digits within these numbers " + num1 + " & " + num2 + " & " + num3 + " are equal");

        }else {

            System.out.println("None of these right most digits " + num1 + " & " + num2 + " & " + num3 + " are equal");
            return false;
        }
        return true;
    }


}
