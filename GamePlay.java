import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay extends CreateGameBoard{

    //ArrayList<String> gameSpace = new ArrayList<>();
    //Player player1 = new Player();

    Scanner in = new Scanner(System.in);





    public GamePlay() {

        //Player player1 = new Player();


        System.out.println("You have chosen to play the dice obstacle game!");
        System.out.println("");
        System.out.println("----------------Game Rules---------------------");
        System.out.println("");
        System.out.println("1.)**You must make it to the end of the board**");
        System.out.println("");
        System.out.println("2.)**You must beat the obstacles or you stay put");
        System.out.println("3.)**You move ahead when you defeat the obstacle with a roll");
        System.out.println("");
        System.out.println("The board is 10 spaces so it should be a piece of cake");


        //
        List<String> players = new ArrayList<>();
        System.out.println("Please enter player 1: \n");
        players.add(in.nextLine());
        System.out.println("Welcome to the dice obstacle game " + players.get(0));
        System.out.println("Please enter player 2: \n");
        players.add(in.nextLine());
        System.out.println("And a warm welcome to you also " + players.get(1));

        CreateGameBoard gameBoard = new CreateGameBoard();
        gameBoard.populateGameBoard();

        ObstacleTest test = new ObstacleTest();
        test.passObstacleRoll(gameBoard.gameSpace);
    }
        //GameProgression runGame = new GameProgression();
        //runGame.gameProgression(gameSpace);


            Player player1 = new Player();
            //System.out.println("This is it " + gameSpace);
            /*
            while(player1.getPlayerScore() <= 5){ //|| player2Score <=11){
                GameProgression runGame2 = new GameProgression();
                runGame2.gameProgression(gameSpace);
            */
            //GameSpace = gameSpace;

        }


        /*
        while (player1.getPlayerScore() <= 5) { //|| player2Score <=11){
            GameProgression runGame2 = new GameProgression();
            runGame2.gameProgression(gameSpace);
        }
*/









