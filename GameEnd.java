package diceGame;

public class GameEnd {
	int player1Score; //these don't need to be here just put it for a ref
	int player2Score;
	
	public void victory(int player1Score, int player2Score){
		if (player1Score == 11 && player2Score == 11){
			System.out.println("The game is over! It's a tie!");
			System.exit(0);
			
		} else if (player1Score == 11){
			System.out.println("Player 1 wins!");
			System.exit(0);
			
		} else if (player2Score == 11){
			System.out.println("Player 2 wins!");
			System.exit(0);
			
		}
	}
}
