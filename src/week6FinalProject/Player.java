package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	
	public Player(String name) {
		this.name = name;
		setScore(0);
	}
	
	public void describe() {
		System.out.println(name + " has the following cards:");
		for(Card cards : hand) {
			System.out.println(cards.describe());
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
