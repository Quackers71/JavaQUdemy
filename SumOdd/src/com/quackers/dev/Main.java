package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

//        isOdd(-1);
//        isOdd(100);
//        isOdd(19);
//        isOdd(-200);
//        isOdd(-11);

        System.out.println("The Sum = " + sumOdd(1, 100));
        System.out.println("The Sum = " + sumOdd(-1, 100));
        System.out.println("The Sum = " + sumOdd(100, 100));
        System.out.println("The Sum = " + sumOdd(100, -100));
        System.out.println("The Sum = " + sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {

        if (number <= 0) {

            return false;
        }
        if (!(number % 2 == 0)) {
//            System.out.println(number);
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if((start<0) || (end<0) || (end<start)) {
            return -1;
        }

        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return (sum);
    }
}