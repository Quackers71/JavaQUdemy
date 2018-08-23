package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is  " + count);
//            count++;
//        }
//
//        System.out.println("******************");
//
//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count  > 100) {
//                break;
//            }
//        } while (count != 6);

//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is  " + count);
//            count++;
//        }

//        isEvenNumber(10);
//        isEvenNumber(3);


//        int finishNumber = 20;
//        int count = 0;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number is " + number);
//                break;
//            }
//        }


        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                count++;
                continue;
            }
            System.out.println("Even number is " + number);
            if (count >= 5) {
                break;
            }
        }

        System.out.println("******************");
        System.out.println("Total even numbers found = " + count);

    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
//            System.out.println(number + " is an Even number");
            return true;
        }

//        System.out.println("false");
        return false;

    }
}