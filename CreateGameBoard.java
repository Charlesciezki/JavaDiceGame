package diceGame;

import java.util.*;

public class CreateGameBoard {
	String obstacle;
	ArrayList<String> gameSpace = new ArrayList<>();
	
	public void populateGameBoard() {
		for (int gamespace = 1; gamespace <= 9; gamespace++) {
			double space;
			space = Math.floor((Math.random() * 4) + 1);
			if (space == 1) {
				obstacle = "Small Rock";

			} else if (space == 2) {
				obstacle = "Log";

			} else if (space == 3) {
				obstacle = "River";

			} else {
				obstacle = "Chain Link Fence";
			}
			gameSpace.add(obstacle);
		}
		gameSpace.add("Mountain");
		System.out.print(gameSpace);
	}
}
	
	

