package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        // Pounds to Kilograms Converter
        double kilogramsPerPound = 0.45359237d;
        double myPounds = 200d;

        double totalKiloGrams = kilogramsPerPound * myPounds;

        System.out.println(myPounds + " Pounds is equal to "+ totalKiloGrams + " in Kilograms");

        // Google produced 90.7185 ;-)
        double pi = 3.1415927d;
    }
}
