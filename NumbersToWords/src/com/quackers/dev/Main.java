package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        int reversedNumber = reverse(number); // reversedNumber is the value of the method/function call for reverse(number)
        int digitCount = getDigitCount(number); // digitCount is the value of the method/function call for getDigitCount(number)

        if (number < 0 || reversedNumber < 0 || digitCount < 0) {
            System.out.println("Invalid Value");
        } else {

            int lastDigit = 0;

            for (int i = 1; i <= digitCount; i++) {

                lastDigit = reversedNumber % 10;
                System.out.println("lastDigit is " + lastDigit);
                reversedNumber /= 10;
                System.out.println("reversedNumber is " + reversedNumber);

                switch (lastDigit) {
                    case 0:	System.out.println("Zero");  break;
                    case 1: System.out.println("One");   break;
                    case 2: System.out.println("Two");   break;
                    case 3: System.out.println("Three"); break;
                    case 4: System.out.println("Four");  break;
                    case 5: System.out.println("Five");  break;
                    case 6: System.out.println("Six");   break;
                    case 7: System.out.println("Seven"); break;
                    case 8: System.out.println("Eight"); break;
                    case 9: System.out.println("Nine");  break;
                }
            }
        }
    }

    public static int reverse(int number) {


        System.out.println("The reverse method");
        int digit = 0;
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber *= 10;
            System.out.println("number = " + number);
            System.out.println("reversedNumber = " + reversedNumber);
            digit = number % 10;
            System.out.println("digit = " + digit);
            System.out.println("number = "+ number);
            reversedNumber += digit;
            System.out.println("reversedNumber is now = " + reversedNumber);
            number /= 10;
            System.out.println("number is now = " + number);

            System.out.println("******************");
        }

        return reversedNumber;
    }


    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
            }
        System.out.println("The digit count method");
        int digitCount = 0;

        System.out.println("The number is " + number);
        while (number > 0) {
            digitCount++;
            number /= 10;
            System.out.println("DG++ and num /= 10 is now = " + number);
            }
        if (digitCount == 0) {
            digitCount++;
            }
        System.out.println("Final number is " + number);
        System.out.println("Digit Count is " + digitCount);
        System.out.println("******************");
        return digitCount;
    }

}


