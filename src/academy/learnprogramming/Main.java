package academy.learnprogramming;

public class Main {


    public static void main(String[] args) {

   int highScore= calculateScore(true, 800,5,100);
        System.out.println("your Final score was " + highScore);
  // calculateScore(true, 10000,8,200);
    int hihg = calculateHighScorePosition(1500);
    displayHighScorePosition("Sadid", hihg);
    }
    public static int calculateScore(boolean gameOver, int score, int lavelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (lavelCompleted*bonus);
            finalScore += 2000;

            return finalScore;
        }

            return -1;

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "+highScorePosition+ " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore>=500){
            position = 2;

        } else  if(playerScore >=100){
            position = 3;
        }
        return position;
        }
    }

