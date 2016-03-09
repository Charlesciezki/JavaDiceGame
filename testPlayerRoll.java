import java.util.Scanner;

public class testPlayerRoll {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Player player1 = new Player();

        System.out.println("Please enter your Name to play");

        player1.setName(in.nextLine());

        GamePlay gamePlay = new GamePlay();

        System.out.println(gamePlay.printMenu());

        System.out.println("Welcome to this random ass dice game: " + player1.getName());

        player1.playerRoll(20);

        System.out.println("You rolled a " + player1.getPlayerRoll());



    }
}
