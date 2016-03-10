
import java.util.*;


public class ObstacleTest extends CreateGameBoard {
    String obstacle;
    Player player1 = new Player();

    double playerRoll;
    //boolean isPassed;
    Scanner in = new Scanner(System.in);



    public void passObstacleRoll(ArrayList gameSpace) {
        //System.out.println("This is from obstacle class" + gameSpace);
        Player player1 = new Player();
        player1.GivePlayerTurn(gameSpace);

    }


    public void smallRock() {
        System.out.println("You have encountered a small rock! Roll a 4 or above to move past!");
        System.out.println("You can choose the 8 or 6 sided die... Please Roll");
        playerRoll = Math.floor(Math.random() * in.nextDouble() + 1);
        System.out.println("You rolled a " + playerRoll);
        if (playerRoll < 4) {
            System.out.println("You didn't roll high enough to pass! You stay put.");
        } else if (playerRoll >= 4) {
            //isPassed = true;
            System.out.println("You've gotten over! You move to the next space!");
            player1.addPlayerScore();
            System.out.println("Your score is now " + player1.getPlayerScore());


        }
        //return player1Score;
    }

    public void log() {

        System.out.println("You have encountered a log! Roll a 8 or above to move past!");
        System.out.println("You can choose the 12 or 10 sided die... Please Roll");
        playerRoll = Math.floor(Math.random() * in.nextDouble() + 1);
        System.out.println("You rolled a " + playerRoll);
        if (playerRoll < 8) {
            System.out.println("You didn't roll high enough to pass! You stay put.");
        } else if (playerRoll >= 8) {
            System.out.println("You've gotten over! You move to the next space!");
            player1.addPlayerScore();
            System.out.println("Your score is now " + player1.getPlayerScore());

        }
        //return player1Score;
    }

    public void river() {


        System.out.println("You have encountered a river! Roll a 12 or above to move past!");
        System.out.println("The 20 sided die is now available to you... Please Roll");
        playerRoll = Math.floor(Math.random() * in.nextDouble() + 1);
        System.out.println("You rolled a " + playerRoll);
        if (playerRoll < 12) {
            System.out.println("You didn't roll high enough to pass! You stay put.");
        } else if (playerRoll >= 12) {
            System.out.println("You've gotten over! You move to the next space!");
            player1.addPlayerScore();//player1Score = player1Score+1;
            System.out.println("Your score is now " + player1.getPlayerScore());

        }
        //return player1Score;
    }

    public void chainLinkFence() {

        System.out.println("You have encountered a chain link fence! Roll a 16 or above to move past!");
        System.out.println("The 20 sided die is now available to you... Please Roll");
        playerRoll = Math.floor(Math.random() * in.nextDouble() + 1);
        System.out.println("You rolled a " + playerRoll);
        if (playerRoll < 16) {
            System.out.println("You didn't roll high enough to pass! You stay put.");
        } else if (playerRoll >= 16) {
            System.out.println("You've gotten over! You move to the next space!");
            player1.addPlayerScore();
            System.out.println(" score is now " + player1.getPlayerScore());

        }
        //return player1Score;
    }

    public void mountain() {

        System.out.println("You have encountered a mountain! This is your final test, can you make it? Roll a 18 or above to move past!");
        System.out.println("This one might take you a while... please roll");
        playerRoll = Math.floor(Math.random() * in.nextDouble() + 1);
        System.out.println("You rolled a " + playerRoll);
        if (playerRoll < 18) {
            System.out.println("You didn't roll high enough to pass! You stay put.");
        } else if (playerRoll >= 18) {
            System.out.println("You've gotten over! You move to the next space!");
            player1.addPlayerScore();//player1Score = player1Score+1;
            System.out.println("Your score is now " + player1.getPlayerScore());

        }
        //return player1Score;
    }

}
