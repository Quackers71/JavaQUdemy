package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {

        //String nullMinutes;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else if (minutes == 0) {
            String nullMinutes = "0 min = 0 y and 0 d";
//            long years = (minutes / (60 * 24 * 365));
//            long x = minutes - (years * 60 * 24 * 365);
//            long days = (x / (24 * 60));
            System.out.println(nullMinutes);
        }
        else {
            long year = minutes / 525600;
            long x = minutes % 525600;
            long day = x / 1440;

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
