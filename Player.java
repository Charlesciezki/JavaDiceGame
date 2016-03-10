import java.util.ArrayList;

public class Player extends Dice {
    //public ArrayList GameSpace;
    //public ArrayList<String> gameSpace = new ArrayList<>();


    private static final String computerName = "Computer";

    private int numberOfRolls = 0;
    public int player1Score;
    private int player2Score;
    private String name;
    private boolean isTurn;
    private double playerRoll;


    public void setName(String Name) {
        name = Name;
    }

    public boolean isTurn() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void addScore(int Score) {
        player1Score += Score;
    }

    public int getPlayerScore() {
        return player1Score;
    }

    public int addPlayerScore() {
        player1Score += 1;
        return player1Score;
    }

    public double getPlayerRoll() {
        return playerRoll;
    }


    public double playerRoll(double num) {

        value = (int) (Math.random() * num) + 1;
        System.out.println("You rolled a " + value);
        return playerRoll;
    }

    public void GivePlayerTurn(ArrayList gameSpace) {

        //System.out.println("This is it " + gameSpace);

        while (player1Score <= 5) { //|| player2Score <=11){
            GameProgression runGame2 = new GameProgression();
            runGame2.gameProgression(gameSpace);

            //GameSpace = gameSpace;

        }

    }
}