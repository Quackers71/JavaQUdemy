package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            System.out.println("*****");
            System.out.println("Invalid value");
            return false;
        }

        int i = 1;
        int sum = 0;
        while(i < number){

            if(number%i == 0){
                sum += i;
                System.out.println(i);
            }
            i++;
        }

        if (number == sum) {
            System.out.println("the number is " + sum);
            System.out.println("***");
            return true;
        }

        System.out.println("number " + number + " was not a perfect number");
        return false;

    }
}
