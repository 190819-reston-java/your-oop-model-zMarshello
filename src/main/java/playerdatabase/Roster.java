package playerdatabase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;


public class Roster extends BasketballPlayer{
	
	List<BasketballPlayer> roster; //= new ArrayList<BasketballPlayer>();
	Queue<BasketballPlayer> rosterQueue; //= new LinkedList<BasketballPlayer>(roster);
	
	protected void populateRoster(){
		roster = new ArrayList<BasketballPlayer>();
		roster.add(new BasketballPlayer("Damian Lillard", "PG", 0, 29, true));
		roster.add(new BasketballPlayer("CJ McCollum", "SG", 3, 28, true));
		roster.add(new BasketballPlayer("Zach Collins", "C", 33, 21, true));
		roster.add(new BasketballPlayer("Jusuf Nurkic'", "C", 27, 24, false));
	}
	
	public void allShoot() {
		for (BasketballPlayer player: roster) {
			if (player.getName().equals("Damian Lillard")) {
				player.dismantle();
			} else {
				player.shoot();
			}
		}
	}
	
	public void allDribble() {
		for (BasketballPlayer player : roster) {
			player.dribble();
		}
	}
	
	public void populateRosterQueue() {
		rosterQueue = new LinkedList<BasketballPlayer>(roster);
		while (rosterQueue.size() > 0) {
			System.out.println("Queue size: " + rosterQueue.size());
			System.out.println("Next player: ID# " + rosterQueue.peek().playerId + " " + rosterQueue.poll());
		}
		
	}
	
	public void compareAge() {
		SortedSet<BasketballPlayer> agePlayerSet = new TreeSet<BasketballPlayer>(new PlayerComparison());
		agePlayerSet.addAll(roster);
		
		System.out.println(agePlayerSet);
	}
}