package week6FinalProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>();
	public Deck(){
		
		for(int i = 0 ; i < 4; i++) {
			
			switch(i){
			
			case 0:
				for(int j = 2; j <= 14; j++){
					Card card1 = new Card(j, "Hearts");
					cards.add(card1);
				}
				break;
			
			case 1:
				for(int j = 2; j <= 14; j++){
					Card card2 = new Card(j, "Clubs");
					cards.add(card2);
				}
				break;
			
			case 2:
				for(int j = 2; j <= 14; j++){
					Card card3 = new Card(j, "Spades");
					cards.add(card3);
				}
				break;
			
			case 3:
				for(int j = 2; j <= 14; j++){
					Card card4 = new Card(j, "Diamonds");
					cards.add(card4);
				}
				break;
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
