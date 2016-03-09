package diceGame;
import java.util.*;


public class ObstacleTest extends CreateGameBoard{
	String obstacle;
	int playerScore;
	double playerRoll;
		
	public void passObstacleRoll(ArrayList gameSpace){
		System.out.println("This is from obstacle class" + gameSpace);
			PlayerTurn takePlayerTurn = new PlayerTurn();
				takePlayerTurn.GivePlayerTurn(gameSpace);
			
		}
		public int smallRock(){
			playerRoll = Math.floor(Math.random()* 20 + 1);
			System.out.println("You have encountered a small rock! Roll a 4 or above to move past!");
			System.out.println("You rolled a " + playerRoll);
			if (playerRoll < 4){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 4){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore = playerScore+1;
				System.out.println("Your score is now " + playerScore);
			
			}
			return playerScore;
		}
		public int log(){
			playerRoll = Math.floor(Math.random()* 20 + 1);
			System.out.println("You have encountered a log! Roll a 8 or above to move past!");
			System.out.println("You rolled a " + playerRoll);
			if (playerRoll < 8){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 8){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore = playerScore+1;
				System.out.println("Your score is now " + playerScore);
				
			}
			return playerScore;
		}
		public int river(){
			playerRoll = Math.floor(Math.random()* 20 + 1);
			System.out.println("You have encountered a river! Roll a 12 or above to move past!");
			System.out.println("You rolled a " + playerRoll);
			if (playerRoll < 12){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 12){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore = playerScore+1;
				System.out.println("Your score is now " + playerScore);
				
			}
			return playerScore;
		}
		public int chainLinkFence (){
			playerRoll = Math.floor(Math.random()* 20 + 1);
			System.out.println("You have encountered a chain link fence! Roll a 16 or above to move past!");
			System.out.println("You rolled a " + playerRoll);
			if (playerRoll < 16){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 16){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore = playerScore+1;
				System.out.println("Your score is now " + playerScore);
				
			}
			return playerScore;
		}
		public int mountain(){
			playerRoll = Math.floor(Math.random()* 20 + 1);
			System.out.println("You have encountered a mountain! This is your final test, can you make it? Roll a 18 or above to move past!");
			System.out.println("You rolled a " + playerRoll);
			if (playerRoll < 18){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 18){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore = playerScore+1;
				System.out.println("Your score is now " + playerScore);
				
			}
			return playerScore;
		}
	
		
}

