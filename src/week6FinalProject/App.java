package week6FinalProject;
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player("Player1");
		System.out.println("Welcome, " + player1.getName());
		Player player2 = new Player("Player2");
		System.out.println("Welcome, " + player2.getName());
		
		deck.shuffle();
		
		
		for(int i = 1; i <= 52; i++) {
			if(i % 2 != 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		//player1.describe();   I put this here to make sure that cards were being added correctly. 
		//I had an issue previously where all cards were the same, and I used this to figure that out.
		int flip1 = 0;
		int flip2 = 0;
		for(int i = 1; i <= 26; i++) {
			flip1 = player1.flip().getValue();
			flip2 = player2.flip().getValue();
			if(flip1 > flip2) {
				player1.incrementScore();
			}
			else if(flip2 > flip1) {
				player2.incrementScore();
			}
		
		}
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		}
		else if(player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins!");
		}
		else {
			System.out.println("It's a draw!");
		}

	}

}
