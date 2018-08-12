package com.quackers.dev;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tony", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tarquin", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Adam", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);
    }


        public static void displayHighScorePosition (String playerName,int highScorePosition){

            System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
        }

        public static int calculateHighScorePosition ( int playerScore) {

            if (playerScore >= 1000) {
                return 1;
            }
                else if (playerScore >= 500) {
                    return 2;
            }
                    else if (playerScore >= 100) {
                        return 3;
            }
                return 4;
        }


}
