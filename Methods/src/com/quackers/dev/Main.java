package com.quackers.dev;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;
        String player = "Dave";

        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        int Position = displayHighScorePosition(highScore);
        System.out.println( player + "'s final score was " + highScore + " and managed to get into position " + Position);

        score = 300;
        levelCompleted = 5;
        bonus = 100;
        player = "Trev";

        highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        Position = displayHighScorePosition(highScore);
        System.out.println( player + "'s final score was " + highScore + " and managed to get into position " + Position);

        score = 100;
        levelCompleted = 2;
        bonus = 100;
        player = "Bob";

        highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        Position = displayHighScorePosition(highScore);
        System.out.println( player + "'s  final score was " + highScore + " and managed to get into position " + Position);

        score = 50;
        levelCompleted = 0;
        bonus = 200;
        player = "John";

        highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        highScore -= 100;
        Position = displayHighScorePosition(highScore);
        System.out.println( player + "'s final score was " + highScore + " and managed to get into position " + Position);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;

            return finalScore;
        }
        else {
            return -1;
        }
    }

    public static int displayHighScorePosition (int highScore) {

            if (highScore >= 1000 ) {
                int scorePosition = 1;
                return  scorePosition;
            }
            else if (highScore >= 500 && highScore < 1000) {
                int scorePosition = 2;
                return  scorePosition;
            }
            else if (highScore >= 100 && highScore < 500) {
                int scorePosition = 3;
                return  scorePosition;
            }
            else {
                int scorePosition = 4;
                return  scorePosition;
            }

    }

    public static void calculateHighScorePosition (String player, int Score) {

        // lovin this shit, but still learning
    }


}
