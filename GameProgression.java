package diceGame;
import java.util.*;

public class GameProgression extends CreateGameBoard{
	
	public void gameProgression(ArrayList<String> gameSpace){
		System.out.println("Its so lit fam " + gameSpace);
		ObstacleTest Test = new ObstacleTest();
		for (int i=0; i < gameSpace.size(); i++){
			System.out.println(gameSpace.get(i));
			
			
			if (gameSpace.get(i)== "Small Rock"){
				Test.smallRock();
				
			} else if (gameSpace.get(i) == "Log"){
				Test.log();
				
			} else if (gameSpace.get(i) == "River"){
				Test.river();
				
			} else if (gameSpace.get(i) == "Chain Link Fence"){
				Test.chainLinkFence();
				
			} else {
				Test.mountain();
				//take to mtn
			}
		
		}
	}
}
