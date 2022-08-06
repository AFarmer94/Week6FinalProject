package week6FinalProject;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name =  value + " of " + name;
	}
	
	public Card() {
		
	}
	
	public void setName(String name) {
		this.name = value + " of " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String describe() {
		return name + " which is worth " + value;
	}
	
}
