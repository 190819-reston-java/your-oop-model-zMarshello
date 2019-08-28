package playerdatabase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Roster {

	public static void main(String[] args) {
		myRoster();
		
	}

	private static void myRoster() {
		List<BasketballPlayer> roster = new ArrayList<BasketballPlayer>();
		roster.add(new BasketballPlayer("Damian Lillard", "PG", 0, 29, true));
		roster.add(new BasketballPlayer("CJ McCollum", "SG", 3,28, true));
		roster.add(new BasketballPlayer("Zach Collins", "C", 33, 21, true));
		roster.add(new BasketballPlayer("Jusuf Nurkic'", "C", 27, 24, false));
		
		System.out.println(roster);
		
		Queue<BasketballPlayer> rosterQueue = new LinkedList<BasketballPlayer>(roster);
		while (rosterQueue.size() > 0) {
			System.out.println("Queue size: " + rosterQueue.size());
			System.out.println("Next player: ID# " + rosterQueue.peek().playerId + " " + rosterQueue.poll());
			
		}
		
		
		for (BasketballPlayer player: roster) {
			if (player.getName().equals("Damian Lillard")) {
				player.dismantle();
			} else {
				player.shoot();
			}
		}
		
	}

}
