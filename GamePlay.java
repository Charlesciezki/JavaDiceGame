import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay {


    private String menu;

    Scanner in = new Scanner(System.in);


    public void printMenu() {

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

    }

    public GamePlay() {

        List<String> players = new ArrayList<>();
        System.out.println("Please enter player 1: \n");
        players.add(in.nextLine());
        System.out.println("Please enter player 2: \n");
        players.add(in.nextLine());
    }







}
