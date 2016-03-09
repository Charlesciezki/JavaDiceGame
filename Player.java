
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
        System.out.println("This is it " + value);
        return playerRoll;
    }

}
