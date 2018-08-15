package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Q", 500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(75);
//
//        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(157);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0 || ((inches < 0) || inches > 12))) {
            System.out.println("Invalid Feet or Inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet,  "+ inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid Inches");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and "+  remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

//    public static  int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static  int calculateScore(int score) {
//        System.out.println("Unamed Player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static  int calculateScore() {
//        System.out.println("No Player name, no player score");
//        return 0;
//    }
}
