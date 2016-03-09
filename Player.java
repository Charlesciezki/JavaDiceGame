import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player extends Dice {

    private static final String computerName = "Computer";

    private int numberOfRolls = 0;
    private int playerScore;
    private String name;
    private boolean isTurn;
    private int playerRoll;




    public void setName(String Name){
        name = Name;
    }

    public boolean isTurn(){
        return true;
    }

    public String getName(){
        return name;
    }

    public void addScore(int Score){
        playerScore += Score;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public int getPlayerRoll(){
        return playerRoll;
    }


    public int playerRoll(int num){

        value = (int) (Math.random() * num) + 1;
        System.out.println("You rolled a " + value);
        return playerRoll;
    }

}
