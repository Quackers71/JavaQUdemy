package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        // byte variable
        byte myByte = 40;

        // short variable
        short myShort = 20;

        // int variable
        int myInt = 30;

        // long variable
        long myLongTotal = 50000L + (10L * (myByte + myShort + myInt));
        short myShortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println(myLongTotal);
        System.out.println(myShortTotal);
    }
}
