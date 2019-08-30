package playerdatabase;

public class TeamDriver extends Roster {

	public static void main(String[] args) {
		
		Roster blazers = new Roster();
		System.out.println(blazers.roster);
		
		blazers.populateRoster();
		
		System.out.println(blazers.roster.size());
		System.out.println(blazers.roster);
	
		
		
		blazers.populateRosterQueue();
		
		System.out.println(blazers.rosterQueue);
		
		blazers.allShoot();
		
		blazers.allDribble();
		blazers.printNumberOfPlayers();
		
		blazers.compareAge();
		
		
		try {
			BasketballPlayer newPlayer = new BasketballPlayer 
					("John Denver", "Singer", 00, 50, true);
			System.out.println(newPlayer);
		} catch (InvalidPositionException e) {
			System.out.println("Sorry, failed to create Player");
			System.out.println("receiver: " + e.getMessage());
		}
		
	}

}
