package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);
//        isLeapYear(-1200);

        getDaysInMonth(1, 2020);
        getDaysInMonth(5, 10000);
        getDaysInMonth(2,2018);
        getDaysInMonth(2, 2020);
        getDaysInMonth(3, 2020);
        getDaysInMonth(4, 2020);
        getDaysInMonth(5, 2020);
        getDaysInMonth(6, 2020);
        getDaysInMonth(7, 2020);
        getDaysInMonth(8, 2020);
        getDaysInMonth(9, 2020);
        getDaysInMonth(10, 2020);
        getDaysInMonth(11, 2020);
        getDaysInMonth(12, 2020);
        getDaysInMonth(56, 2020);
        getDaysInMonth(-2, 2020);
        getDaysInMonth(1, -2020);

    }

    public static boolean isLeapYear(int year) {

        boolean answer;

        if (year < 1 || year > 9999) {
            answer = false;
            System.out.println(year + " is an invalid Output");
        }
        else if (year >= 1 && year <= 9999 && year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
            answer = true;
            //System.out.println(year + " is a Leap Year");
        }
        else {
            answer = false;
            //System.out.println(year + " is not a Leap Year");
        }
        return answer;
    }

    private static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999) {
            System.out.println("-1");
            return -1;
        } else if (month < 1 || month > 12) {
            System.out.println("-1");
            return -1;
        } else if (month == 2 && isLeapYear(year)) {
            System.out.println("29");
            return 29;
        } else if (month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                    System.out.println("31");
                    return 31;
                case 2:
                    System.out.println("28");
                    return 28;
                case 3:
                    System.out.println("31");
                    return 31;
                case 4:
                    System.out.println("30");
                    return 30;
                case 5:
                    System.out.println("31");
                    return 31;
                case 6:
                    System.out.println("30");
                    return 30;
                case 7:
                    System.out.println("31");
                    return 31;
                case 8:
                    System.out.println("31");
                    return 31;
                case 9:
                    System.out.println("30");
                    return 30;
                case 10:
                    System.out.println("31");
                    return 31;
                case 11:
                    System.out.println("30");
                    return 30;
                case 12:
                    System.out.println("31");
                    return 31;
                default:
                    return -1;

            }
        }
        System.out.println("-1");
        return -1;

    }
}
