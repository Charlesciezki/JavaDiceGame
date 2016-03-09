import java.util.Scanner;

public class testPlayerRoll {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Player player1 = new Player();
        Dice dice = new Dice();

        System.out.println("Please enter your Name to play");

        player1.setName(in.nextLine());

        GamePlay gamePlay = new GamePlay();

        System.out.println(gamePlay.printMenu());

        System.out.println("Welcome to this random ass dice game: " + player1.getName());

        System.out.println("You have a choice to roll a 20 -- 12 -- 10 -- 8 -- 6 or 4 sided die?" + "\nPlease choose...");

        int num = in.nextInt();

        System.out.println("You are going to roll a 20 sided die");// +
        player1.playerRoll(num);


    }
}
