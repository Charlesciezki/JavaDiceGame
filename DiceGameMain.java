package diceGame;

public class DiceGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateGameBoard gameBoard = new CreateGameBoard();
		gameBoard.populateGameBoard();

		ObstacleTest test = new ObstacleTest();
		test.passObstacleRoll(gameBoard.gameSpace);
	}
}


