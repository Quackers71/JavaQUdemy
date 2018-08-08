package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32 (4 bytes)
        int myIntValue = 5 / 2;

        // float has a width of 32 (4 bytes)
        float myFloatValue = 5f / 3f; // 7 digit precision

        // double has a width of 64 (8 bytes)
        double myDoubleValue = 5d / 3d; // 16 digit precision

        System.out.println("myIntValue divided by 2 = " + myIntValue);
        System.out.println("myFloatValue divided by 2f = " + myFloatValue);
        System.out.println("myDoubleValue divided by 2d = " + myDoubleValue);
    }
}
