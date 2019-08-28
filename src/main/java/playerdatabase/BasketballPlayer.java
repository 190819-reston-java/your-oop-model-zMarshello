package playerdatabase;

import java.io.Serializable;

public class BasketballPlayer extends Player implements Serializable, Actions {

	public static int playerCount = 0;
	
	public BasketballPlayer(String name, int age, boolean active) {
		super(name, age, active);
		playerCount++;
	}
	
	public BasketballPlayer(String name, int age) {
		this(name, age, false);
	}
	
	public BasketballPlayer(String name) {
		this(name, 0);
	}
	
	public BasketballPlayer() {
		this("no name");
	}
	
	public static void printNumberOfPlayers() {
		System.out.println("There are " + playerCount + " players in the league.");
	}

	public void dribble() {
		System.out.println(this.getName() + " is dribbling the ball...");
		
	}

	public void shoot() {
		System.out.println(this.getName() + " is shooting the ball!");		
	}
	
	
	
	
}
