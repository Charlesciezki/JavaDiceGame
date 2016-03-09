package diceGame;
import java.util.*;


public class ObstacleTest extends CreateGameBoard{
	String obstacle;
	//ArrayList<String> gameSpace = new ArrayList<>();
	int playerScore = 0;
	double playerRoll = Math.floor(Math.random()* 20 + 1);
		
	public void passObstacleRoll(ArrayList gameSpace){
		System.out.println("This is from obstacle class" + gameSpace);
			PlayerTurn takePlayerTurn = new PlayerTurn();
				takePlayerTurn.GivePlayerTurn(gameSpace);
			
		}
		public void smallRock(/*playerRoll*/){
			System.out.println("You have encountered a small rock! Roll a 4 or above to move past!");
			if (playerRoll < 4){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 4){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore ++;
			}
		}
		public void log(/*playerRoll*/){
			System.out.println("You have encountered a log! Roll a 8 or above to move past!");
			if (playerRoll < 8){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 8){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore ++;
			}
		}
		public void river(/*playerRoll*/){
			System.out.println("You have encountered a river! Roll a 12 or above to move past!");
			if (playerRoll < 12){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 12){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore ++;
			}
		}
		public void chainLinkFence (/*playerRoll*/){
			System.out.println("You have encountered a chain link fence! Roll a 16 or above to move past!");
			if (playerRoll < 16){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 16){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore ++;
			}
		}
		public void mountain(/*playerRoll*/){
			System.out.println("You have encountered a mountain! This is your final test, can you make it? Roll a 18 or above to move past!");
			if (playerRoll < 18){
				System.out.println("You didn't roll high enough to pass! You stay put.");
			} else if (playerRoll >= 18){
				System.out.println("You've gotten over! You move to the next space!");
				playerScore ++;
			}
		}
	
		
}

