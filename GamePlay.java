import java.util.Scanner;

public class GamePlay {


    private String menu;


    public GamePlay() {

    }

    public String printMenu() {

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
        return menu;
    }


}
