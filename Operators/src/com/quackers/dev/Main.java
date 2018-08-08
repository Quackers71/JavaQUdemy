package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + "The Result is now  " + result);

        result++;
        System.out.println(previousResult + "The Result++ is now  " + result);

        result--;
        System.out.println(previousResult + "The Result-- is now  " + result);

        result += 2;
        System.out.println(previousResult + "The Result += 2 is now  " + result);

        result *= 10;
        System.out.println(previousResult + "The Result *= 10 is now  " + result);

        result -= 10;
        System.out.println(previousResult + "The Result -= 10 is now  " + result);

        result /= 10;
        System.out.println(previousResult + "The Result /= 10 is now  " + result);

        // one = is an assignment operator
        boolean isAlien = false;

        // two = is used for a conditional operator
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
        }

        int topScore = 80;

        if (topScore <= 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("The second top score greater than top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double firstValue = 20d;
        double secondValue = 80d;

        double totalValues = (firstValue + secondValue) * 25;

        double theRemiainder = totalValues % 40;

        if (theRemiainder <= 20) {
            System.out.println("The first value is " + firstValue);
            System.out.println("The second value is " + secondValue);
            System.out.println("The total of the values * 25 is " + totalValues);
            System.out.println("The Remainder of the Total " + totalValues + " divided by 40 is " + theRemiainder);
            System.out.println("Unfortunately the total was over the limit");
        }


    }
}
