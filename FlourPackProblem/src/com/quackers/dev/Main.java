package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        canPack(1, 0, 4);
        canPack(3,2,-1);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0 || (smallCount < 0 ) || goal < 0)) {
            System.out.println("Invalid Value");
            return false;
        }
        System.out.println(bigCount + smallCount + goal);
        return true;
    }
}
