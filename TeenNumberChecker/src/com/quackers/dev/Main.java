package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);

    }

    public static boolean hasTeen(int chk1, int chk2, int chk3) {
        boolean answer = false;
        if ((chk1 >= 13 && chk1 <= 19 || (chk2 >= 13 && chk2 <= 19)) || (chk3 >= 13 && chk3 <= 19)) {
            answer = true;
            System.out.println("There is a Teen in this group");
        }
        else {
            answer = false;
            System.out.println("There is a No Teen in this group");
        }
        return answer;
    }
}
