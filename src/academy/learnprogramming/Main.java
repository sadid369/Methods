package academy.learnprogramming;

public class Main {


    public static void main(String[] args) {

   calculateScore(true, 800,5,100);
   calculateScore(true, 10000,8,200);
    }
    public static int calculateScore(boolean gameOver, int score, int lavelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (lavelCompleted*bonus);
            finalScore += 2000;
            System.out.println("your Final score was " + finalScore);
            return finalScore;
        }
       
            return -1;

    }
}
