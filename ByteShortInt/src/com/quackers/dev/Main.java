package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32 (Integer)
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMaxValue / 5001000);
        System.out.println("my int total is " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("my new byte value is " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 9223372036854775807L;
    }
}
